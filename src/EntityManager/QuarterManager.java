package EntityManager;
import Entity.Quarter;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/18/13
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class QuarterManager {

    @PersistenceContext
    private EntityManager em;

    public List<Quarter> getQuarters() {
        TypedQuery<Quarter> ProgramQuery = em.createQuery("SELECT q FROM Quarter q", Quarter.class);
        return ProgramQuery.getResultList();
    }
}
