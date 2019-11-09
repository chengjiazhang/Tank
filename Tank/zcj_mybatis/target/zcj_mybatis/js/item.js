window.onload=function(){
    var otxt=document.getElementById("txt");
    var ocount=document.getElementById("count");
    otxt.oninput=function(){
        ocount.innerHTML=otxt.value.length+"字/1500字";
    }

    var otxt1=document.getElementById("txt1");
    var ocount1=document.getElementById("count1");
    otxt1.oninput=function(){
        ocount1.innerHTML=otxt1.value.length+"字/1500字";
    }
}
