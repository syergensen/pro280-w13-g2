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
    <div id="contentWrapper">
        <div id="mainContentHousing">
            <form name="housingInput">
                1. What is your housing situation? <br>
                <input name="housing" type="radio" value="NeumontUniversityHousing"/> Neumont Housing  <br>
                <input name="housing" type="radio" value="live with family or friends for free"/> live with family or friends for free<br>
                <input name="housing" type="radio" value="renting and apartment or similar"/> renting or apartment or similar  <br>
                a. how much do you spend monthly for rent?<input name="housingA" type="text"/><br>
                b. on average, how much per month is spent on bills<input name="housingB"type="text"/><br>
                <br>
                2. On average how many days out of the week do you eat out for lunch<br>
                <select name="daysEatingLunch" selected="1">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                </select>

                <br>
                3. on average how many days out of the week do you eat out for dinner? <br>
                <input name="daysEatingDinner" type="text"/>
                <select name="daysEatingDinner" selected="1">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                </select>
                <br>
                4. on average how much do you spend of video games per month  <br>
                <input name="spentOnVideoGames" type="text" onclick="validateVideoGames();"/>  <br>

                5. how much would you like to contribute to your savings each month(you really should start saving asap)
                <input name="saving" type="text" onclick="validateSavings();"/><br>

                <br>
                <input name="NextStep" type="submit" value="NextStep" >

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
</script>