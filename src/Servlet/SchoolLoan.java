package Servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: Sean
 * Date: 3/1/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class SchoolLoan {
    //Class will be used to calculate the financial information based on the input
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String loanRatio = request.getParameter("fundingRatio");
        int max = 100;
        int oopAmount = 100 - (Integer.valueOf(request.getParameter("fundingRatio")));
        String oopRatio = Integer.toString(oopAmount);
        String loanAmount = request.getParameter("loanAmount");
        String loanInterest = request.getParameter("loanInterest");
        String firstYearPayment;
        String yearlyPayment;
        String ooPAmount = request.getParameter("oOPAmount");

        HttpSession session = request.getSession();
        session.setAttribute("loanRatio", loanRatio);
        session.setAttribute("oopRatio", oopRatio);
        session.setAttribute("loanAmount", loanAmount);
        session.setAttribute("loanInterest", loanInterest);
        session.setAttribute("ooPAmount", ooPAmount);

        request.getRequestDispatcher("School_Questions_2.jsp");
    }
}
