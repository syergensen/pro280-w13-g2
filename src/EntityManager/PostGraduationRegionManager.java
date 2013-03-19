package EntityManager;

import Entity.PostGraduationRegion;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/19/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class PostGraduationRegionManager {

    @PersistenceContext
    private EntityManager em;

    public List<PostGraduationRegion> getRegionOptions(){
        TypedQuery<PostGraduationRegion> allRegionsQuery = em.createNamedQuery(PostGraduationRegion.ALL_REGIONS_QUERY, PostGraduationRegion.class);
        return allRegionsQuery.getResultList();
    }
}
