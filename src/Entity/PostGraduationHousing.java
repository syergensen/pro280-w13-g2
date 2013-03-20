package Entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/18/13
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "post_grad_housing_options")
@NamedQueries({
        @NamedQuery(name = PostGraduationHousing.ALL_POST_GRAD_HOUSING_OPTIONS_QUERY,
                    query = "SELECT pgo FROM PostGraduationHousing pgo")
})
public class PostGraduationHousing {

    public static final String ALL_POST_GRAD_HOUSING_OPTIONS_QUERY = "Entity.PostGraduationHousing.ALL_POST_GRAD_HOUSING_OPTIONS_QUERY";

    @Id
    @Column(name = "housing_option", unique = true, nullable = false)
    private String option;

    @Column(name = "cost")
    private int cost;

    public String getOption() {
        return option;
    }

    public int getCost() {
        return cost;
    }
}
