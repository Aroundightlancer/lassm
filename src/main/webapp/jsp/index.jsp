
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Dashboard</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/dist/css/adminlte.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/iCheck/flat/blue.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/morris/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/datepicker/datepicker3.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>

<body class="hold-transition sidebar-mini">
<div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="index3.html" class="nav-link">Home</a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <!-- Messages Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="fa fa-comments-o"></i>
                    <span class="badge badge-danger navbar-badge">3</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="${pageContext.request.contextPath}/jsp/dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Brad Diesel
                                    <span class="float-right text-sm text-danger"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">Call me whenever you can...</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    John Pierce
                                    <span class="float-right text-sm text-muted"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">I got your message bro</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Nora Silvester
                                    <span class="float-right text-sm text-warning"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">The subject goes here</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
                </div>
            </li>
            <!-- Notifications Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="fa fa-bell-o"></i>
                    <span class="badge badge-warning navbar-badge">15</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <span class="dropdown-item dropdown-header">15 Notifications</span>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-envelope mr-2"></i> 4 new messages
                        <span class="float-right text-muted text-sm">3 mins</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-users mr-2"></i> 8 friend requests
                        <span class="float-right text-muted text-sm">12 hours</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-file mr-2"></i> 3 new reports
                        <span class="float-right text-muted text-sm">2 days</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#"><i
                        class="fa fa-th-large"></i></a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
            <img src="${pageContext.request.contextPath}/jsp/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">AdminLTE 3</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="${pageContext.request.contextPath}/jsp/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">Alexander Pierce</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2" id="mt-2">
                    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                    </ul>
            </nav>
            <!-- /.sidebar-menu -->
            <div id="main"></div>
        </div>
        <!-- /.sidebar -->
    </aside>
    <!-- /.control-sidebar -->
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
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/jsp/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="${pageContext.request.contextPath}/jsp/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${pageContext.request.contextPath}/jsp/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${pageContext.request.contextPath}/jsp/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${pageContext.request.contextPath}/jsp/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.request.contextPath}/jsp/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="${pageContext.request.contextPath}/jsp/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.request.contextPath}/jsp/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/jsp/dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.request.contextPath}/jsp/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/jsp/dist/js/demo.js"></script>
<script>
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
                var url = this.href;//aÃ¦Â ÂÃ§Â­Â¾Ã¤Â¸ÂÃ§ÂÂÃ©ÂÂ¾Ã¦ÂÂ¥
                if (url != "javascript:void(0)")//Ã¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
                {
                    $("#main").html = "";
                    $("#main").load(url);
                    return false;
                }
                else if(this.parentNode.children.length>1)//ä¸æ¯ç¬¬ä¸æ¬¡ç¹å»
                {
                    return;
                }
                else {
                    var ul=" <ul class=\"nav nav-treeview\">";
                    var li="";
                    var i="";
                    var a="";
                    var p="";
                    var i1="";
                     menuid=1;
                     userType=0;
                    var parentId=this.name;//Ã§ÂÂ¹Ã¥ÂÂ»Ã§ÂÂÃ©Â¡Â¹Ã§ÂÂnameÃ¥Â±ÂÃ¦ÂÂ§
                    $.ajax({
                        type: 'POST',
                        url: '/lassm/menu/getChild',
                        data: {
                        	parentId : parentId,
                        	userType : userType,
                        },
                        dataType: 'json',
                        
                        async: false,
                        contentType: false,//Ã¥Â¿ÂÃ©Â¡Â»Ã¦ÂÂ
                        processData: false,//Ã¥Â¿ÂÃ©Â¡Â»Ã¦ÂÂ
                        success: function (data) {
                            for (i = 0; i < data.length; i++)
                            {
                                li += "<li class=\"nav-item ";
                                a += "<a href=\"" +data[i].url + "\" " + " class=\"nav-link\""+ " name=\"" + data[i].id +"\">";
                                i += "<i class=\"nav-icon " + "fa fa-dashboard\"" + " ></i>";
                                p += "<p>" + data[i].name ;
                                if (data[i].url == 'javascript:void(0)')//Ã¤Â¸ÂÃ¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
                                    {
                                        li += "has-treeview \"";
                                        i1+="<i class=\"right fa fa-angle-left\"></i>";
                                    }
                                    else
                                    {
                                        li+="\"";
                                    }
                                            
                                li +=">";
                            }
                            var html =ul+ li + a + i + p +i1 + "</p></a></li></ul>";
                         
                            var c = this.parentNode;
                            $(c).append(html);

                        }

            })
                }
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
        var menuid=1;
        var userType=0;
        var i1="";

        $.ajax({
            type: 'POST',
            contentType: "application/json; charset=utf-8",
            url: '${pageContext.request.contextPath}/menu/getChild',
            data: {
            	"parentId" : parentId,
            //    menuid:menuid,
            	"userType" : userType
            },
            dataType: 'json',
            async:false,
            contentType:false,//必须有
            processData:false,//必须有
            success: function (data) {
               for (i = 0; i < data.length; i++) {
                    li += "<li class=\"nav-item ";
                    a += "<a hrefs=\"" + data[i].url + "\" " + " class=\"nav-link\""+ " name=\"" + data[i].id +"\">";
                    i += "<i class=\"nav-icon " + "fa fa-dashboard\" ></i>";
                    p += "<p>" + data[i].name ;
                    if (data[i].url == 'javascript:void(0)')//Ã¤Â¸ÂÃ¦ÂÂ¯Ã¥ÂÂ¶Ã¥Â­Â
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
                    li = "";
                    a = "";
                    i = "";
                    p = "";
                    i1="";

                }
                html+=li + a + i + p +i1+ "</p>"+ "</a></li>";
            

                $("#mt-2 ul").append(html);
                // $("#main").html = "";
                // $("#main").load("../../food.html");
            }
        });
    };

</script>
<script>
init()
</script>

</body>

</html>