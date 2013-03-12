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
            <form>
                1. What is your housing situation? <br>
                <input name="housing" type="radio" value="NeumontUniverstiyHousing"/> Neumont Housing  <br>
                <input name="housing" type="radio" value="live with family or friends for free"/> live with family or friends for free<br>
                <input name="housing" type="radio" value="renting and apartment or similar"/> renting or apartment or similar  <br>
                a. how much do you spend monthly for rent?<input name="housingA" type="text"/><br>
                b. on average, how much per month is spent on bill<input name="housingB"type="text"/><br>
                <br>
                2. On average how many days out of the week do you eat out for lunch<br>
                <input name="daysEatingLunch" type="text" />    <br>
                <br>
                3. on average how many days out of the week do you eat out for dinner? <br>
                <input name="daysEatingDinner" type="text"/><br>
                <br>
                4. on average how much do you spend of video games per month  <br>
                <input name="spentOnVideoGames" type="text" />  <br>

                5. how much would you like to contribute to your savings each month
                <input name="saving" tyep="text"/><br>

                <br>
                <input name="NextStep" type="submit" value="NextStep">

                </form>
        </div>
    </div>
    <jsp:include page="/Page_Template/footer.jsp"/>
    </body>
</html>