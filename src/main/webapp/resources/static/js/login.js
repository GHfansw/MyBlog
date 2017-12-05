// function IbtnEnter_onclick() {
//     checklogin();
//     return false;
// }

function checklogin() {

    if ($("#accountId").val() == "" || $("#accountId").val().length < 1 || $("#accountId").val().length > 30 ) {
        //$("#tip").html("提示：用户名必须填写，并且长度必须在5-30个字符之间！");
        $("#accountId").focus();
        return false;
    }
    else{
        //$("#tip").html(" ");
    }

    if ($("#password").val() == "" || $("#password").val().length < 1 || $("#password").val().length > 20 ) {
        //$("#tip").html("提示：密码必须填写，并且长度必须在8-20个字符之间！");
        $("#password").focus();
        return false;
    }
    else{
       // $("#tip").html(" ");
    }

    // if ($("#verifycode").val().trim() == "" || $("#verifycode").val().trim() != $("#hiddencode").val().trim()) {
    //     //$("#tip").html("提示：验证码计算有误！");
    //     $("#verifycode").focus();
    //     return false;
    // }
    // else{
    //     //$("#tip").html(" ");
    // }

    $.ajax({
        type: "GET",
        url: "/account/login",
        // dataType : 'json',
        data : $('#loginform').serialize(),
        success: function (data) {
            if (data == 1) {
                alert("登入失败，用户名或密码错误！");
                $("#password").val("");
                //$("#verifycode").val("");
                //getverifycode();
                $("#password").focus();
                return false;
            }
            else {
                alert(data);
                location.href = "blog.html";
                return true;
            }
        }
    })
}