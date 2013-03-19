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

    public int outOfPocket;


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
