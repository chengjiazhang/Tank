<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="${path}/css/work/simplestyle.css">
    <script type="text/javascript" src="${path}/laydate/laydate.js"></script>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/js/jHsDate.js"></script>
    <link rel="stylesheet" href="${path}/css/jHsDate.css" />
    <title>Document</title>
</head>

<body>
<div class="border-all">


    <form action="experience" method="post">
        <div class="border-contain" id="d1">
            <input class="input font-size" type="text" placeholder="请填写公司名称" name="company" id="companyName" required="required">
        </div>
       <p><input type="checkbox" name="isVisible" value="1" checked="checked"/>不希望企业看到我</p>
        <label id="u1"></label>
        <div class="border-contain" id="d2">
            <input class="input font-size" type="text" placeholder="请填写所属部门" name="department" id="department" required="required">
        </div>
        <label id="u2"></label>
        <div class="border-contain" id="d3">
            <input class="input font-size" type="text" placeholder="例如：java工程师" name="position" id="position" required="required">
        </div>
        <label id="u3"></label>
        <div class="border-containleft" id="d4">
            <input class="input font-size" type="text'" placeholder="入职时间" id="startTime" name="hireDate" required="required">
            <script>
                //执行一个laydat例
                laydate.render({
                    elem: '#startTime',
                    type: 'month'//指定元素
                });
            </script>
        </div>
        <label id="u4"></label>
        <div class="border-containright" id="d5">
            <input class="input font-size" type="text" placeholder="离职时间" id="finalTime" name="leaveDate" required="required">
            <script>
                //执行一个laydate实例
                laydate.render({
                    elem: '#finalTime',
                    type: 'month'//指定元素
                });
            </script>
        </div>
        <label id="date" class="u5"></label>
        <div class="border-bottom" id="d6">
            <textarea class="input-bottom font-size" οnkeyup="wordStatic"    placeholder="" name="workContent" required="required"></textarea>
            <span>还可以输入<i>1500</i>个文字</span>
        </div>

        <div class="border-save">
            <input type="submit" value="保存" class="mr_save">
        </div>
    </form>

    <ul>
        <li id="li1"> 工作经历</li>
        <li id="li2"> 公司名称</li>
        <li id="li3"> 部门</li>
        <li id="li4"> 职位名称</li>
        <li id="li5"> 在职时间</li>
        <li id="li6"> 工作内容</li>
    </ul>

    <script>

        (function( ){
            var textArea = $('textarea');
            var numItem = $('i');
            var max = numItem.text(); //i标签中的内容，也就是最多可以显示的字符数
            var curLength = textArea.val().length; //当前的字符数

            textArea.attr('maxlength',max); //设置最大字符数，如果去掉的话，i标签内会出现负数
            numItem.text(max - curLength); //实时更新i标签中的数量
            textArea.on('input propertychange', function () {
                //$(this) ---> 指代textarea
                numItem.text(max - $(this).val().length);
            });
        })()
        $("#companyName").blur(function () {
            var name = $(this).val();
            var len = name.length;
            $("#u1").empty();
            if ($.trim(name) == '') //判断用户名不为空
            {
                $("#u1").append("<span style='color:red;'>♠不能为空</span>");
                return false;
            }
            else {
                return true;
            }
        });

        $("#department").blur(function () {
            var name = $(this).val();
            var len = name.length;
            $("#u2").empty();
            if ($.trim(name) == '') //判断用户名不为空
            {
                $("#u2").append("<span style='color:red;'>♠不能为空</span>");
                return false;
            } else {
                return true;
            }
        });

        $("#position").blur(function () {
            var name = $(this).val();
            var len = name.length;
            $("#u3").empty();
            if ($.trim(name) == '') //判断用户名不为空
            {
                $("#u3").append("<span style='color:red;'>♠不能为空</span>");
                return false;
            } else {
                return true;
            }
        });

        $("#startTime").blur(function () {
            var name = $(this).val();
            var len = name.length;
            $("#u4").empty();
            if ($.trim(name) == '') //判断用户名不为空
            {
                $("#u4").append("<span style='color:red;'>♠不能为空</span>");
                return false;
            } else {
                return true;
            }
        });

        $("#finalTime").blur(function () {
            var name = $(this).val();
            var len = name.length;
            $(".u5").empty();
            if ($.trim(name) == '') //判断用户名不为空
            {
                $(".u5").append("<span style='color:red;'>♠不能为空</span>");
                return false;
            } else {
                return true;
            }
        });
    </script>
</div>

</body>
</html>
