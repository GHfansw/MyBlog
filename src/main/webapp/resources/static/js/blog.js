$().ready(function(){
    function getAritcals() {
        $.ajax({
            url: "/blog/Articals",
            method: "GET",
            success: function (data) {
                // alert(data.toString());
                var json = JSON.parse(data);

                var blog = $(".col-md-8.blog_left")
                $.each(json,function(index,item){
                    // alert("index: "+index+"\ntitle: "+item.title);
                    var htmlcontent = '<div class="blog_main">\n' +
                        '                    <h4><a href="single-page.html">'+item.title+'</a></h4>\n' +
                        '                <div class="blog_list pull-left">\n' +
                        '                    <ul class="list-unstyled">\n' +
                        '                    <li><i class="fa fa-calendar-o"></i><span>June 3, 2013</span></li>\n' +
                        '                <li><a href="#"><i class="fa fa-comment"></i><span>Comments</span></a></li>\n' +
                        '                <li><i class="fa fa-user"></i><span>'+item.by+'</span></li>\n' +
                        '                <li><a href="#"><i class="fa fa-eye"></i><span>124 views</span></a></li>\n' +
                        '                </ul>\n' +
                        '                </div>\n' +
                        '                <div class="b_left pull-right">\n' +
                        '                    <a href="" onclick="like(this);return false;"><i class="fa fa-heart"></i><span> '+item.likes+'</span></a>\n' +
                        '                </div>\n' +
                        '                <div class="clearfix"></div>\n' +
                        '                    <p class="para">'+item.description+'</p>\n' +
                        '                <div class="read_more btm">\n' +
                        '                    <a href="single-page.html">view more</a>\n' +
                        '                </div>\n' +
                        '                </div>'
                    blog.append(htmlcontent)
                })
            }
        })
    }
    getAritcals();
});

function like(obj){
    // alert($(obj));
    var liketag = obj.childNodes[1];
    // alert(liketag);
    liketag.innerHTML = (parseInt(liketag.innerHTML) + 1).toString();
    var titletag = obj.parentNode.parentNode.getElementsByTagName('h4')[0].getElementsByTagName('a')[0];
    var title = titletag.innerHTML;
    // alert(title);
    $.ajax({
        url: "/blog/addlike/"+title,
        method: "GET",
        success: function (data) {

        }
    })

}