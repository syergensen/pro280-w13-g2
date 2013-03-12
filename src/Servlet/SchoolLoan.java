package Servlet;

import Helper.Loan;
import Entity.StudentInformation;

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

        String[] loanAmounts = request.getParameterValues("loanAmount");
        String[] loanInterests = request.getParameterValues("loanInterest");
        String[] firstYearlyPayments = request.getParameterValues("firstYearMonthly");
        String[] monthlyPayments = request.getParameterValues("monthlyPayment");

        int ooPAmount = Integer.valueOf(request.getParameter("oOPAmount"));

        /*
            Need to verify loan values
         */

        HttpSession session = request.getSession(false);
        StudentInformation curUser = (StudentInformation) session.getAttribute("currentUser");

        int loanNumbers = loanAmounts.length; //Amount of loans

        for(int i = 0; i < loanNumbers; i++){
            int loanAmount = Integer.valueOf(loanAmounts[i]);
            int loanInterest = Integer.valueOf(loanInterests[i]);
            int firstYearlyPayment = Integer.valueOf(firstYearlyPayments[i]);
            int monthlyPayment = Integer.valueOf(monthlyPayments[i]);

            Loan loan = new Loan(loanAmount, loanInterest, firstYearlyPayment, monthlyPayment);

            curUser.getStudentLoans().add(loan);
        }

        session.setAttribute("currentUser", curUser);

        request.getRequestDispatcher("/Housing");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/School/School_Questions_2.jsp");
    }
}
