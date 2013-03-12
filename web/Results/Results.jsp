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
                        <!-- TODO: JSTL LOOPING TO GENERATE ROWS AND COLS FOR RESULT DATA !-->
                    </table>
                </td>
                <td id="resultsRightMargin">
                    <form action="/Results" method="POST">
                        <input type="submit" value="Print/Export"/>
                    </form>
                </td>
            </tr>
            <tr id="resultsLayoutFooter">
                Discretionary Income:
            </tr>
        </table>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
</body>
</html>