    <%--
  Created by IntelliJ IDEA.
  User: Sean
  Date: 2/28/13
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jabberwocky</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
    <script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
</head>
<body >
    <jsp:include page="/Page_Template/dynamicExtendedStay.jsp"/>
    <jsp:include page="/Page_Template/header.jsp"/>
    <div id="contentWrapper1">

    <form action="/SchoolEnrollment" method="POST">
    <div align="center">
       <h1>Welcome to Project Jabberwocky</h1>
       <h2>Enrollment Section:</h2>
       <div id ="container" align="center">
       		<div id="startQrtQuestion" align="left">1) When did you first arrive at Neumont?</div>
            <div id="startQrtResponse" align="left">
                <select name="quarterStart">
                    <option value="summer">Summer Quarter</option>
                    <option value="fall">Fall Quarter</option>
                </select>
                <!--Static values for now, will be filled in by database entries later-->
            </div>
            <div id="programQuestion" align="left">2) What program are you taking?</div>
            <div id="programResponse" align="left">
                <select name="programSelect">
                <option value="bscs">BSCS</option> 
                <option value="bstm">BSTM</option>
                <option value="bsgd">BSGD</option>
                <option value="bswd">BSWD</option>
                </select>
                <!--Static values for now, will be filled in by database entries later-->
            </div>
            <div id="extendedQuestion" align="left">3) Will you be staying extra quarters?</div>
            <div id="extendedResponse" align="left">
                   <div name="extendedStayResponses">
                       <input type="checkbox" name="extendedStay" id="extendedStay"/>Yes
                   </div></br>
                   <div id="extendedFullTime" style="display:none">
                       Full Time:<select name="extraFullQuarters" selected="1">
                           <option value="0">0</option>
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
                       Part Time:<select name="extraPartQuarters" selected="0">
                           <option value="0">0</option>
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
      </div>
    </div>
        <input type="submit" value="Next" />
    </form>
        </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>