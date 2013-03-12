package Entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/11/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "start_options")
public class TermsOfService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "terms_of_service_id", unique = true, nullable = false)
    private int termsOfServiceId;

    @Column(name = "terms_of_service", nullable = false)
    private String termsOfService;

    public String getTermsOfService() {
        return termsOfService;
    }

    public int getTermsOfServiceId() {
        return termsOfServiceId;
    }
}
