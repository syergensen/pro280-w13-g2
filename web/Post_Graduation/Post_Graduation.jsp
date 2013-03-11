<%--
  Created by IntelliJ IDEA.
  User: brdegenaars
  Date: 2/27/13
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post Graduation Aspirations</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
</head>
<body>
    <jsp:include page="/Page_Template/header.jsp"/>
    <form action="/PostGraduation" method="POST">
        <p>In order to provide more accurate results we would like to know more about your aspirations, things that you desire to have after graduation: </p>
        <p>
            1.  After graduating Neumont, what is your preferred region to live in the United States:
            <select name="regionOption">
                // TODO: JSTL loop to generate possible regions from model
            </select>
        </p>
        <p>
            2.  Please describe your preferred car:
            <select name="carOption">
                // TODO: JSTL loop to generate possible car options from model
            </select>
        </p>
        <p>
            3.  Please describe your preferred house:
            <select name="housingOption">
                // TODO: JSTL loop to generate possible housing options from model
            </select>
        </p>
        <p>
            4. Please enter your desired monthly saving amount:
            <input type="text" name="monthlySavings" />
        </p>
        <input type="submit" value="Results" />
    </form>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>