<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019/11/6
  Time: 1:19 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>item experience </title>
    <link type="text/css" rel="stylesheet" href="${path}/css/item.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/css/print.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/css/simple-calendar.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/css/stylesheet.css"/>
    <script type="text/javascript" src="${path}/laydate/laydate.js"></script>
    <script type="text/javascript" src="${path}/js/item.js"></script>


</head>
<body>
<form action="../Experience" method="post">
    <div id="main">
        <p id="experience">项目经验</p>
        <div id="left">
            <p id="l_name">项目名称</p>
            <p id="l_link">项目链接</p>
            <p id="l_lift_time">项目周期</p>
            <p id="l_desc">项目描述</p>
            <p id="l_achievement">你的成就</p>
        </div>
        <div id="right">
            <div id="r_name">
                <input type="text" name="item_name" placeholder="请填写项目名称" id="r_item_name">

            </div>
            <div id="r_link">
                <input type="text" name="link_name" placeholder="请填写项目链接（选填）" id="r_link_name">
            </div>
            <div id="r_lift_time">
                <!--            引用日历插件-->
                <input type="text" name="begin_time" placeholder="开始时间" id="r_date_begin">
                <script>
                    laydate.render({
                            elem: '#r_date_begin'
                        }
                    )
                </script>
                <input type="text" name="end_time" placeholder="结束时间" id="r_date_end">
                <script>
                    laydate.render({
                            elem: '#r_date_end'
                        }
                    )
                </script>

            </div>

            <!--       项目描述-->
            <textarea name="desc"  type="text" id="txt"></textarea>
            <div id="count"></div>

            <!--    你的成就-->
            <textarea name="achi" type="text" id="txt1">

            </textarea>
            <div id="count1"></div>
            <!--            </div>-->

            <input type="submit" value="保存" id="submit">
        </div>
    </div>

</form>
</body>
</html>