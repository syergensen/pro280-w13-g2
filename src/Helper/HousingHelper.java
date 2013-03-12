package Helper;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/12/13
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class HousingHelper
{
    private String housingType;
    private double housingRent;
    private double housingUtility;
    private int daysEatingLunch;
    private int daysEatingDinner;
    private double spentOnVideoGames;
    private double savings;

    public HousingHelper(String housingType,double housingRent,double housingUtility,int daysEatingLunch,int daysEatingDinner, double spentOnVideoGames, double savings)
    {
        this.housingType = housingType;
        this.housingRent = housingRent;
        this.housingUtility = housingUtility;
        this.daysEatingLunch = daysEatingLunch;
        this.daysEatingDinner = daysEatingDinner;
        this.spentOnVideoGames= spentOnVideoGames;
        this.savings = savings;
    }
    public String getHousingType()
    {
        return housingType;
    }

    public void setHousingType(String housingType)
    {
        this.housingType = housingType;
    }

    public double getHousingRent()
    {
        return housingRent;
    }

    public void setHousingRent(double housingRent)
    {
        this.housingRent = housingRent;
    }

    public double getHousingUtility()
    {
        return housingUtility;
    }

    public void setHousingUtility(double housingUtility)
    {
        this.housingUtility = housingUtility;
    }

    public int getDaysEatingLunch()
    {
        return daysEatingLunch;
    }

    public void setDaysEatingLunch(int daysEatingLunch)
    {
        this.daysEatingLunch = daysEatingLunch;
    }

    public int getDaysEatingDinner()
    {
        return daysEatingDinner;
    }

    public void setDaysEatingDinner(int daysEatingDinner)
    {
        this.daysEatingDinner = daysEatingDinner;
    }

    public double getSpentOnVideoGames()
    {
        return spentOnVideoGames;
    }

    public void setSpentOnVideoGames(double spentOnVideoGames)
    {
        this.spentOnVideoGames = spentOnVideoGames;
    }

    public double getSavings()
    {
        return savings;
    }

    public void setSavings(double savings)
    {
        this.savings = savings;
    }
}
