    <%--
  Created by IntelliJ IDEA.
  User: Sean
  Date: 2/28/13
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Jabberwocky - Enrollment</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
    <script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
</head>
<body >
    <jsp:include page="/jscript/dynamicExtendedStay.jsp"/>
    <jsp:include page="/Page_Template/header.jsp"/>
    <div id="contentWrapper1">
    <form action="SchoolEnrollment" method="POST">
        <div id="textBounds">
            <h1>Enrollment Information</h1>
            <p>
                <div id="startQrtQuestion" align="left">
                    1) When did you first arrive at Neumont?
                </div>
            </p>
            <div id="startQrtResponse" align="left">
                <select name="quarterStart">
                    <option value="summer">Summer Quarter</option>
                    <option value="fall" selected="selected">Fall Quarter</option>
                </select>
                <select name="yearStart">
                    <c:forEach var="i" begin="2008" end="2013" step="1">
                        <option value="${i}"<c:if test="${i - 2008 == 0})"> selected="selected" </c:if>>${i}</option>
                    </c:forEach>
                </select>
            </div>
            <p>
                <div id="programQuestion" align="left">
                    2) What program are you taking?
                </div>
            </p>
            <div id="programResponse" align="left">
                <select name="programSelect">
                    <option value="bscs" selected="selected">BSCS</option>
                    <option value="bstm">BSTM (BTOM)</option>
                    <option value="bsgd">BSGD</option>
                    <option value="bswd">BSWD</option>
                </select>
            </div>
            <p>
                <div id="extendedQuestion" align="left">
                    3) Will you be staying extra quarters?
                </div>
            </p>
            <div id="extendedResponse" align="left">
                   <div name="extendedStayResponses">
                       <input type="checkbox" name="extendedStay" id="extendedStay"/>Yes
                   </div></br>
                   <div id="extendedFullTime" style="display:none">
                       Full Time:<select name="extraFullQuarters">
                           <option value="0" selected="selected">0</option>
                           <option value="1">1</option>
                           <option value="2">2</option>
                           <option value="3">3</option>
                           <option value="4">4</option>
                           <option value="5">5</option>
                           <option value="6">6</option>
                           <option value="7">7</option>
                           <option value="8">8</option>
                           <option value="9">9</option>
                           <option value="10">10</option>
                       </select>(Taking 12 Credits or More)
                   </div></br>
                   <div id="extendedPartTime" style="display:none">
                       Part Time:<select name="extraPartQuarters">
                           <option value="0" selected="selected">0</option>
                           <option value="1">1</option>
                           <option value="2">2</option>
                           <option value="3">3</option>
                           <option value="4">4</option>
                           <option value="5">5</option>
                           <option value="6">6</option>
                           <option value="7">7</option>
                           <option value="8">8</option>
                           <option value="9">9</option>
                           <option value="10">10</option>
                       </select>
                   </div>
            </div>
            <input type="submit" value="Next" />
        </div>
    </form>
        </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>