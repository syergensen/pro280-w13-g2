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
        <div id="textBounds">
            <h1>Results</h1>
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
                                <td><div class="resultCell">Salary</div></td>
                                <td>$5,416/month</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Student Loan</div></td>
                                <td>$830/month</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Income Tax</div></td>
                                <td>$588/month</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Misc. Expenses</div></td>
                                <td>$650/month</td>
                                <td><input type="submit" value="Revise"></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Car Expenses</div></td>
                                <td>$330/month</td>
                                <td><input type="submit" value="Revise"></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Mortgage/Rent</div></td>
                                <td>$1900/month</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><div class="resultCell">Savings Acct Contribution</div></td>
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
            </table>
            <p>
                Discretionary Income: $310/month
            </p>
        </div>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>