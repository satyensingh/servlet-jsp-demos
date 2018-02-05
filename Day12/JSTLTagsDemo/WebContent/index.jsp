<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
for(String name : names){

}
 -->
	<h1>
		<c:out value="${message}" />
	</h1>
	<c:if test="${names.size() > 0 }">
		<ul>
			<c:forEach var="name" items="${requestScope.names }">
				<c:choose>
					<c:when test="${name eq 'Satyen'}">
						<li>${name} is a Trainer</li>		
					</c:when>
					<c:when test="${name eq 'Vikram'}">
						<li>${name} is a Marketing Executive</li>		
					</c:when>
					<c:when test="${name eq 'Dinesh'}">
						<li>${name} is a Merchant Navy</li>		
					</c:when>
					<c:otherwise>
						<li>${name}</li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</ul>
	</c:if>





</body>
</html>