package Entity;

import javax.persistence.*;
/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/19/13
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "car_options")
@NamedQueries( {@NamedQuery(name = PostGraduationCar.ALL_CAR_OPTIONS_QUERY,
                           query = "SELECT cars FROM PostGraduationCar cars"),
                @NamedQuery(name = PostGraduationCar.GET_PRICE_AND_FUEL_COST_QUERY,
                            query = "SELECT cars FROM PostGraduationCar cars WHERE cars.carType = :carType AND cars.carQuality = :carQuality")})
public class PostGraduationCar {

    public static final String ALL_CAR_OPTIONS_QUERY = "Entity.PostGraduationCar.ALL_CAR_OPTIONS_QUERY";
    public static final String GET_PRICE_AND_FUEL_COST_QUERY = "Entity.PostGraduationCar.GET_PRICE_AND_FUEL_COST_QUERY";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_option_id", unique = true, nullable = false)
    private int carOptionId;

    @Column(name = "car_type", nullable = false)
    private String carType;

    @Column(name="car_quality", nullable = false)
    private String carQuality;

    @Column(name="price")
    private int price;

    @Column(name="fuel_price")
    private int fuelPrice;

    public String getCarType() {
        return carType;
    }

    public String getCarQuality() {
        return carQuality;
    }

    public int getPrice() {
        return price;
    }

    public int getFuelCost() {
        return fuelPrice;
    }
}
