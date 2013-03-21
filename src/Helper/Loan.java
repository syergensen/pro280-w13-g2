package Helper;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/11/13
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Loan {
    /*
        4 vars
        Gets/Sets
     */
    int loanAmount;
    double interest;
    int monthlyPayment;

    public Loan(int loanAmt, int interestPercent){
        this.loanAmount = loanAmt;
        this.interest = interestPercent;
        setMonthlyPayment();
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest/100;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    private void setMonthlyPayment() {
        double monthlyInterest = interest/12;
        double temp = 1 + monthlyInterest;
        double calculatedNum = Math.pow(temp, -120);
        double oppositeCalNum = 1 - calculatedNum;
        double payment = loanAmount * monthlyInterest;
        double monthlyPayment = (payment / oppositeCalNum);
        this.monthlyPayment = (int) monthlyPayment;
    }
}
