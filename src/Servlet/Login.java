package Servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: brdegenaars
 * Date: 3/1/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String userName = (String) request.getAttribute("userName");
        String password = (String) request.getAttribute("password");

        // TODO: so now I have the username and pass, I just need to do is forward the info the the proper url, and get the authorized username and role from NU

        response.sendRedirect("URL TO NUID SERVICE");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
