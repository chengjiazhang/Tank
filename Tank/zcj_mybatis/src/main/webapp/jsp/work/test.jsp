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
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page errorPage="ShowError.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
int x=1;
if(x==1){
    throw new RuntimeException("Error condition!!!!");
}
%>
<h1>tag</h1>
<ex:pageTag></ex:pageTag>
<br>
姓名：<c:out value="${userDTO.userName}" default="张三"></c:out>
<br>
密码：<c:out value="${userDTO.password}" default="123456"></c:out>
<br>
年龄：<c:out value="${userDTO.age}" default="33"></c:out>
<br>
<c:set var="name" value="张成佳"></c:set>
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
<br>
<jsp:useBean id="student" class="com.tank.domain.DTO.Student">

    <jsp:setProperty name="student" property="name" value="小强"></jsp:setProperty>
    <jsp:setProperty name="student" property="age" value="10"></jsp:setProperty>
    <jsp:setProperty name="student" property="subject" value="计算机"></jsp:setProperty>

</jsp:useBean>
<br>
<jsp:getProperty name="student" property="subject"/>
<jsp:getProperty name="student" property="name"/>
<br>
<c:out value="${student.subject}"></c:out>
<br>
<c:out value="${student}"></c:out>
<br>
<h1>sql</h1>

<sql:setDataSource var="by_date" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/zcj" user="root"
                   password="Root_123"></sql:setDataSource>
<sql:query var="result" dataSource="${by_date}">
    select * from country;
</sql:query>
<c:forEach var="user" items="result.rows" >
   <c:out value="${country.id}"></c:out>
</c:forEach>
</body>
<hr>
</html>

<%--driver=com.mysql.cj.jdbc.Driver--%>
<%--url=jdbc:mysql://localhost:3306/zcj--%>
<%--username=root--%>
<%--password=Root_123--%>
