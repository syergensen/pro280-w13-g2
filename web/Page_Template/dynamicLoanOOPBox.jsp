<script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script language="JavaScript" type="text/javascript">
    $(document).ready(function(){
        var loanCounter = 2;

        $("#addLoanButton").click(function() {
            if(loanCounter > 5){
                alert("Only 5 Loans Allowed");
                return false;
            }

            var newTextBoxDiv = $(document.createElement('div')).attr("id", 'loanInfo' + loanCounter);

            newTextBoxDiv.after().html(
                    'Loan Amount:'+'<input type="number" name="loanAmount' + loanCounter + '" value="0"/>' +
                            'Loan Interest:'+'<input type="number" name="loanInterest' + loanCounter + 'value="0"/>' +
                            'First Year Monthly Payment:'+'<input type="number" name="firstYearMonthly'+loanCounter+'value="0"/>'+
                            'Monthly Payment:'+'<input type="number" name="monthlyPayment'+loanCounter+'value="0">'+"</br>");

            newTextBoxDiv.appendTo("#loanInfoContainer");

            loanCounter++;
        });

        $("#removeLoanButton").click(function () {
            if(loanCounter==2){
                alert("No more extra textbox to remove");
                return false;
            }

            loanCounter--;

            $("#loanInfo" + loanCounter).remove();

        });
    });
</script>