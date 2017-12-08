$(document).ready(function () {

    ue = UE.getEditor('content');
    ue.ready(function () {
    })

})

function AddConvention() {

    ue = UE.getEditor('content');

    var content = ue.getContent();
    // alert(content);
    var title = document.getElementById("title").value;
    var by = document.getElementById("by").value;
    var description = document.getElementById("description").value;
    var tags = [];
    tags.push("sssss");
    var comments = [];
    comments.push("ssq")
    if ($("#title").val() == "") {
        alert("标题不能为空！");
        return;
    }

    var artical = {
        "title:": title,
        "description":description,
        "by":by,
        // "tags": tags,
        "views":4,
        // "comments":comments,
        "likes":0,
        "content":content,
    }
    alert(title);
    $.ajax({
        type: "POST",
        url: "/blog/newArtical",
        // contentType: "application/json",
        // data:JSON.stringify({
        //     "title:": title,
        //     "description":description,
        //     "by":by,
        //     // "tags": tags,
        //     "views":4,
        //     // "comments":comments,
        //     "likes":0,
        //     "content":content,
        // }),
        data:artical,
        dataType:"json",
        // tradition:true,
        success: function (data) {
            if (data.error == "0") {
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