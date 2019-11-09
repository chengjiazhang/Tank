<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-09
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ex" uri="../../WEB-INF/PageTag.tld" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>tag</h1>
<ex:pageTag></ex:pageTag>

<br>
姓名：<c:out value="${userDTO.userName}" default="张三"></c:out>
<br>
密码：<c:out value="${userDTO.password}" default="123456"></c:out>
<br>
年龄：<c:out value="${userDTO.age}" default="33"></c:out>
<br>
<c:set var="name" value="张成佳" ></c:set>
<c:out value="${name}" default="成佳"></c:out>
<c:remove var="name"></c:remove>
<br>
<c:out value="${name}" default="请正确输出你的名字"></c:out>
<c:set var="salary" value="${2000*2}"></c:set>
<c:if test="${salary<4000}">
    <p>我的工资为：<c:out value="${salary}"></c:out></p>
</c:if>
<c:if test="${not flag}">
    <p>我的工资为：<c:out value="${salary}"></c:out></p>
</c:if>


</body>
</html>
