$(function(){

    $(".button").click(function(){

        if(checkInput()) {

            $("form").action("/login");

        }else{

            return false;

        }

    });

    function checkInput(){

        //判断用户名

        if($("input[name=username]").val() == null || $("input[name=username]").val() == ""){

            alert("用户名不能为空");

            $("input[name=username]").focus();

            return false;

        }

        //判断密码

        if($("input[name=password]").val() == null || $("input[name=password]").val() == ""){

            alert("密码不能为空");

            $("input[name=password]").focus();

            return false;

        }