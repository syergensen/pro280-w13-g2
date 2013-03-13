<%--
  Created by IntelliJ IDEA.
  User: brdegenaars
  Date: 3/5/13
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/neumont.css" />
</head>
<body>
    <jsp:include page="/Page_Template/header.jsp"/>
    <div id="contentWrapper1">
        <table id="resultsLayoutTable">
            <tr>
                <td id="resultsLeftMargin">
                    <form action="AddAQuarter" method="POST">
                        <input type="submit" value="+1 Quarter"/>
                    </form>
                </td>
                <td id="centerContent">
                    <table id="resultsDataTable">
                        <tr>
                            <td>Salary</td>
                            <td>$5,416/month</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Student Loan</td>
                            <td>$830/month</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Income Tax</td>
                            <td>$588/month</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Misc. Expenses</td>
                            <td>$650/month</td>
                            <td><input type="submit" value="Revise"></td>
                        </tr>
                        <tr>
                            <td>Car Expenses</td>
                            <td>$330/month</td>
                            <td><input type="submit" value="Revise"></td>
                        </tr>
                        <tr>
                            <td>Mortgage/Rent</td>
                            <td>$1900/month</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Savings Acct Contribution</td>
                            <td>$830/month</td>
                            <td></td>
                        </tr>
                    </table>
                </td>
                <td id="resultsRightMargin">
                    <form action="Results" method="POST">
                        <input type="submit" value="Print/Export"/>
                    </form>
                </td>
            </tr>
            <tr id="resultsLayoutFooter">
                Discretionary Income: $310/month
            </tr>
        </table>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>