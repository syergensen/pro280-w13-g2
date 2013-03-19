<%--
  Created by IntelliJ IDEA.
  User: Sean
  Date: 2/28/13
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
                            Loan Amount:<input type="number" id="loanAmount" name="loanAmount" value="0" min="0" onkeypress="return isNumberEntry(event)"/>
                            Loan Interest:<input type="number" id="loanInterest" name="loanInterest" value="0" min="0" onkeypress="return isNumberEntry(event)"/>
                            Monthly Payment:<input type="number" id="monthlyPayment" name="monthlyPayment" value="0" min="0" onkeypress="return isNumberEntry(event)"/></br>
                        </div>
                    </div>
                    <input type="button" value="Add Loan"id="addLoanButton"/>
                    <input type="button" value="Remove Loan"id="removeLoanButton"/>
                    </br>
                    <p>
                        <div id="oOPInfoContainer">
                                Out of Pocket Amount:<input type="number" id="oOPAmount"  name="oOPAmount" value="0" min="0" onkeypress="return isNumberEntry(event)"/>
                        </div>
                    </p>
                </div>
        </div>
    <input type="submit" value="Next" id="submitButton" />
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

        var loanAmounts = document.getElementsByName("loanAmount");
        var numAmount = loanCounter;
        if(loanAmountValue == 0){
            //Do nothing to the loans.
            document.getElementById("oOPAmount").disabled = true;
        }
        if (loanAmountValue == 100){
            for(var i = numAmount; i > 1; i--){
                $("#loanInfo" + i).remove();
            }
            loanCounter = 2;
            document.getElementById("loanAmount").disabled = true;
            document.getElementById("loanInterest").disabled = true;
            document.getElementById("monthlyPayment").disabled = true;
            document.getElementById("addLoanButton").disabled = true;
            document.getElementById("removeLoanButton").disabled = true;
            document.getElementById("oOPAmount").disabled = false;
        }
        if(loanAmountValue != 0 && loanAmountValue != 100){
            document.getElementById("loanAmount").disabled = false;
            document.getElementById("loanInterest").disabled = false;
            document.getElementById("monthlyPayment").disabled = false;
            document.getElementById("addLoanButton").disabled = false;
            document.getElementById("removeLoanButton").disabled = false;
            document.getElementById("oOPAmount").disabled = false;
        }
    }

    function isNumberEntry(evt){
        var charCode = (evt.which) ? evt.which : event.keyCode
        if(charCode > 31 && (charCode < 48 || charCode > 57))
            return false;
        return true;
    }
</script>