package Servlet;

import Entity.StudentInformation;
import Helper.HousingHelper;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 2/20/13
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
//housing stuff use this servlet to get housing information
@WebServlet("/Housing")
public class Housing extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HousingHelper house;
        String housingType = request.getParameter("housing");
        String housingRent = request.getParameter("housingA");
        String housingUtility = request.getParameter("housingB");
        String daysEatingLunch = request.getParameter("daysEatingLunch");
        String daysEatingDinner = request.getParameter("daysEatingDinner");
        String spentOnVideoGames = request.getParameter("spentonvideogames");
        String savings = request.getParameter("saving");

        try{
            //not sure if these will be need but here in case
        double rent = Double.parseDouble(housingRent);
        double utility = Double.parseDouble(housingUtility);
        int daysSpentOnLunch = Integer.parseInt(daysEatingLunch);
        int spentOnDinner = Integer.parseInt(daysEatingDinner);
        double videoGameSpending = Double.parseDouble(spentOnVideoGames);
        double savingsAmount = Double.parseDouble(savings);
        house = new HousingHelper(housingType, rent,utility,daysSpentOnLunch,spentOnDinner,videoGameSpending, savingsAmount);

            //curUser.getStudentLoans().add(loan);
            //will probably change this to use the integers but to be determined later
            HttpSession session = request.getSession();
            StudentInformation curUser = (StudentInformation) session.getAttribute("currentUser");

            curUser.setMonthlyUtilities(utility);
            curUser.setMonthlyRent(rent);
            session.setAttribute("currentUser", curUser);
            session.setAttribute("housingType",housingType);
            session.setAttribute("daysEatingLunch",daysEatingLunch);
            session.setAttribute("daysEatingDinner",daysEatingDinner);
            session.setAttribute("spentOnVideoGames",spentOnVideoGames);
            session.setAttribute("saving",savings);
        }
        catch(Exception e)
        {
            //will do better error checking soon
            e.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "Post_Graduation/Post_Graduation.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/Housing/housing.jsp").forward(request,response);
    }
}
