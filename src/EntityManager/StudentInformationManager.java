package EntityManager;

import Entity.StudentInformation;
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
public class StudentInformationManager
{
    @PersistenceContext
    EntityManager em;

    public List<StudentInformation> getAllSIEnteries() {
        TypedQuery<StudentInformation> schoolsQuery = em.createQuery("SELECT s FROM StudentInformation s", StudentInformation.class);
        return schoolsQuery.getResultList();
    }

    public StudentInformation getSIEntryById(int id) {
        return em.find(StudentInformation.class, id);
    }

    public StudentInformation createSIEntry(StudentInformation studentInformation) {
        em.persist(studentInformation);
        return studentInformation;
    }

    public StudentInformation updateSIEntry(StudentInformation studentInformation) {
        em.merge(studentInformation);
        return studentInformation;
    }

    public void deleteSIEntryById(int id) {
        em.remove(getSIEntryById(id));
    }
}
