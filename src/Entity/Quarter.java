package Entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/18/13
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "quarter_options")
public class Quarter {

    @Id
    @Column(name = "quarter_name")
    private String quarterName;

    public String getQuarterName() {
        return quarterName;
    }
}
