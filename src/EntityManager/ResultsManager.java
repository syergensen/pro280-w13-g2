package EntityManager;

import Entity.StudentResults;

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

    public List<StudentResults> getAllStudentResults() {
        TypedQuery<StudentResults> ressultsQuery = em.createQuery("SELECT r FROM StudentResults r", StudentResults.class);
        return ressultsQuery.getResultList();
    }

    public StudentResults getStudentResultsById(int id) {
        return em.find(StudentResults.class, id);
    }

    public StudentResults createStudentResultEntry(StudentResults studentResults) {
        em.persist(studentResults);
        return studentResults;
    }

    public StudentResults updateStudentResultEntry(StudentResults studentResults) {
        em.merge(studentResults);
        return studentResults;
    }

    public void deleteStudentResultsById(int id) {
        em.remove(getStudentResultsById(id));
    }
}
