<%--
  Created by IntelliJ IDEA.
  User: brdegenaars
  Date: 2/27/13
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Post Graduation Aspirations</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
</head>
<body>
    <jsp:include page="/Page_Template/header.jsp"/>
    <div id="contentWrapper1">
        <form action="/PostGraduation" method="POST">
            <p>In order to provide more accurate results we would like to know more about your aspirations, things that you desire to have after graduation: </p>
            <p>
                1.  After graduating Neumont, what is your preferred region to live in the United States:
                <select name="regionOption">
                    // TODO: JSTL loop to generate possible regions from model
                    <c:forEach var="region" items="${regionOptions}">
                        <option>${region}</option>
                    </c:forEach>
                </select>
            </p>
            <p>
                2.  Please describe your preferred car:
                    // TODO: JSTL loop to generate possible car options from model
                    <c:forEach var="carOption" items="${carOptions}">
                        <input type="radio" name="carOptions" value="${carOption}">${carOption}</option>
                    </c:forEach>
            </p>
            <p>
                3.  Please describe your preferred house:
                <select name="housingOption">
                    // TODO: JSTL loop to generate possible housing options from model
                    <c:forEach var="housingOption" items="${housingOptions}">
                        <option>${housingOption}</option>
                    </c:forEach>
                </select>
            </p>
            <p>
                4. Please enter your desired monthly saving amount:
                <input type="text" name="monthlySavings" />
            </p>
            <input type="submit" value="Results" />
        </form>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>