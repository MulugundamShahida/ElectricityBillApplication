<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>

<body bgcolor="922A92 ">
    <center>
    <h2>Fill below form to register</h2>
 
    <form:form method="GET" action="/editandsave">
        <table>
            <tr>
                <td>CONSUMERId</td>
                <td><form:input path="consumerid" /></td>
                
            </tr>
            <tr>
                <td>CONSUMERName</td>
                <td><form:input path="consumername"/></td>
                
            </tr>
            <tr>
                <td>CURRENTREADING</td>
                <td><form:input path="currentreading" /></td>
                
            </tr>
           
            <tr>
                <td>PREVIOUSREADING</td>
                <td><form:input path="previousreading" /></td>
                
            </tr>
            
           
           
           
            <tr>
                <td><input type="submit" name="submit" value="saveandedit"></td>
            </tr>
            <tr>
            </center>
        </table>
    </form:form>
 
</body>
</html>