<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Student Registration Form</h2>
<hr />
<body>
	<form action="" method="POST">
		<pre>
		sName <input type="text" name="sName" />
		sBranch<input type="text" name="sBranch" />
		sCollege<input type="text" name="sCollege" />
		<input type="submit" value="Register" />
	</pre>
	</form>
     
	<div>
		<Table>
		<tr><td>S.NO</td><td>sName</td> <td>sBranch</td> <td>sCollege</td></tr>
		 <c:forEach items="${list}" var="item">
			<tr><td>${item.sid}</td><td>${item.sName}</td> <td>${item.sBranch}</td> <td>${item.sCollege}</td></tr>
		 </c:forEach>
		
		</Table>

	</div>
</html>