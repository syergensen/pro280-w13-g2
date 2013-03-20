package Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentResults
{
    public String userName;

    public int salary;

    public int fedTax;

    public int healthInsurance;

    public int miscInsurance;

    public int carPayment;

    public int mortgage;

    public int rent;

    public int utilities;

    public int totalLoans;

    public int loanMonthly;

    public int outOfPocket;

    private int quarterTuition = 7200;
    private int interest = 6;

    public int getTotalLoans()
    {
        return totalLoans;
    }

    public void setTotalLoans(int fullQtr, int partQtr, int additionalLoan)
    {
        this.totalLoans = (quarterTuition * fullQtr) + ((quarterTuition/2) * partQtr) + additionalLoan;
    }

    public int getLoanMonthly()
    {
        return loanMonthly;
    }

    /*
        http://www.ehow.com/how_6233951_calculate-student-loan-payment.html
        interest = 6%

        .06/12 = .005 = monthlyInterest

        1+.005 = 1.005

        1.005^(-120) = .5496327

        1 - .5496327 = .4503672

        LoanAmt * .005 = someNum

        someNum / .4503672 = monthlyPayment + additionalLoanMonthlyPayment
     */
    //Call after totalloans is calculated, and totalloan in
    public void setLoanMonthly(int loanAmt, int additionalMonthlyPayment)
    {
        double monthlyInterest = (interest/100)/12;
        double temp = 1 + monthlyInterest;
        double calculatedNum = Math.pow(temp, -120);
        double oppositeCalNum = 1 - calculatedNum;
        double payment = loanAmt * monthlyInterest;
        double monthlyPayment = (payment / oppositeCalNum);
        loanMonthly = ((int) monthlyPayment + additionalMonthlyPayment);
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getFedTax()
    {
        return fedTax;
    }

    public void setFedTax(int fedTax)
    {
        this.fedTax = fedTax;
    }

    public int getHealthInsurance()
    {
        return healthInsurance;
    }

    public void setHealthInsurance(int healthInsurance)
    {
        this.healthInsurance = healthInsurance;
    }

    public int getMiscInsurance()
    {
        return miscInsurance;
    }

    public void setMiscInsurance(int miscInsurance)
    {
        this.miscInsurance = miscInsurance;
    }

    public int getCarPayment()
    {
        return carPayment;
    }

    public void setCarPayment(int carPayment)
    {
        this.carPayment = carPayment;
    }

    public int getMortgage()
    {
        return mortgage;
    }

    public void setMortgage(int mortgage)
    {
        this.mortgage = mortgage;
    }

    public int getRent()
    {
        return rent;
    }

    public void setRent(int rent)
    {
        this.rent = rent;
    }

    public int getUtilities()
    {
        return utilities;
    }

    public void setUtilities(int utilities)
    {
        this.utilities = utilities;
    }
}
