<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>登陆界面</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/font-awesome-4.7.0/css/font-awesome.min1.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style1.css">

</head>
<body>
<div class="materialContainer">
    <form action="login" method="post">
        <div class="box">
            <div class="title">登录</div>
            <div class="input">
                <label for="name">用户名</label>
                <input type="text" name="userName" value="" id="name">
                <span class="spin"></span>
            </div>
            <div class="input">
                <label for="pass">密码</label>
                <input type="password" name="userPassword" value="" id="pass">
                <span class="spin"></span>
            </div>

            <input type="submit" name="submit" class="button login" value="登陆">

            <a href="javascript:" class="pass-forgot">忘记密码？</a>
        </div>
    </form>
    <div class="overbox">
        <div class="material-button alt-2">
            <span class="shape"></span>
        </div>
        <div class="title">注册</div>
        <div class="input">
            <label for="regname">用户名</label>
            <input type="text" name="regname" id="regname">
            <span class="spin"></span>
        </div>
        <div class="input">
            <label for="regpass">密码</label>
            <input type="password" name="regpass" id="regpass">
            <span class="spin"></span>
        </div>
        <div class="input">
            <label for="reregpass">确认密码</label>
            <input type="password" name="reregpass" id="reregpass">
            <span class="spin"></span>
        </div>
        <div class="button">
            <button>
                <span>注册</span>
            </button>
        </div>
    </div>

</div>

<script src="js/jquery.min1.js"></script>
<script src="js/index1.js"></script>

</body>
</html>