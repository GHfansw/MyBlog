$().ready(function(){
    function getAritcals() {
        $.ajax({
            url: "/blog/Articals",
            success: function (data) {
                alert(data.toString());
            }
        })
    }
    getAritcals();
});