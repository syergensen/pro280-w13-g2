<%--
  Created by IntelliJ IDEA.
  User: brdegenaars
  Date: 3/10/13
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>NUBA - Start</title>
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}/neumont.css" />
    </head>
    <body>
        <jsp:include page="/Page_Template/header.jsp"/>
        <div id="contentWrapper1">
            <div id="textBounds">
                <h1>N.U.B.A</h1>
                Tool Description:<br/>
                <ul id="toolDescription">
                    <li>Financial terms and processes are confusing</li>
                    <li>Most students lack a complete understanding of loans while in school</li>
                </ul>

            <form method="POST" action="Start">
                <div id="tos">
                    <textarea id="tosTextArea" readonly="true" rows="25" cols="70" wrap="hard">
                        ${sessionScope.tos}
                    </textarea> <br/>
                    <input id="agreeToTOS" name="agreeToTOS" type="checkbox" onchange="enableSubmission()" required="required"/> I have read and agree to the Terms of Service
                </div>
                <input id="tosSubmit" type="submit" value="Begin" disabled="disabled"/>
            </form>
            </div>
        </div>
        <jsp:include page="/Page_Template/footer.jsp"/>
    </body>
</html>
<script>
    function enableSubmission(){

        if(document.getElementById("tosSubmit").disabled == true)
            document.getElementById("tosSubmit").disabled = false;
        else
            document.getElementById("tosSubmit").disabled = true;
    }
</script>