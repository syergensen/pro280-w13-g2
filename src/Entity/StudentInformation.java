package Entity;

import Helper.Loan;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentInformation
{

    private String userName;

    private String password;

    private String enrollQuarter;

    private String program;

    private int extraPartTime;

    private int extraFullTime;

    private int pocketRatio;

    private int loanRatio;

    private double creditCardDebt;

    private double medicalDebt;

    private double otherLoanDebt;

    private String preferredRegion;

    private String preferredCar;

    private String preferredHousing;

    private double monthlyRent;

    private double monthlyUtilities;

    private ArrayList<Loan> studentLoans = new ArrayList<Loan>();

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEnrollQuarter()
    {
        return enrollQuarter;
    }

    public void setEnrollQuarter(String enrollQuarter)
    {
        this.enrollQuarter = enrollQuarter;
    }

    public String getProgram()
    {
        return program;
    }

    public void setProgram(String program)
    {
        this.program = program;
    }

    public int getExtraPartTime()
    {
        return extraPartTime;
    }

    public void setExtraPartTime(int extraPartTime)
    {
        this.extraPartTime = extraPartTime;
    }

    public int getExtraFullTime()
    {
        return extraFullTime;
    }

    public void setExtraFullTime(int extraFullTime)
    {
        this.extraFullTime = extraFullTime;
    }

    public int getPocketRatio()
    {
        return pocketRatio;
    }

    public void setPocketRatio(int pocketRatio)
    {
        this.pocketRatio = pocketRatio;
    }

    public int getLoanRatio()
    {
        return loanRatio;
    }

    public void setLoanRatio(int loanRatio)
    {
        this.loanRatio = loanRatio;
    }

    public double getCreditCardDebt()
    {
        return creditCardDebt;
    }

    public void setCreditCardDebt(double creditCardDebt)
    {
        this.creditCardDebt = creditCardDebt;
    }

    public double getMedicalDebt()
    {
        return medicalDebt;
    }

    public void setMedicalDebt(double medicalDebt)
    {
        this.medicalDebt = medicalDebt;
    }

    public double getOtherLoanDebt()
    {
        return otherLoanDebt;
    }

    public void setOtherLoanDebt(double otherLoanDebt)
    {
        this.otherLoanDebt = otherLoanDebt;
    }

    public String getPreferredRegion()
    {
        return preferredRegion;
    }

    public void setPreferredRegion(String preferredRegion)
    {
        this.preferredRegion = preferredRegion;
    }

    public String getPreferredCar()
    {
        return preferredCar;
    }

    public void setPreferredCar(String preferredCar)
    {
        this.preferredCar = preferredCar;
    }

    public String getPreferredHousing()
    {
        return preferredHousing;
    }

    public void setPreferredHousing(String preferredHousing)
    {
        this.preferredHousing = preferredHousing;
    }

    public double getMonthlyRent()
    {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent)
    {
        this.monthlyRent = monthlyRent;
    }

    public double getMonthlyUtilities()
    {
        return monthlyUtilities;
    }

    public void setMonthlyUtilities(double monthlyUtilities)
    {
        this.monthlyUtilities = monthlyUtilities;
    }

    public ArrayList<Loan> getStudentLoans() {
        return studentLoans;
    }

    public void setStudentLoans(ArrayList<Loan> studentLoans) {
        this.studentLoans = studentLoans;
    }

    public void addLoan(Loan loan){
        this.studentLoans.add(loan);
    }

    public void removeLoan(Loan loan){
        this.studentLoans.remove(loan);
    }

    public void emptyStudentLoans(){
        this.studentLoans.clear();
    }
}
