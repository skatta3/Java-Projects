<%@ page import = "java.sql.*" %> 
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
<script>
myApp = angular.module('myApp',[]);

<%
			Class.forName("com.mysql.jdbc.Driver");
			String dbUsername = "root";
			String dbPassword = "admin";
			Connection conn = DriverManager.getConnection("jdbc:mysql:// localhost:3306/training", dbUsername,
					dbPassword);
			Statement stmt = conn.createStatement();
			String sql = "select rollno,firstname,lastname,age,standard from student";
			ResultSet rs = stmt.executeQuery(sql);
			try {
				if (rs != null) {
%> 
// JS code 
myApp.controller('empCtl',function($scope) 
   {
    $scope.empData = [
<%
    rs.next();
    while(true)
    {
%> 
     {"rollno":"<%=rs.getInt("rollno")%>","firstname":"<%=rs.getString("firstname")%>","lastname":"<%=rs.getString("lastname")%>","age":"<%=rs.getInt("age")%>","standard":"<%=rs.getString("standard")%>"}
   
     <%if(rs.next()) {%> , <% } else break;
    }
   } 
  }
 catch(SQLException e) 
 {
  e.printStackTrace();
 }
 stmt.close();
 rs.close();
 conn.close();
 stmt=null;
 rs=null;
 conn=null;
%>
         ];
 $scope.sortField='firstname';
 $scope.reverse=true;
}); 
</script>
</head>
<body ng-controller="empCtl">
 Search: <input ng-model="query" type="text" />
<table border=1 cellpadding=5>
 <tr>
  <th><a href="" ng-click="sortField = 'rollno'; reverse=!reverse">Roll No</a></th>
  <th><a href="" ng-click="sortField = 'firstname'; reverse=!reverse">First Name</a></th>
  <th>Last Name</th><th>Age</th><th>Standard</th></tr> 
  <tr ng-repeat="emp in empData | filter:query | orderBy:sortField:reverse">
  
  <td>{{emp.rollno}}</td>
  <td>{{emp.firstname}}</td>
  <td>{{emp.lastname}}</td>
  <td>{{emp.age}}</td>
  <td>{{emp.standard}}</td> 
 </tr>
</table>
</body>
</html>