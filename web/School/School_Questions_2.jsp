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
          href="${pageContext.request.contextPath}/resources/neumont.css" />
</head>
<body>
<jsp:include page="/Page_Template/header.jsp"/>
<div align="center">
    <h1>Please continue answering.</h1>
    <h2>Loan(s) Section</h2>
    <div id ="container" align="center">
        <div id="startQrtQuestion" align="left">4) Approximately how much of your funding at Neumont is loans compared to out-of-pocket expenses?</div>
        <div id="startQrtResponse" align="left">
            <form action="">
                Note: Left is Loan, Right is Out of Pocket
                <select name="fundingRatio">
                    <input type="range"  min="0" max="100" value="50"/>
                </select>
            </form>
            <!--Static values for now, will be filled in by database entries later-->
        </div>
        <div id="programQuestion" align="left">5) What loans do you have?</div>
        <div id="programResponse" align="left">
            Loan Amount:
            <form action="">
                <select name="loanInput">
                    <input type="number" name="loanAmount" value="0"/> Loan Interest:<input type="number" name="loanInterest" value="0"/> Finance Duration:<input type="number" name="payoffDuration" value="0"/> </br>
                </select> <button type="button" onclick="">Add</button>
                <%--Need java script to add in more inputs--%>
            </form></br>
            Out of Pocket Amount:<form action="">
                <select name="oOPInput">
                   <input type="number" name="oOPAmount" value="0"/>
                </select> <button type="button" onclick="">Add</button>
            </form>
        </div>
    </div>
</div>
<jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>