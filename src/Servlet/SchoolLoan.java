package Servlet;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.WildcardLoader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet("/SchoolLoan")
public class SchoolLoan {
    //Class will be used to calculate the financial information based on the input
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String loanRatio = request.getParameter("fundingRatio");
        int max = 100;
        int oopAmount = 100 - (Integer.valueOf(request.getParameter("fundingRatio")));
        String oopRatio = Integer.toString(oopAmount);

        //Will need to iterate over each div section and create a loan object
        String loanAmount = request.getParameter("loanAmount");
        String loanInterest = request.getParameter("loanInterest");
        String firstYearPayment = request.getParameter("firstYearMonthly");
        String yearlyPayment = request.getParameter("monthlyPayment");

        String ooPAmount = request.getParameter("oOPAmount");

        /*
            Will need to validate entries. Then for each loan entered,
            create a new loan and calculate results and store it in a collection of loans.
            Pass the collection into the session.
         */

        HttpSession session = request.getSession();

        request.getRequestDispatcher("/Housing");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/School/School_Questions_2.jsp");
    }
}
