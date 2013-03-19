package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/19/13
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "region_options")
@NamedQueries(
        @NamedQuery(name = PostGraduationRegion.ALL_REGIONS_QUERY,
                    query = "SELECT r FROM PostGraduationRegion r")
)
public class PostGraduationRegion {

    public static final String ALL_REGIONS_QUERY = "Entity.PostGraduationRegion.ALL_REGIONS_QUERY";

    @Id
    @Column(name = "region_name", unique = true, nullable = false)
    private String name;

    public String getName() {
        return name;
    }
}
