<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="/person" method="post">
    Name: <input type="text" name="name"/>
    <br/>
    Age: <input type="text" name="age"/>
    <br/>
    <input type="submit" value="Submit"/>
  </form>
  <p>Form spring tag</p>
  <form:form method="post" commandName="person" action="/personForm">
    Name: <form:input path="name"/> <form:errors path="name" cssStyle="color: #ff0000;"/>
    <br/>
    Age: <form:input path="age"/> <form:errors path="age" cssStyle="color: #ff0000;"/>
    <br/>
    Married: <form:checkbox path="married"/>
    <br/>
    <input type="submit" value="Submit">
  </form:form>

</body>
</html>
