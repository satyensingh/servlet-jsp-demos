
<%@ page import="com.training.model.pojo.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div><a href='#'>Logout</a></div>

<h1>Employee Id : ${ requestScope.employee.empId }</h1>
<h1>Employee name: ${ requestScope.employee.empName }</h1>
<h1>Salary : ${ requestScope.employee.salary }</h1>

</body>
</html>