package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/1/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/SchoolEnrollment")
public class SchoolEnrollment extends HttpServlet
{
    //Class will be for generating duration of enrollment, also for calculating dates
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        String startQuarter = request.getParameter("quarterStart");
        String programSelect = request.getParameter("programSelect");
        String extendedQuarter = request.getParameter("extendedQuarter");
        if(extendedQuarter.equals("other"))
        {
            extendedQuarter = request.getParameter("extendedDuration");
        }

        HttpSession session = request.getSession();
        session.setAttribute("startQuarter", startQuarter);
        session.setAttribute("programSelect", programSelect);
        session.setAttribute("extendedQuarter", extendedQuarter);

        request.getRequestDispatcher("School_Questions_2.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect(request.getContextPath() + "/School/School_Questions_1.jsp");
    }
}
