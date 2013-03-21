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

    public int monthlySalary;

    public int monthlyFedTax;

    public double fedTaxPercent = .0565;

    public int carPayment;

    public int mortgage;

    public int rent;

    public int utilities;

    public int schoolLoanAmt;

    public int otherLoans;

    public int schoolLoanMonthPay;

    public int outOfPocket;

    private int quarterTuition = 7200;
    private int interest = 6;

    public int getSchoolLoanAmt() {
        return schoolLoanAmt;
    }

    public void setSchoolLoanAmt(int fullQtr, int partQtr) {
        this.schoolLoanAmt =  (quarterTuition * fullQtr) + ((quarterTuition/2) * partQtr);
    }

    public int getOtherLoans()
    {
        return otherLoans;
    }

    public void setOtherLoans(int additionalLoanAmt)
    {
        this.otherLoans = additionalLoanAmt;
    }

    public int getSchoolLoanMonthPay()
    {
        return schoolLoanMonthPay;
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
    //Call after setSchoolLoanAmt
    public void setSchoolLoanMonthPay()
    {
        double monthlyInterest = (interest/100)/12;
        double temp = 1 + monthlyInterest;
        double calculatedNum = Math.pow(temp, -120);
        double oppositeCalNum = 1 - calculatedNum;
        double payment = schoolLoanAmt * monthlyInterest;
        double monthlyPayment = (payment / oppositeCalNum);
        schoolLoanMonthPay = (int) monthlyPayment;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getMonthlySalarySalary()
    {
        return monthlySalary;
    }
    //From StudentInformation
    public void setMonthlySalary(int salary)
    {
        int temp = salary;
        this.monthlySalary = salary/12;
    }

    public int getMonthlyFedTax()
    {

        return monthlyFedTax;
    }

    public void setMonthlyFedTax(int salaryAmt)
    {
        int temp = salaryAmt/12;
        double monthlyFedTax = temp * fedTaxPercent;
        this.monthlyFedTax = (int) monthlyFedTax;
    }

    public double getFedTaxPercent() {
        return fedTaxPercent;
    }

    public void setFedTaxPercent(double fedTaxPercent) {
        double temp = fedTaxPercent/100;
        this.fedTaxPercent = temp;
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
