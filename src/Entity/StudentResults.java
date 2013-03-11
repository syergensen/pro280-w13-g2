package Entity;

import javax.persistence.*;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "student_results")
@Entity
public class StudentResults
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_username", nullable = false, length = 50)
    public String userName;

    @Column(name="salary", nullable = false)
    public int salary;

    @Column(name="fed_tax", nullable = false)
    public int fedTax;

    @Column(name="health_insurance", nullable = false)
    public int healthInsurance;

    @Column(name="misc_insurance", nullable = false)
    public int miscInsurance;

    @Column(name="car_payment", nullable = false)
    public int carPayment;

    @Column(name="mortgage", nullable = false)
    public int mortgage;

    @Column(name="rent", nullable = false)
    public int rent;

    @Column(name="utilities", nullable = false)
    public int utilities;

    @Column(name="totalLoans", nullable = false)
    public int totalLoans;


    public int getTotalLoans()
    {
        return totalLoans;
    }

    public void setTotalLoans(int totalLoans)
    {
        this.totalLoans = totalLoans;
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
