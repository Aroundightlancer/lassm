function page(url,pageIndex)
  {
    var html="";
      html+=" <ul class=\"pagination pagination-sm m-0 float-right\">"
      html+="<li class=\"page-item\" onclick=\"fenye("+url+0+")\">首页</li>";
      html+="<li class=\"page-item\" onclick=\"fenye("+url+(pageIndex-1)+")\">上一页</li>";

      html+="<li class=\"page-item\">第"+pageIndex+"页</li>";
      html+="<li class=\"page-item\" onclick=\"fenye("+url+(pageIndex+1)+")\">下一页</li>";
      html+="<lable>共\">"+"页</lable>";
      html+="</ul>";
      $("#page").append(html);

  }