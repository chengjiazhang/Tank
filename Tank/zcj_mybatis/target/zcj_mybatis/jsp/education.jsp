<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-06
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../css/reset.css" rel="stylesheet">
    <link href="../css/education.css" rel="stylesheet">
    <script src="../js/jquery-3.4.1.js"></script>
    <title>Document</title>

</head>


<body>
<div id="main">

    <div class="container">
        <div class="head">
            <p>教育经历</p>
        </div>
        <form action="education" method="post">
            <div class="input_temp">
                <label>学校名称</label>
                <input class="input" type="text" placeholder="请填写学校名称" id="schoolName" onblur="checkSchool()"
                       name="schoolName">
                <p class="error" id="e1">请输入有效的学校名称</p>
            </div>

            <div class="input_temp">
                <label>在校时间</label>
                <div class="beginTime">
                    <input class="select-time" id="time1" type="text" placeholder="请选择入学年份" readonly name="startTime">
                    <div id="selectItem_time1">
                    </div>
                    <span class="error" id="e2">必填</span>
                </div>
                <div class="endTime">
                    <input class="select-time" type="text" id="time2" placeholder="请选择毕业年份" readonly name="endTime">
                    <div id="selectItem_time2">
                    </div>
                    <span class="error" id="e3">必填</span>
                </div>
            </div>
            <div class="input_temp">
                <label>学历</label>
                <input class="input" id="content" type="text" placeholder="请填写学校名称" readonly name="graduate">
                <div id="selectItem">
                </div>
                <span class="error" id="e4">请选择学历</span>
            </div>

            <div class="input_temp">
                <label>专业名称</label>
                <input class="input" type="text" placeholder="请填写所学专业" id="project" onblur="checkProject()" name="project">
                <span class="error" id="e5">请输入有效的专业名称</span>
            </div>

            <div class="submit">
                <input type="submit" value="保存">
            </div>
        </form>

    </div>
