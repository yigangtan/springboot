<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <c:forEach items="${requestScope.list}" var="user">
        id:${user.id}&nbsp
        username:${user.username}&nbsp
        password:${user.password}&nbsp
        birthyday:${user.birthyday}<br>
    </c:forEach>
</body>
</html>
