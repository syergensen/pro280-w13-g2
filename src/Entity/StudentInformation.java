package Entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "student_information")
@Entity
public class StudentInformation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username", length = 50)
    private String userName;

    @Column(name = "user_password", nullable = false, length = 50)
    private String password;

    @Column(name = "enrollment_quarter", nullable = false, length = 20)
    private String enrollQuarter;

    @Column(name = "program", nullable = false, length = 4)
    private String program;

    @Column(name = "extra_part_time", nullable = true)
    private int extraPartTime;

    @Column(name = "extra_full_time", nullable = true)
    private int extraFullTime;

    @Column(name = "OOP_ratio", nullable = false)
    private int pocketRatio;

    @Column(name = "loan_ratio", nullable = false)
    private int loanRatio;

    @Column(name = "credit_card_debt", nullable = true)
    private double creditCardDebt;

    @Column(name = "medical_debt", nullable = true)
    private double medicalDebt;

    @Column(name = "other_loan_debt", nullable = true)
    private double otherLoanDebt;

    @Column(name = "preferred_region", nullable = false, length = 30)
    private String preferredRegion;

    @Column(name = "preferred_car", nullable = false, length = 50)
    private String preferredCar;

    @Column(name = "preferred_housing", nullable = false, length = 50)
    private int preferredHousing;

    @Column(name = "monthly_rent", nullable = true)
    private double monthlyRent;

    @Column(name = "monthly_utilities", nullable = true)
    private double monthlyUtilities;

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

    public int getPreferredHousing()
    {
        return preferredHousing;
    }

    public void setPreferredHousing(int preferredHousing)
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
}
