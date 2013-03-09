package Entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "School")
@Entity
public class School
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userName", nullable = false, length = 32)
    private String userName;

    @Column(name = "userName", nullable = false, length = 32)
    private String password;

    @Column(name = "enrollQuarter", nullable = false, length = 32)
    private String enrollQuarter;

    @Column(name = "program", nullable = false, length = 32)
    private String program;

    @Column(name = "extraPartTime", nullable = false, length = 32)
    private int extraPartTime;

    @Column(name = "extraFullTime", nullable = false, length = 32)
    private int extraFullTime;

    @Column(name = "pocketRatio", nullable = false, length = 32)
    private int pocketRatio;

    @Column(name = "loanRatio", nullable = false, length = 32)
    private int loanRatio;

    @Column(name = "creditCardDebt", nullable = false, length = 32)
    private double creditCardDebt;

    @Column(name = "medicalDebt", nullable = false, length = 32)
    private double medicalDebt;

    @Column(name = "otherLoanDebt", nullable = false, length = 32)
    private double otherLoanDebt;

    @Column(name = "preferredRegion", nullable = false, length = 32)
    private int preferredRegion;

    @Column(name = "preferredCar", nullable = false, length = 32)
    private int preferredCar;

    @Column(name = "preferredHousing", nullable = false, length = 32)
    private int preferredHousing;

    @Column(name = "monthlyRent", nullable = false, length = 32)
    private double monthlyRent;

    @Column(name = "monthlyUtilities", nullable = false, length = 32)
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

    public int getPreferredRegion()
    {
        return preferredRegion;
    }

    public void setPreferredRegion(int preferredRegion)
    {
        this.preferredRegion = preferredRegion;
    }

    public int getPreferredCar()
    {
        return preferredCar;
    }

    public void setPreferredCar(int preferredCar)
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
