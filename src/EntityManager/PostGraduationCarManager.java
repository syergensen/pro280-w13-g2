package EntityManager;

import Entity.PostGraduationCar;

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
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@LocalBean
public class PostGraduationCarManager {

    @PersistenceContext
    private EntityManager em;

    public List<PostGraduationCar> getAllCarOptions(){
        TypedQuery<PostGraduationCar> allCarOptionsQuery = em.createNamedQuery(PostGraduationCar.ALL_CAR_OPTIONS_QUERY, PostGraduationCar.class);
        return allCarOptionsQuery.getResultList();
    }

    public PostGraduationCar getCarOption(String type, String quality){

        TypedQuery<PostGraduationCar> carPriceQuery = em.createNamedQuery(PostGraduationCar.GET_PRICE_AND_FUEL_COST_QUERY, PostGraduationCar.class);
        carPriceQuery.setParameter("carType", type);
        carPriceQuery.setParameter("carQuality", quality);
        PostGraduationCar car = carPriceQuery.getSingleResult();
        return car;
    }

    public int getCarPrice(String type, String quality){

        PostGraduationCar carOption = getCarOption(type, quality);
        return carOption.getPrice();
    }

    public int getCarFuelCost (String type, String quality){

        PostGraduationCar carOption = getCarOption(type, quality);
        return  carOption.getFuelCost();
    }
}
