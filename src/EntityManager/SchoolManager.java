package EntityManager;

import Entity.School;
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
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class SchoolManager
{
    @PersistenceContext
    EntityManager em;

    public List<School> getIngredients() {
        TypedQuery<School> schoolsQuery = em.createQuery("SELECT s FROM school s", School.class);
        return schoolsQuery.getResultList();
    }

    public School getSchools(int id) {
        return em.find(School.class, id);
    }

    public School create(School school) {
        em.persist(school);
        return school;
    }

    public School update(School school) {
        em.merge(school);
        return school;
    }

    public void delete(int id) {
        em.remove(getSchools(id));
    }
}
