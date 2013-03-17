<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Housing</h1>
            <form name="housingInput" method="POST" action="Housing" onsubmit=" return validate()">
                <p>
                    1. What is your housing situation? <br/>
                </p>
                    <input name="housing" type="radio" onclick="hideRent()" value="Neumont University housing"/> Neumont University housing<br/>
                    <input name="housing" type="radio" onclick="hideRent()" value="Live with family or friends for free"/> Live with family or friends for free<br/>
                    <input name="housing" type="radio" onclick="showRent()" value="Renting and apartment or similar"/> Renting and apartment or similar<br/>
                <p>
                    <span id="rentAttributes" style="visibility: hidden">
                        a. How much do you spend monthly for rent? $<input name="housingA" type="text" value="0"/><br/>
                        b. On average, how much per month is spent on bills $<input name="housingB"type="text" value="0"/><br/>
                    </span>
                </p>
                <p>
                    2. On average how much do you spend eating out each wee:k<br>
                    <input type="text" name="spentEatingOut" onchange=""/>
                <p/>
                <p>
                    3. On average how much do you spend on entertainment per month: <br>
                    <input name="spentOnEntertainment" type="text" onchange=""/>
                </p>
                <p>
                    4. How much would you like to contribute to your savings each month(you really should start saving asap):<br>
                    <input name="saving" type="text" onchange=""/>
                </p>
                <p>
                    5. How much do you spend on food each week     <br>
                    <input name="foodPerWeek" type="text" onclick="" />
                </p>
                <p>
                    6.how much do you spend on transportation each week  <br>
                    <input name="transportation" type="text" />
                </p>
                <input name="NextStep" type="submit" value="NextStep" id="submitButton"/>
            </form>
        </div>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
    </body>
</html>
<script>

    function showRent()
    {
        document.getElementById("rentAttributes").style.visibility = 'visible';
    }

    function hideRent(){
        document.getElementById("rentAttributes").style.visibility = 'hidden';
    }

    function validate()
    {
        var savingsInput = document.forms["housingInput"]["saving"].value;


            var radios = document.getElementsByName("housing");
            var formValid = false;

            var i = 0;
            while (!formValid && i < radios.length)
            {
                if (radios[i].checked)
                {
                    formValid = true;
                    return true;
                }
                i++;
            }

        if (savingsInput==null || savingsInput=="")
        {
            alert("savings must be filled out");
            return false;
        }
        if(savingsInput <0)
        {
            alert("savings cannot be negative")
            return false;
        }

        var eatingOut = document.forms["housingInput"]["spentEatingOut"].value;

        if(eatingOut==null || eatingOut=="")
        {
            alert("eating out must be filled out")
            return false;
        }
        if(eatingOut <0)
        {
            alert("eating out  must be a positive number or zero")
            return false;
        }
        var food = document.forms["housingInput"]["foodPerWeek"].value;
        if (food==null || food=="")
        {
            alert("food must be filled out");
            return false;
        }
        if(savingsInput <0)
        {
            alert("food cannot be negative")
            return false;
        }
        var videoGames = document.forms["housingInput"]["spentOnEntertainment"].value;
        if(videoGames==null || videoGames=="")
        {
            alert("video games must be filled out")
            return false;
        }
        if(videoGames <0)
        {
            alert("video games must be a positive number or zero")
            return false;
        }
        return true;
    }
</script>