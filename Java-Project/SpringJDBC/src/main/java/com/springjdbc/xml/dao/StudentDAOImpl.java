package com.springjdbc.xml.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springjdbc.xml.Student;
import com.springjdbc.xml.resultsetextractor.StudentResultSetExtractor;

public class StudentDAOImpl implements StudentDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   public void create(Student student) {
      String SQL = "insert into Student (name, age) values (?, ?)";
      System.out.println("Created Record Name = " + student.getName() + " Age = " + student.getAge());
   
      Object[] args = {student.getName(),student.getAge()};
      jdbcTemplateObject.update( SQL,args);
      System.out.println("Created Record Name = " + student.getName() + " Age = " + student.getAge());
    }
   public boolean deleteRecordbyRollNo(int id) {
		String sql = "DELETE FROM Student where id = ?";
		int rowsDeleted = jdbcTemplateObject.update(sql,id);
		
		if(rowsDeleted >0) {
			System.out.println("No of Rows deleted: " + rowsDeleted);
			return true;
		}			
		else
			return false;
	}
   
   public List<Student> listStudents() {
      String SQL = "select * from Student";
//      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
      List <Student> students = jdbcTemplateObject.query(SQL, new BeanPropertyRowMapper<Student>(Student.class));

      return students;
   }
   
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * ResultSetExtractor
	 */
	public List<Student> findByStudentByName(String name) {
		String sql = "select * from student where name =?";
		
		List <Student> students = jdbcTemplateObject.query(sql, new StudentResultSetExtractor(),name);
		return students;
	}

	@Transactional
	public int batchUpdateStudent(final List<Student> studentList) {
		int updatedRowCount=0;
		
		String sql = "update student set name=?, age=? where id =?";
		int[] batchUpdate = jdbcTemplateObject.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				ps.setString(1, studentList.get(index).getName());
				ps.setInt(2, studentList.get(index).getAge());
				ps.setInt(3, studentList.get(index).getId());	
				System.out.println("Inside setValues method");
			}
			
			public int getBatchSize() {
				System.out.println("Inside getBatchSize() method");
				return studentList.size();
			}
		});

	
		for(int i=0; i<batchUpdate.length;i++) {
			if(batchUpdate[i] == 1) {
				updatedRowCount++;
			}
		}
		return updatedRowCount;
	}
}