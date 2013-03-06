<%--
  Created by IntelliJ IDEA.
  User: brdegenaars
  Date: 3/5/13
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <table id="resultsLayoutTable">
        <tr>
            <td id="resultsLeftMargin">
                <input type="submit" value="+1 Quarter"/>
            </td>
            <td id="centerContent">
                <table id="resultsDataTable">
                    <!-- TODO: JSTL LOOPING TO GENERATE ROWS AND COLS FOR RESULT DATA !-->
                </table>
            </td>
            <td id="resultsRightMargin">
                <form action="/PrintExportResults" method="POST">
                    <input type="submit" value="Print/Export"/>
                </form>
            </td>
        </tr>
        <tr id="resultsLayoutFooter">
            Discretionary Income:
        </tr>
    </table>
</body>
</html>