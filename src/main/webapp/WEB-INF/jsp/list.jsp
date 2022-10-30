<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
list:
<c:forEach items="${requestScope.list}" var="account">
    <div>${account.name}</div>
</c:forEach>
</body>
</html>