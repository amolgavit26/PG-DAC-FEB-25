<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Session ID - ${pageContext.session.id}</h5>

	<%--session.getAttribute("user_details").getName() --%>
	<h5>Hello , ${sessionScope.user_details.name}</h5>
	<%-- <%
	session.invalidate();
	%> --%>
	${pageContext.session.invalidate()}
	<h6>You have logged out....</h6>
	<h5>
		<a href="index.jsp">Visit Again</a>
	</h5>
</body>
</html>