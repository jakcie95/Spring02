<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  1111111111111111111111111
</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

path : <%=request.getContextPath() %><br>

path : ${contextPath }<br>


<!-- 편한 방법 사용 -->
<img src="${contextPath }/resources/images/img.jpg" width="100" height="100">
<img src='<c:url value="/img/img.jpg" />' width="100" height="100">
</body>
</html>
