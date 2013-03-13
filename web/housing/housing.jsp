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
            <form name="housingInput" method="POST" action="Housing">
                <p>
                    1. What is your housing situation? <br/>
                </p>
                    <input name="housing" type="radio" onclick="hideRent()" value="Neumont University housing"/> Neumont University housing<br/>
                    <input name="housing" type="radio" onclick="hideRent()" value="Live with family or friends for free"/> Live with family or friends for free<br/>
                    <input name="housing" type="radio" onclick="showRent()" value="Renting and apartment or similar"/> Renting and apartment or similar<br/>
                <p>
                    <span id="rentAttributes" style="visibility: hidden">
                        a. How much do you spend monthly for rent? $<input name="housingA" type="text"/><br/>
                        b. On average, how much per month is spent on bills $<input name="housingB"type="text"/><br/>
                    </span>
                </p>
                <p>
                    2. On average how many days out of the week do you eat out for lunch
                </p>
                    <input type="range" max="7" value="0" onchange="showLunchValue(this.value)" name="daysEatingDinner"/>
                    <span id="lunchRange">0</span> day(s)
                <p>
                    3. On average how many days out of the week do you eat out for dinner?
                </p>
                    <input type="range" max="7" value="0" onchange="showDinnerValue(this.value)" name="daysEatingDinner"/>
                    <span id="dinnerRange">0</span> day(s)
                <p>
                    4. On average how much do you spend of video games per month: $
                    <input name="spentOnVideoGames" type="text" onclick="validateVideoGames();"/>
                </p>
                <p>
                    5. How much would you like to contribute to your savings each month(you really should start saving asap): $
                    <input name="saving" type="text" onclick="validateSavings();"/>
                </p>
                <input name="NextStep" type="submit" value="NextStep"/>
            </form>
        </div>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
    </body>
</html>
<script>
    function validateVideoGames()
    {
        var videoGames = document.forms["housingInput"]["spentOnVideoGames"].value;
        var savingsInput = document.forms["housingInput"]["saving"].value;
        var rent = document.forms["housingInput"]["housingA"]

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

    function validateSavings()
    {
        var savingsInput = document.forms["housingInput"]["savings"].value;
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
        return true;
    }

    function showDinnerValue(newValue)
    {
        document.getElementById("dinnerRange").innerHTML=newValue;
    }

    function showLunchValue(newValue)
    {
        document.getElementById("lunchRange").innerHTML=newValue;
    }

    function showRent()
    {
        document.getElementById("rentAttributes").style.visibility = 'visible';
    }

    function hideRent(){
        document.getElementById("rentAttributes").style.visibility = 'hidden';
    }
</script>