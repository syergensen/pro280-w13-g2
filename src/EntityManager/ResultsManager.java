package EntityManager;

import Entity.Results;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 3/8/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class ResultsManager
{
    @PersistenceContext
    EntityManager em;

    public List<Results> getIngredients() {
        TypedQuery<Results> ressultsQuery = em.createQuery("SELECT r FROM Results r", Results.class);
        return ressultsQuery.getResultList();
    }

    public Results getResults(int id) {
        return em.find(Results.class, id);
    }

    public Results create(Results results) {
        em.persist(results);
        return results;
    }

    public Results update(Results results) {
        em.merge(results);
        return results;
    }

    public void delete(int id) {
        em.remove(getResults(id));
    }
}
