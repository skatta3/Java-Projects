package com.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.model.Employee;
import com.springjdbc.model.Employee2;

public class EmployeeDao {
	
	private JdbcTemplate springJdbcTemplate;

	public EmployeeDao() {
		
	}

	public JdbcTemplate getSpringJdbcTemplate() {
		return springJdbcTemplate;
	}

	public void setSpringJdbcTemplate(JdbcTemplate springJdbcTemplate) {
		this.springJdbcTemplate = springJdbcTemplate;
	} 
	public List<Employee> getAllEmployees(){  
		 return getSpringJdbcTemplate().query("select * from employee",new ResultSetExtractor<List<Employee>>(){  		 
		     public List<Employee> extractData(ResultSet rs) throws SQLException,DataAccessException {  		      
		        List<Employee> list=new ArrayList<Employee>();  
		        while(rs.next()){  
			        Employee e=new Employee();  
			        e.setId(rs.getInt(1));  
			        e.setName(rs.getString(2));  
			        e.setSalary(rs.getInt(3));  
			        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
	  }

	public List<Employee> getAllEmployeesRowMapper(){  
		 return getSpringJdbcTemplate().query("select * from employee",new RowMapper<Employee>(){  
		    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3));  
		        return e;  
		    }  
		 });  
	} 

	public Employee2 getEmployeebyID(){  
		int empid = 102;
	    Employee2 emp  = getSpringJdbcTemplate().queryForObject(
	        "select id as empId,name as empName,salary as empSalary from employee where id = ? " , 
	        new BeanPropertyRowMapper<Employee2>(Employee2.class), empid);

	    System.out.println(emp);
	    return emp;
	  } 
	
	public Boolean insertEmployee(){  
			Employee e = new Employee();
			e.setId(117);
			e.setName("Fred");
			e.setSalary(75000);
		 return getSpringJdbcTemplate().execute("insert into employee values(?,?,?)",new PreparedStatementCallback<Boolean>(){  		 
			    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {  		              
			        ps.setInt(1,e.getId());  
			        ps.setString(2,e.getName());  
			        ps.setFloat(3,e.getSalary());  
			              
			        Boolean status = ps.execute();
		        	System.out.println("ps.execute() : " + status);
		        	 return status;  
			        
			    }  
		    });  
	  }
	
	public void updateRecord() {
		springJdbcTemplate.update("update employee set name='Mark Taylor', salary=12500 where id = 23");
		System.out.println("Record gets updated successfully");
	}
	
	public void deleteRecord() {
		springJdbcTemplate.update("delete from employee where id = 23");
		System.out.println("Record gets deleted successfully");
	}
}
