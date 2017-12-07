$(document).ready(function () {

    ue = UE.getEditor('editor');
    ue.ready(function () {
    })

})

function AddConvention() {

    ue = UE.getEditor('editor');
    var content = ue.getContent();
    var title = document.getElementById("title").value;
    var IsUse = "是";

    if ($("#title").val() == "") {
        alert("标题不能为空！");
        return;
    }

    $.ajax({
        type: "POST",
        url: "/blog/newArtical",
        data:{ "Content": content,
            "Title": title,
            "IsUse": IsUse,

        },
        success: function (data) {
            if (data == "0") {
                alert("文章添加成功");
            }
            else {
                alert("添加失败");
            }
        },
        error: function () {
            alert("添加失败，请在后台调试");
        }

    })
}