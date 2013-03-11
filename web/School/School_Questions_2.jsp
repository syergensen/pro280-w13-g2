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
<body>
<jsp:include page="/Page_Template/dynamicLoanOOPBox.jsp"/>
<jsp:include page="/Page_Template/header.jsp"/>
<div align="center">
    <h1>Please continue answering.</h1>
    <h2>Loan(s) Section</h2>
    <div id ="container" align="center">
        <div id="startQrtQuestion" align="left">4) Approximately how much of your funding at Neumont is loans compared to out-of-pocket expenses?</div>
        <div id="startQrtResponse" align="left">
                Note: Left is Loan, Right is Out of Pocket
                <select name="fundingRatio">
                    <input type="range"  min="0" max="100" value="50"/>
                </select>
        </div>
        <div id="programQuestion" align="left">5) What loans do you have?</div>
        <div id="programResponse" align="left">
                <div id="loanInfoContainer">
                    <div id="loanInfo1">
                        Loan Amount:<input type="number" name="loanAmount1" value="0"/>
                        Loan Interest:<input type="number" name="loanInterest1" value="0"/>
                        First Year Monthly Payment:<input type="number" name="firstYearMonthly1" value="0"/>
                        Monthly Payment:<input type="number" name="monthlyPayment1" value="0"/></br>
                    </div>
                </div>
                <input type="button" value="Add Loan"id="addLoanButton"/>
                <input type="button" value="Remove Loan"id="removeLoanButton"/>
                </br>
                <div id="oOPInfoContainer">
                        Out of Pocket Amount:<input type="number" name="oOPAmount" value="0"/>
                </div>
        </div>
    </div>
</div>
<jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>