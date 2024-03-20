package denote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/denote";
	private String dbUname = "root";
	private String dbPassword = "admin";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	
	public Connection getConnection() throws ClassNotFoundException {
		Connection con = null;
		try {
			Class.forName(dbDriver);
		
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert()  {
	
		String result = "Data entered successfully";
		String sql = "insert into user(name,password,email,phoneno) values(?,?,?,?)";
		
		Member user = new Member("Srinivas","Welcome","skatta3@yahoo.com","6766432478787");
		PreparedStatement ps;
		try {
			Connection con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getname());
			ps.setString(2, user.getpassword());
			ps.setString(3, user.getemail());
			ps.setString(4, user.getphoneno());
			int status = ps.executeUpdate();
			System.err.println("Query Execution Status: " + status);
		} catch (Exception e) {
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}
	
	public static void main(String[] args) {
		RegisterDao dao = new RegisterDao();
		
		String insertStatus = dao.insert();
				
		System.out.println(insertStatus);
	}
}