package EntityManager;

import Entity.TermsOfService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/11/13
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class TermsOfServiceManager {

    @PersistenceContext
    private EntityManager em;

    public TermsOfService getTermsOfServiceById(int id){
        return em.find(TermsOfService.class, id);
    }
}
