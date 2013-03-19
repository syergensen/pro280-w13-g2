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
@NamedQueries( @NamedQuery(name = PostGraduationCar.ALL_CAR_OPTIONS_QUERY,
                           query = "SELECT cars FROM PostGraduationCar cars"))
public class PostGraduationCar {

    public static final String ALL_CAR_OPTIONS_QUERY = "Entity.PostGraduationCar.ALL_CAR_OPTIONS_QUERY";

    @Id
    @Column(name = "car_option", unique = true, nullable = false)
    private String option;

    public String getOption() {
        return option;
    }
}
