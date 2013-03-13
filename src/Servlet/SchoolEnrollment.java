package Servlet;

import Entity.StudentInformation;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String startQuarter = request.getParameter("quarterStart");
        String programSelect = request.getParameter("programSelect");
        String extendedStay = request.getParameter("extendedStay");

        int extendedFullTime;
        int extendedPartTime;
        if(extendedStay == null){
            extendedFullTime = 0;
            extendedPartTime = 0;
        } else{
            extendedFullTime = Integer.parseInt(request.getParameter("extendedFullTime"));
            extendedPartTime = Integer.parseInt(request.getParameter("extendedPartTime"));
        }

        HttpSession session = request.getSession(false);
        StudentInformation curStudent = (StudentInformation) session.getAttribute("currentUser");
        curStudent.setEnrollQuarter(startQuarter);
        curStudent.setProgram(programSelect);
        curStudent.setExtraFullTime(extendedFullTime);
        curStudent.setExtraPartTime(extendedPartTime);

        session.setAttribute("currentStudent", curStudent);
        String contextPath = request.getContextPath();
        response.sendRedirect(request.getContextPath() + "/SchoolLoan");
        /*
            Validate, if pass get cookies and retrieve student information
            and add the information to it and restore it as a session/cookie.
            Else, redirect back to this page and try again.
         */
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/School/School_Questions_1.jsp").forward(request, response);
    }
}
