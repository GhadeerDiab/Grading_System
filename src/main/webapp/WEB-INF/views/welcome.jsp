<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate" %>

<%
    // Get the current date using Java
    LocalDate currentDate = LocalDate.now();
%>

<html>
<body>

    <p><i>Current Date: <%= currentDate %> </i></p>
    <p><i>Today is <%= currentDate.getDayOfWeek() %> </i></p>


<h2>The subject is ${subject}</h2>

<form action="/teacher" method = "POST">

<b> Subject Name : </b>
<input type="text" name ="subject" </input>
<input type= "submit" value = "Enter" </input>

</form>
</body>
</html>
