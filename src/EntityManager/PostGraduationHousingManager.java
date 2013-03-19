package EntityManager;

import Entity.PostGraduationHousing;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/18/13
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class PostGraduationHousingManager {

    @PersistenceContext
    private EntityManager em;

    public PostGraduationHousing getGraduationOptionById(int id){
        return em.find(PostGraduationHousing.class, id);
    }

    public List<PostGraduationHousing> getAllPostGraduationOptinos(){
        TypedQuery<PostGraduationHousing> allOptionsQuery = em.createNamedQuery(PostGraduationHousing.ALL_POST_GRAD_HOUSING_OPTIONS_QUERY, PostGraduationHousing.class);
        return allOptionsQuery.getResultList();
    }
}
