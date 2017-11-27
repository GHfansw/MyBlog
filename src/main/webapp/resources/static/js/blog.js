$().ready(function(){
    function getAritcals() {
        $.ajax({
            url: '/blog/Articals',
            success: function (datas) {
                alert(datas.toString());
            }
        })
    }
})