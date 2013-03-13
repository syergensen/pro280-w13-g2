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
    public boolean checkLoanAmount(Double loanAmount){
        if(loanAmount == null || loanAmount.equals(null) || loanAmount.equals(""))
        {
            return false;
        }
        if(loanAmount <0)
        {
            return false;
        }
        return true;
    }
    //cant be zero or over 100
    public boolean checkLoanInterest(double interest){
        Double interestOnLoan = interest;
        if(interestOnLoan == null || interestOnLoan.equals(null) || interestOnLoan.equals(""))
        {
            return false;
        }
        if(interest <0 && interest >100)
        {
            return false;
        }
        return true;
    }
    /*
    public boolean checkFirstYearMonthlyPayment(Double yearly){
        if(yearly == null || yearly.equals(null) || yearly.equals(""))
        {
            return false;
        }
        if(yearly < 0)
        {
            return false;
        }
        return true;
    }
    */
    //not zero min $50
    public boolean checkMonthlyPayment(Double monthly){
        if(monthly == null || monthly.equals(null) || monthly.equals(""))
        {
            return false;
        }
        if(monthly < 0)
        {
            return false;
        }
        return true;
    }

    public boolean checkOOPAmount(Double OOPAmount) //out of pocket
    {
        if(OOPAmount == null || OOPAmount.equals("") || OOPAmount.equals(null))
        {
            return false;
        }
        if(OOPAmount < 0)
        {
            return false;
        }
        return true;
    }
}
