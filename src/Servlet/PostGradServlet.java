package Servlet;

import Entity.StudentInformation;
import Entity.StudentResults;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String regionSelection = request.getParameter("regionOption");
        String carSelection = request.getParameter("carOptions");
        String housingSelection = request.getParameter("housingOption");

        HttpSession currentSession = request.getSession();
        StudentInformation currentUser = (StudentInformation)currentSession.getAttribute("currentUser");

        currentUser.setPreferredRegion(regionSelection);
        currentUser.setPreferredCar(carSelection);
        currentUser.setPreferredHousing(housingSelection);

        currentSession.setAttribute("currentUser", currentUser);
        currentUser = (StudentInformation)currentSession.getAttribute("currentUser");

        StudentResults results = new StudentResults();

        results.setUserName(currentUser.getUserName());
        //results.


        response.sendRedirect(request.getContextPath() + "/Results");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Post_Graduation/Post_Graduation.jsp").forward(request, response);
    }
}