</div>
</body>
<script>
    var data = [{
        name: '大专',
        value: '1'
    }, {
        name: '本科',
        value: '2'
    }, {
        name: '硕士',
        value: '3'
    }, {
        name: '博士',
        value: '4'
    }, {
        name: '其它',
        value: '5'
    }]


    var content = document.getElementById('content');

    var selectItem = document.getElementById('selectItem');

    var ul = document.createElement('ul');
    selectItem.appendChild(ul);

    for (var i = 0; i < data.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('data-value', data[i].value);
        li.innerText = data[i].name;
        ul.appendChild(li);
    }



    content.onclick = function () {
        if (selectItem.style.display == 'none' || selectItem.style.display == '') {
            selectItem.style.display = 'block';
        } else {
            selectItem.style.display = 'none';
        }
    }

    var lis = selectItem.getElementsByTagName('li');
    for (var i = 0; i < lis.length; i++) {
        lis[i].onclick = function () {
            content.value = this.innerHTML;
            selectItem.style.display = 'none';
        }
    }
    // -------------------------------------------------
    var arrs1 = new Array();
    var arrs2 = new Array();

    var date = new Date();
    var j = 0;
    var k = 0;
    var year = date.getFullYear();

    for (var i = year + 5; i >= 1950; i--) {

        arrs1[j++] = i;
    }
    var time1 = document.getElementById('time1');
    var selectItem_time1 = document.getElementById('selectItem_time1');

    var ul_time1 = document.createElement('ul');
    selectItem_time1.appendChild(ul_time1);

    for (var i = 0; i < arrs1.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('arrs1-value', arrs1[i]);
        li.innerText = arrs1[i];
        ul_time1.appendChild(li);
    }

    var lis = selectItem_time1.getElementsByTagName('li');
    for (var i = 0; i < lis.length; i++) {
        lis[i].onclick = function () {
            time1.value = this.innerHTML;
            selectItem_time1.style.display = 'none';
        }
    }
    var time2 = document.getElementById('time2');

    for (var i = year + 5; i >= 1950; i--) {
        arrs2[k++] = i;
    }

    var selectItem_time2 = document.getElementById('selectItem_time2');

    var ul_time2 = document.createElement('ul');
    selectItem_time2.appendChild(ul_time2);

    for (var i = 0; i < arrs2.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('arrs2-value', arrs2[i]);
        li.innerText = arrs2[i];
        ul_time2.appendChild(li);
    }


    time2.onclick = function () {
        if (selectItem_time2.style.display == 'none' || selectItem_time2.style.display == '') {
            selectItem_time2.style.display = 'block';
        } else {
            selectItem_time2.style.display = 'none';
        }
    }

    var lis = selectItem_time2.getElementsByTagName('li');
    for (var i = 0; i < lis.length; i++) {
        lis[i].onclick = function () {
            time2.value = this.innerHTML;
            selectItem_time2.style.display = 'none';
        }
    }
    //校验
    function checkSchool() {
        if ($("#schoolName").val() == "") {
            $("#e1").css("display", "block");
            return false;
        } else {
            $("#e1").css("display", "none");
            return true;
        }
    }
    //校验
    function checkProject() {
        if ($("#project").val() == "") {
            $("#e5").css("display", "block");
            return false;
        } else {
            $("#e5").css("display", "none");
            return true;
        }
    }

    var dropDownEle = document.getElementById("selectItem_time1");
    var Btn = document.getElementById('time1');
    /* 点击按钮时，显示下拉菜单 */
    Btn.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
        dropDownEle.style.display = 'block';
    }
    dropDownEle.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
    }


    var dropDownEle1 = document.getElementById("selectItem");
    var Btn1 = document.getElementById('content');
    /* 点击按钮时，显示下拉菜单 */
    Btn1.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
        dropDownEle1.style.display = 'block';
    }
    dropDownEle1.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
    }
    var dropDownEle2 = document.getElementById("selectItem_time2");
    var Btn2 = document.getElementById('time2');
    /* 点击按钮时，显示下拉菜单 */
    Btn2.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
        dropDownEle2.style.display = 'block';
    }
    dropDownEle2.onclick = function (ev) {
        var ev = ev || event;
        ev.stopPropagation(); //阻止事件冒泡
    }

    /* 点击非按钮的任意地方，隐藏下拉菜单 */
    document.onclick = function () {
        dropDownEle.style.display = 'none';
        dropDownEle1.style.display = 'none';
        dropDownEle2.style.display = 'none';
    }

    $("form").submit(function () {
        if ($("#schoolName").val() != "" && $("#time1").val() != "" && $("#time2").val() != "" && $("#content").val() !=
            "" && $("#project").val() != "") {
            $("#e1").css("display", "none");
            $("#e2").css("display", "none");
            $("#e3").css("display", "none");
            $("#e4").css("display", "none");
            $("#e5").css("display", "none");
            return true;
        } else {
            if ($("#schoolName").val() == "") {
                $("#e1").css("display", "block");
            }else{
                $("#e1").css("display", "none");
            }
            if ($("#time1").val() == "") {
                $("#e2").css("display", "block");
            }else{
                $("#e2").css("display", "none");
            }
            if ($("#time2").val() == "") {
                $("#e3").css("display", "block");
            }else{
                $("#e3").css("display", "none");
            }
            if ($("#content").val() == "") {
                $("#e4").css("display", "block");
            }else{
                $("#e4").css("display", "none");
            }
            if ($("#project").val() == "") {
                $("#e5").css("display", "block");
            }else{
                $("#e5").css("display", "none");
            }
            return false;
        }
        // if ($("#schoolName").val() == "") {
        //   $("#e1").css("display", "block");
        //   return false;
        // } else {
        //   $("#e1").css("display", "none");
        //   if ($("#time1").val() == "") {
        //     $("#e2").css("display", "block");
        //     return false;
        //   } else {
        //     $("#e2").css("display", "none");
        //     if ($("#time2").val() == "") {
        //       $("#e3").css("display", "block");
        //       return false;
        //     } else {
        //       $("#e3").css("display", "none");
        //       if ($("#content").val() == "") {
        //         $("#e4").css("display", "block");
        //         return false;
        //       } else {
        //         $("#e4").css("display", "none");
        //         if (($("#project").val() == "")) {
        //           $("#e5").css("display", "block");
        //           return false;
        //         } else {
        //           $("#e5").css("display", "none");
        //           return true;
        //         }
        //       }
        //     }
        //   }
        // }
    })
</script>

</html>