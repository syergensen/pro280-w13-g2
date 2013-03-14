package Helper;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/11/13
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class InputChecker {
    public InputChecker(){}
    //
    public boolean isValidLoanAmt(Double loanAmount){
        if(loanAmount == null || loanAmount.equals(null) || loanAmount.equals(""))
        {
            return false;
        }
        if(loanAmount <=0)
        {
            return false;
        }
        return true;
    }
    //cant be zero or over 100
    public boolean isValidLoanInt(double interest){
        Double interestOnLoan = interest;
        if(interestOnLoan == null || interestOnLoan.equals(null) || interestOnLoan.equals(""))
        {
            return false;
        }
        if(interest <=0 || interest >100)
        {
            return false;
        }
        return true;
    }
    //not zero min $50
    public boolean checkMonthlyPayment(Double monthly){
        if(monthly == null || monthly.equals(null) || monthly.equals(""))
        {
            return false;
        }
        if(monthly <= 0 || monthly < 50)
        {
            return false;
        }
        return true;
    }
}
