<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1>Hello)</h1>
<h2>${message}</h2>
<h3>${inp}</h3>

<c:forEach var="headerName" items="${header.keySet()}" >
    <p>${headerName}: ${header.get(headerName)}</p>
</c:forEach>
<form action="/hello/world" method="post">
    <input type="text" name="inp"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>