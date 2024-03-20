package com.springjdbc.xml.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springjdbc.xml.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>>{

	public List<Student> extractData(ResultSet res) throws SQLException, DataAccessException {
		List<Student> studentList = new ArrayList<Student>();
		while(res.next()) {
			Student student = new Student();
			
			student.setId(res.getInt("id"));
			student.setName(res.getString("name"));
			student.setAge(res.getInt("age"));
			
			studentList.add(student);
	
		}
		return studentList;
	}

}
