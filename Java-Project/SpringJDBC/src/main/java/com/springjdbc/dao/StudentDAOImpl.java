package com.springjdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.api.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

	public void insert(Student student) {
		String sql = "INSERT INTO Student VALUES(?,?,?,?,?)";
		
		Object[] arg = {student.getRollno(),student.getFirstname(),student.getLastname(),student.getAge(),student.getStandard()};
		
		int rowsInserted = jdbcTemplate.update(sql,arg);
		System.out.println("Number of rows inserted: " + rowsInserted);
	}
	
	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/training?useSSL=false";
		String username = "root";
		String password = "admin";
		DataSource dataSource = new DriverManagerDataSource(url,username,password);
		
		return dataSource;
	}

}
