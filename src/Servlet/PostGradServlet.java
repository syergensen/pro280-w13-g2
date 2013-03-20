package Servlet;

import Entity.StudentInformation;
import Entity.StudentResults;
import EntityManager.PostGraduationCarManager;
import EntityManager.PostGraduationHousingManager;
import EntityManager.PostGraduationRegionManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/12/13
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/PostGraduation")
public class PostGradServlet extends HttpServlet {

    @EJB
    PostGraduationRegionManager regionManager;

    @EJB
    PostGraduationCarManager carManager;

    @EJB
    PostGraduationHousingManager housingManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String regionSelection = request.getParameter("regionOption");
        String carType = request.getParameter("carType");
        String carQuality = request.getParameter("carQuality");
        String carInterestRateLiteral = request.getParameter("carInterestRate");
        String housingSelection = request.getParameter("housingOption");

        int carInterestRate = Integer.parseInt(carInterestRateLiteral);

        HttpSession currentSession = request.getSession();
        StudentInformation currentUser = (StudentInformation)currentSession.getAttribute("currentUser");

        currentUser.setPreferredRegion(regionSelection);
        currentUser.setPreferredCarType(carType);
        currentUser.setPreferredCarQuality(carQuality);
        currentUser.setCarInterestRate(carInterestRate);
        currentUser.setPreferredHousing(housingSelection);

        currentSession.setAttribute("currentUser", currentUser);
        currentUser = (StudentInformation)currentSession.getAttribute("currentUser");

        StudentResults results = new StudentResults();

        results.setUserName(currentUser.getUserName());
        results.setCarPayment(getMonthlyCarCost(currentUser.getPreferredCarType(), currentUser.getPreferredCarQuality(), carInterestRate));

        response.sendRedirect(request.getContextPath() + "/Results");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession currentSession = request.getSession();
        currentSession.setAttribute("regionOptions", regionManager.getRegionOptions());
        currentSession.setAttribute("housingOptions", housingManager.getAllPostGraduationOptinos());

        request.getRequestDispatcher("/Post_Graduation/Post_Graduation.jsp").forward(request, response);
    }

    private int getMonthlyCarCost(String carType, String carQuality, int interestRate){

        int carPrice = carManager.getCarPrice(carType, carQuality);
        int carFuelCost = carManager.getCarFuelCost(carType, carQuality);

        int monthlyCarPrice = carPrice / 12;

        return (monthlyCarPrice + carFuelCost);
    }
}
