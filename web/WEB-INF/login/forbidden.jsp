<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OOPS!</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
</head>
<body>
    <div id="contentWrapper1">
        <h1>Sorry!</h1>
        <p>You are not allowed to visit this page!</p>
        <p>Perhaps you'd like to change your login?</p>
        <c:url var="Relogin" value="/Start" />
        <form method="POST" action="${Relogin }">
            User Name: <input type="text" name="username" /><br /> Password: <input type="password" name="password" /><br /> <input
                type="hidden" name="redirect"
                value="${requestScope['javax.servlet.error.request_uri']}<c:if test="${ !empty pageContext.request.queryString }">?${pageContext.request.queryString }</c:if>">
            <input type="submit" value="Login" />
        </form>
    </div>
</body>
</html>