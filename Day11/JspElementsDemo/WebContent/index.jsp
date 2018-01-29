
<%@ page import="com.training.model.Counter" %> 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>
<%!
interface MyINterface {
   	
}
%>
<%! Counter counter = new Counter(); %>

<% int count = counter.getCount(); %>

<h1>Refresh Count is : <%=count%></h1>

</body>
</html>