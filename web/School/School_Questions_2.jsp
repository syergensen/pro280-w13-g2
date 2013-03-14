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
    <title>Jabberwocky - Loans</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
    <script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
</head>
<body>
<jsp:include page="/jscript/dynamicLoanOOPBox.jsp"/>
<jsp:include page="/Page_Template/header.jsp"/>
<div id="contentWrapper1">
<form action="SchoolLoan" method="POST">
    <div id="textBounds" class="xw">
        <h1>Please continue answering.</h1>
        <h2>Loan(s) Section</h2>
        <div id ="container" align="center">
            <p>
                <div id="startQrtQuestion" align="left">
                    4) Approximately how much of your funding at Neumont is loans compared to out-of-pocket expenses?
                </div>
            </p>
            <div id="startQrtResponse" align="left">
                    Note: Left is Loan, Right is Out of Pocket</br>
                    <div name="fundingRatio">
                        <input name="slider" id="slider" type="range"  min="0" max="100" value="50" step="25" onchange="showFundingRatio(this.value)"/>
                        <span id="fundingRatioValue">50/50</span>
                    </div>
            </div>
            <p>
                <div id="programQuestion" align="left">
                    5) What loans do you have?
                </div>
            </p>
                <div id="programResponse" align="left">
                    <div id="loanInfoContainer">
                        <div id="loanInfo1">
                            Loan Amount:<input type="number" name="loanAmount" value="0"/>
                            Loan Interest:<input type="number" name="loanInterest" value="0"/>
                            First Year Monthly Payment:<input type="number" name="firstYearMonthly" value="0"/>
                            Monthly Payment:<input type="number" name="monthlyPayment" value="0"/></br>
                        </div>
                    </div>
                    <input type="button" value="Add Loan"id="addLoanButton"/>
                    <input type="button" value="Remove Loan"id="removeLoanButton"/>
                    </br>
                    <p>
                        <div id="oOPInfoContainer">
                                Out of Pocket Amount:<input type="number" name="oOPAmount" value="0"/>
                        </div>
                    </p>
                </div>
        </div>
    <input type="submit" value="Next"/>
    </div>
</form>
</div>
<jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>
<script>
    function showFundingRatio(loanAmount){
        var loanAmountValue = loanAmount.valueOf()
        document.getElementById("fundingRatioValue").innerHTML = loanAmount + "/" + (100-loanAmountValue).toString();

        if(loanAmountValue == 0){

        }
    }
</script>