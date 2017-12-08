function checkregister() {
    if ($("#accountId2").val() == "" || $("#accountId2").val().length < 1 || $("#accountId2").val().length > 30 ) {
        //$("#tip").html("提示：用户名必须填写，并且长度必须在5-30个字符之间！");
        $("#accountId2").focus();
        return false;
    }
    else{
        //$("#tip").html(" ");
    }

    if ($("#password2").val() == "" || $("#password2").val().length < 1 || $("#password2").val().length > 20 ) {
        //$("#tip").html("提示：密码必须填写，并且长度必须在8-20个字符之间！");
        $("#password2").focus();
        return false;
    }
    else{
        // $("#tip").html(" ");
    }

    $.ajax({
        type: "POST",
        url: "/account/register",
        contentType: "application/json",
        dataType:"json",
        // dataType : 'json',
        data : $('#registerform').serialize(),
        success: function (data) {
            if (data.error == "0") {
                alert("注册成功，已自动登录");
                location.href = "blog.html";
                return true;
            }
            else {
                alert("换个用户名试试?");
                $("#password2").val("");
                $("#password2").focus();
                return false;
            }
        }
    })
}