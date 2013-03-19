<script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script language="JavaScript" type="text/javascript">
    var loanCounter = 2;
    $(document).ready(function(){

        $("#addLoanButton").click(function() {
            if(loanCounter > 5){
                alert("Only 5 Loans Allowed");
                return false;
            }

            var newTextBoxDiv = $(document.createElement('div')).attr("id", 'loanInfo' + loanCounter);

            newTextBoxDiv.after().html(
                    'Loan Amount:'+'<input type="number" name="loanAmount" id="loanAmount" value="0"/> ' +
                            'Loan Interest:'+'<input type="number" name="loanInterest" id="loanInterest" value="0"/> ' +
                            'Monthly Payment:'+'<input type="number" name="monthlyPayment" id="monthlyPayment" value="0">'+"</br>");

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