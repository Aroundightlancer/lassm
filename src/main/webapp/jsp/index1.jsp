<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<html>

<%@ include file="include.jsp"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>养老院亲属访问子系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body class="hold-transition sidebar-mini">
<div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="javascript:void(0)"><i class="fa fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="javascript:void(0)" class="nav-link" onclick="home1()">Home</a>
            </li>
             <li class="nav-item d-none d-sm-inline-block">
                <a href="javascript:void(0)" class="nav-link" onclick="home1()">注销</a>
            </li>
        </ul>

        <!-- Right navbar links -->
      
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
            <img src="${pageContext.request.contextPath}/jsp/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">亲属访问</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="${pageContext.request.contextPath}/jsp/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">zxd</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2" id="mt-2">
                    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                    </ul>
            </nav>
            <!-- /.sidebar-menu -->
          
        </div>
        <!-- /.sidebar -->
    </aside>
    <!-- /.control-sidebar -->
  <div class="content-wrapper">
  <div id="main"></div>
  </div>
</div>
<!-- ./wrapper -->
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/jsp/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button)
</script>

<script>
	function home1()
	{
		u="<%=request.getContextPath()%>/jsp/";
    	//u="<"+"%="+ "path"+ "%>/jsp/" + url;
        $("#main").html = "";
       u+="oldinformation.jsp"
        $("#main").load(u);
	}
    $(function () {
//         $(document).on('click', '.nav-link',function(){
// console.log("hhh");
// })
        $(document).on('click', '.nav-link',function(e) {
            
          //  e.preventDefault();
            //ifÃ¥ÂÂ¤Ã¦ÂÂ­Ã¨Â¯Â¥aÃ¦Â ÂÃ§Â­Â¾Ã¦ÂÂ¯Ã¥ÂÂ¦Ã¥Â·Â²Ã§Â»ÂÃ¨Â¢Â«Ã§ÂÂ¹Ã¥ÂÂ»
            //Ã¥Â¦ÂÃ¦ÂÂÃ¦Â²Â¡Ã¦ÂÂÃ¦ÂÂ§Ã¨Â¡ÂÃ¤Â¸ÂÃ©ÂÂ¢Ã¦ÂÂÃ¤Â½Â
            if (!$(this).is(".active")) {
                // Ã©ÂÂÃ¥ÂÂÃ¨Â¿ÂÃ¤Â¸ÂÃ¤Â¸ÂªaÃ¦Â ÂÃ§Â­Â¾Ã¯Â¼ÂÃ§Â§Â»Ã©ÂÂ¤Ã¥ÂÂÃ¦ÂÂ¥Ã§ÂÂclassÃ¤Â¸Â­Ã§ÂÂactiveÃ¯Â¼Â
                $("#mt-2 a").each(function () {
                    $(this).removeClass("active");
                })
                // Ã§Â»ÂÃ¥Â½ÂÃ¥ÂÂÃ¨Â¢Â«Ã§ÂÂ¹Ã¥ÂÂ»Ã§ÂÂaÃ¦Â ÂÃ§Â­Â¾Ã¯Â¼ÂÃ¦Â·Â»Ã¥ÂÂ active
                $(this).addClass("active");
                if($(this.parentNode)!=null){
                $(this.parentNode).addClass("active");}
               
                var url =$(this).attr("href");//aÃ¦Â ÂÃ§Â­Â¾Ã¤Â¸ÂÃ§ÂÂÃ©ÂÂ¾Ã¦ÂÂ¥
                var html="";
                var t=this;
                if (url != "javascript:void(0)")//Ã¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
                {
                	
                	u="<%=request.getContextPath()%>/jsp/";
                	//u="<"+"%="+ "path"+ "%>/jsp/" + url;
                    $("#main").html = "";
                   u+=url;
                   u+=".jsp"
                    $("#main").load(u,{
                    	url:url
                    });
                    return false;
                }
                else if(this.parentNode.children.length>1)//ä¸æ¯ç¬¬ä¸æ¬¡ç¹å»
                {
                    return;
                }
                else {
                    var ul=" <ul class=\"nav nav-treeview\">";
                    html=ul;
                    var li="";
                    var i="";
                    var a="";
                    var p="";
                    var i1="";
                    var menuid=1;
                    var userType=0;
                    var parentId=this.name;//Ã§ÂÂ¹Ã¥ÂÂ»Ã§ÂÂÃ©Â¡Â¹Ã§ÂÂnameÃ¥Â±ÂÃ¦ÂÂ§
                    $.ajax({
                        type: 'POST',
                        url: '${pageContext.request.contextPath}/menu/getChild',
                        data: {
                        	parentId : parentId,
                        	userType : userType,
                        },
                        dataType: 'json',
                        success: function (data) {
                            for (j = 0; j < data.data.length; j++)
                            {
                       	  		li = "";
                                a = "";
                                i = "";
                                p = "";
                                i1="";
                                li += "<li class=\"nav-item ";
                                a += "<a href=\"" +data.data[j].url + "\" " + " class=\"nav-link\""+ " name=\"" + data.data[j].id +"\">";
                                i += "<i class=\"nav-icon " + data.data[j].icon + "\"" + " ></i>";
                                p += "<p>" + data.data[j].name ;
                                if (data.data[j].url == 'javascript:void(0)')//Ã¤Â¸ÂÃ¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
                                    {
                                        li += "has-treeview \"";
                                        i1+="<i class=\"right fa fa-angle-left\"></i>";
                                    }
                                    else
                                    {
                                        li+="\"";
                                    }
                                            
                                li +=">";
                                html += li + a + i + p +i1 + "</p></a></li>";

                            }
                            html+="</ul>";
                            var c=t.parentNode;
                            $(c).append(html);
                           // var html =ul+ li + a + i + p +i1 + "</p></a></li></ul>";
                        } })
          //  var c = this.parentNode;
            //        $(c).append(html);

                }
            }
            else
            {
                return false;
            }
            })
    });
    function init() {

        var li = "";
        var a = "";
        var i = "";
        var p = "";
        var html = "";
        var parentId = 0;
        var menuid=2;
        var userType=0;
        var i1="";
        $.ajax({
        	 type: 'POST',
             url: '${pageContext.request.contextPath}/menu/getChild',
             data: {
					parentId : parentId,
					userType : userType,
					},
			dataType: 'json',
			success: function (data) {
				var ac="active";
               for (j = 0; j < data.data.length; j++) {
            	   li = "";
                   a = "";
                   i = "";
                   p = "";
                   i1="";
                   li += "<li class=\"nav-item ";
                   
                   a += "<a href=\"" + data.data[j].url + "\" " + " class=\"nav-link "+ac+"\""+ " name=\"" + data.data[j].id +"\">";
                   ac="";
                   i += "<i class=\"nav-icon " + data.data[j].icon + "\" ></i>";
                   p += "<p>" + data.data[j].name;
                   if (data.data[j].url == 'javascript:void(0)')//Ã¤Â¸ÂÃ¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
                   {
                       li += "has-treeview \"";
                       i1+="<i class=\"right fa fa-angle-left\"></i>";
                   }
                   else
                   {
                       li+="\"";
                   }
                   li +=">";  
                   html += li + a + i + p +i1+ "</p>"+ "</a></li>";
                 

                }            

                $("#mt-2 ul").append(html);
                // $("#main").html = "";
                // $("#main").load("../../food.html");
            }
        });
    };
    

</script>
<script>
init();
home1();
</script>

</body>

</html>