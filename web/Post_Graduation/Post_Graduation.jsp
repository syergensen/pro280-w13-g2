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
        <form action="PostGraduation" method="POST">
            <div id="textBounds">
                <h1>Post-Graduation Aspirations</h1>
                <p>In order to provide more accurate results we would like to know more about your aspirations, things that you desire to have after graduation: </p>
                <p>
                    1.  After graduating Neumont, what is your preferred region to live in the United States:
                    <select name="regionOption">
                        <c:forEach var="region" items="${sessionScope.regionOptions}">
                            <option>${region.name}</option>
                        </c:forEach>
                    </select>
                </p>
                <p>
                    2.  Please describe your preferred car: <br/>
                    <table>
                        <tr>
                            <td>
                                <input type="radio" name="carType" value="New car">New car</option>
                            </td>
                            <td>
                                <input type="radio" name="carQuality" value="High end">High end car</option>
                            </td>
                            <td>
                                <input type="radio" name="fuelEconomy" value="Above average fuel economy">Above average fuel economy</option>
                            </td>
                        </tr>
                    <tr>
                        <td>
                            <input type="radio" name="carType" value="Used car">Used car</option>
                        </td>
                        <td>
                            <input type="radio" name="carQuality" value="Average car">Average car</option>
                        </td>
                        <td>
                            <input type="radio" name="fuelEconomy" value="Average fuel economy">Average fuel economy</option>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="radio" name="carType" value="Transit">Transit</option>
                        </td>
                        <td>
                            <input type="radio" name="carQuality" value="Below average car">Below average car</option>
                        </td>
                        <td>
                            <input type="radio" name="fuelEconomy" value="Below average fuel economy">Below average fuel economy</option>
                        </td>
                    </tr>
                    </table>
                            <br/>
                    Car interest rate: <input type="text" name="carInterestRate"/>% <br/>
                </p>
                <p>
                    3.  Please describe your preferred house:
                    <select name="housingOption">
                        <c:forEach var="housingOption" items="${sessionScope.housingOptions}">
                            <option>${housingOption.option}</option>
                        </c:forEach>
                    </select>
                </p>
                <p>
                    4. Please enter your desired monthly saving amount:
                    $<input type="text" name="monthlySavings" />
                </p>
                <input type="submit" value="Results" id="submit"/>
            </div>
        </form>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>