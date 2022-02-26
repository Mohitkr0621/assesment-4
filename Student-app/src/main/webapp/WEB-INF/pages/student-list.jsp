<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="nis" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> list</title>
</head>
<body>

  <h2 align="center">student list</h2>
  
  
  <table border="4px" >
    <thead>
      <tr>

        <th>Student Id</th>
        <th>Name</th>
        <th>DOB</th>      
      </tr>       
    </thead>
     <tbody>
        <nis:forEach items="${STUDENTS}" var="map">
           <tr>
						
						<td>${map.value.getStudentId() }</td>
						<td>${map.value.getStudentName() }</td>
						<td>${map.value.getDob() }</td>
					</tr>        
        </nis:forEach>  
     </tbody>
  </table>
  
  <h3><a href="go-home">Home Page</a></h3>
</body>
</html>