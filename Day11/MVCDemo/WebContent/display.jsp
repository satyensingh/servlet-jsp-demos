
<%@ page import="com.training.model.pojo.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	Employee employee = (Employee) request.getAttribute("employee");
%>

<div><a href='Logout.mvc'>Logout</a></div>

<h1>Employee Id : <%=employee.getEmpId() %></h1>
<h1>Employee name: <%=employee.getEmpName() %></h1>
<h1>Salary : <%=employee.getSalary() %></h1>

</body>
</html>