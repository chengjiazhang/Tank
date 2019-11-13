<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-10
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>show title errormessage</title>
</head>
<body>
<p>Sorry,it's my error.</p>
<%exception.printStackTrace(response.getWriter());%>
</body>
</html>
