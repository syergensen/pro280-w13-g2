<%--
  Created by IntelliJ IDEA.
  User: Sean
  Date: 2/28/13
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jabberwocky</title>
</head>
<body >
    <div align="center">
       <h1>Welcome to Project Jabberwocky</h1>
       <div id ="container" align="center">
       		<div id="startQrtQuestion" align="left">1) When did you first arrive at Neumont?</div>
            <div id="startQrtResponse" align="left">
            	<form action="">
                <select name="quarterStart">
                <option value="summer">Summer Quarter</option> 
                <option value="fall">Fall Quarter</option>
                </select>
                </form>
                <!--Static values for now, will be filled in by database entries later-->
            </div>
            <div id="programQuestion" align="left">2) What program are you taking?</div>
            <div id="programResponse" align="left">
            	<form action="">
                <select name="programSelect">
                <option value="bscs">BSCS</option> 
                <option value="bstm">BSTM</option>
                <option value="bsgd">BSGD</option>
                <option value="bswd">BSWD</option>
                </select>
                </form>
                <!--Static values for now, will be filled in by database entries later-->
            </div>
            <div id="extendedQuestion" align="left">3) Will you be staying extra quarters</div>
            <div id="extendedResponse" align="left">
            	<form action="">
                	<input type="checkbox" name="extendedStay" value="1">Yes</input>
                </form>
            	<form action="">
                <select name="programSelect">
                <option value="1">1</option> 
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="-1">Other</option>
                </select>
                </form>
                <!--Static values for now, will be filled in by database entries later-->
            </div>
      </div>
    </div>
</body>
</html>