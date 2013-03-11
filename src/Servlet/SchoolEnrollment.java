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
        String extendedStay = request.getParameter("extendedStay");
        String extendedFullTime;
        String extendedPartTime;
        if(extendedStay == null)
        {
            extendedFullTime = request.getParameter("0");
            extendedPartTime = request.getParameter("0");
        } else{
            extendedFullTime = request.getParameter("extendedFullTime");
            extendedPartTime = request.getParameter("extendedPartTime");
        }

        HttpSession session = request.getSession();
        /*
            Validate, if pass get cookies and retrieve student information
            and add the information to it and restore it as a session/cookie.
            Else, redirect back to this page and try again.
         */
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect(request.getContextPath() + "/School/School_Questions_1.jsp");
    }
}
