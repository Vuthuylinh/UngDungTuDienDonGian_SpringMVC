<%--
  Created by IntelliJ IDEA.
  User: Linh Vu
  Date: 9/5/2019
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form method="get" action="translate">
    English: <input type="text" name="englishWord"><br><br>
    <input type="submit" value="Translate">
</form>
<div>
    English: ${englishWord}
    <br>
    Vietnamese:${vietnameseWord}
</div>



</body>
</html>
