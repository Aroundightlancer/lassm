<%@page import="com.te.model.Old"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        
<html>

<%@ include file="include.jsp"%>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <style type="text/css">
  .liked{color:red}
  </style>
  <title>老人基础信息</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body class="hold-transition sidebar-mini">

<div class="wrapper">

  <!-- Content Wrapper. Contains page content -->
  <!-- <div class="content-wrapper"> -->
    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-3">
            <!-- Profile Image -->
            <div class="card card-primary card-outline">
              <div class="card-body box-profile">
                <div class="text-center">
                  <img class="profile-user-img img-fluid img-circle"
                       src="dist/img/user4-128x128.jpg"
                       alt="User profile picture">
                </div>                
                <button type="button" class="btn btn-block btn-default btn-sm" onclick="change()" id="change">修改信息</button>
                <h3 class="profile-username text-center" id="name"></h3>
                <ul class="list-group list-group-unbordered mb-3">
                 <li class="list-group-item">
                    <b >姓名：</b>
                     <input id="username" class="form-control form-control-sm" disabled="true" type="text" value="${sessionScope.old.name}">

                  </li>
                  <li class="list-group-item">
                    <b >年龄：</b> 
                    <input id="age" class="form-control form-control-sm" type="text" disabled="true" value="${sessionScope.old.age}">
                    
                  </li>
                  <li class="list-group-item">
                     <b >生日：</b> 
                    <input id="birthday" class="form-control form-control-sm " disabled="true" type="text" value="${sessionScope.old.birthday}">
                    
                  </li>
                  <li class="list-group-item">
                    <b>性别</b> 
                    <input id="sex" class="form-control form-control-sm" disabled="true" type="text" value="${sessionScope.old.sex}">
                    
                  </li>
                  <li class="list-group-item" id="save">
                  <button type="button" class="btn btn-block btn-danger btn-sm" onclick="save()" >保存</button>
                  </li>
                </ul>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->

            <!-- About Me Box -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">其他信息</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <strong><i class="fa fa-book mr-1"></i> 个性签名</strong>

                <p class="text-muted">
                  	${sessionScope.old.introduction}
                </p>

                <hr>

               </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
          <div class="col-md-9">
            <div class="card">
              <div class="card-header p-2">
                <ul class="nav nav-pills">
                  <li class="nav-item"><a class="nav-link active" href="#activity" data-toggle="tab">最近动态</a></li>
                 </ul>
              </div><!-- /.card-header -->
              <div class="card-body">
              
                   <c:forEach items="${friendCycle}" var="k" > 
                    <div class="tab-content">
                  <div class="active tab-pane" id="activity">   
                         
                    <!-- Post -->
	                    <div class="post">
	                      <div class="user-block">
	                        <img class="img-circle img-bordered-sm" src="dist/img/user4-128x128.jpg" alt="User Image">
	                        <span class="username">
	                          <a href="#">${sessionScope.old.name}</a>
	                          <a href="#" class="float-right btn-tool"><i class="fa fa-times"></i></a>
	                        </span>
	                        <span class="description">${sessionScope.old.name}发布朋友圈-<fmt:formatDate value="${k.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
	                      </div>
	                      <!-- /.user-block -->
	                       <p name="msg">
	                        ${k.content}
	                      </p>
	                      <div class="row mb-3">
	                        <div class="col-sm-6">
	                          <img class="img-fluid" src="dist/img/photo1.png" alt="Photo">
	                        </div>
	                       
	                          </div>
	                          <!-- /.row -->
	                        </div>
	                        <!-- /.col -->
	                      </div>
	                      <!-- /.row -->
	
	                      <p>
	                        <a href="javascript:void(0)" class="link-black text-sm" onclick="zan(${k.friendCycleArticleId})" id="like${k.friendCycleArticleId}">
	                        <i class="fa fa-thumbs-o-up mr-1"></i></a>
	                        <span class="float-right" name="fff" id="p${k.friendCycleArticleId}">
	                          <a href="javascript:void(0)" class="link-black text-sm" name="${k.friendCycleArticleId}">
	                            <i class="fa fa-comments-o mr-1"></i>查看评论
	                          </a>
	                        </span>
	                      </p>
	                      <div id="pl${k.friendCycleArticleId}">
	                      		
	                      </div>
	                      <input class="form-control form-control-sm" type="text" placeholder="评论" id="pinglun${k.friendCycleArticleId}" data-pid="${k.id}" data-friendid="${k.friendCycleArticleId}">
	               		<button type="button" class="btn btn-block btn-default btn-sm" onclick="sub(${k.friendCycleArticleId})" id="${k.friendCycleArticleId}">提交</button>
	               			
	                      </div>
                </c:forEach> 
                  <!-- /.tab-pane -->
                </div>
                <!-- /.tab-content -->
              </div><!-- /.card-body -->
            </div>
            <!-- /.nav-tabs-custom -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
    <!-- /.content -->
  <!-- </div> -->
  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->
<script>
//$('#username').removeAttr("disabled");
$('#birthday').datepicker({
    autoclose: true,
    format: "yyyy-mm-dd"
  });
  function change()
  {
	  $('#birthday').removeAttr("disabled");
	  $('#age').removeAttr("disabled");
	  $('#sex').removeAttr("disabled");
	  $("#save").show();

  }
  
  function init()
  {
	  $("#save").hide();
	  if(<%=request.getParameter("rel")%>!=3)
	  $("#change").hide();
  }
  $(function () {            
      $("span[name='fff'] a").click(function () {
    	
    	  var friendCycleId=this.name;
    	  var id=this.name;
    	  id="#pl"+id;
    	  var ID=this.name;
    	  id2="#p"+ID;
  		$.ajax({
  	           type: 'POST',
  	           url: '${pageContext.request.contextPath}/old/getpl',
  	           data: {
  	        	   friendCycleId:friendCycleId
  	           },
  	           dataType: 'json',
  	           success: function (data) {
  	        	   var html=""
  	        	   for (j = 0; j < data.length; j++)
                   {
  	        		   
  	        		   html+="<p onclick=\"huifu('"+data[j].name+"',"+ID+","+data[j].id+")\"><a href=\"javascript:void(0)\">"+data[j].name+"</a>";
  	        		   if(data[j].pname!=""&&data[j].pname!=null)
  	        		   {
  	        			   html+="回复"+"<a href=\"javascript:void(0)\">"+data[j].pname+"</a>";
  	        		   }
  	        		   html+=":";
  	        		   html+=data[j].content;
  	        		   html+="</p>";
                   }
  	        	 $(id).html="";
  	        	   $(id).append(html);
  	        	   $(id2).hide();
  	           }
  		})
  	})
  })
  function huifu(name,id,pid)
  {
	  var i="#pinglun";
	  $(i+id).attr('placeholder',"回复"+name);
	  $(i+id).attr('data-pid',pid);
	  $(i+id).attr('data-friendid',id);
	  $(i+id).attr('data-pname',name);
  }
  function sub(id)
  {
	var i="#pinglun"+id;
	var pid=$(i).attr("data-pid");
	var pname=$(i).attr("data-pname");
	var content=$(i).val();
	var friendid=$(i).attr("data-friendid");
	var name="${sessionScope.user.name}";
	 $.ajax({
         type: 'POST',
         url: '${pageContext.request.contextPath}/old/subhf',
         data: {
        	 pid : pid,
        	 pname : pname,
        	 content : content,
        	 friendid : friendid,
        	 name : name
         },
         dataType: 'json',
         success: function (data) {
        	 var html="";
        	 html+="<p onclick=\"huifu('"+data.name+"',"+data.friendCycleArticleId+","+1+")\"><a href=\"javascript:void(0)\">"+data.name+"</a>";
    		   if(data.pname!=""&&data.pname!=null)
    		   {
    			   html+="回复"+"<a href=\"javascript:void(0)\">"+data.pname+"</a>";
    		   }
    		   html+=":";
    		   html+=data.content;
    		   html+="</p>";
    		   var id="#pl"+data.friendCycleArticleId;
    		   $(id).append(html);
    		   $("#pinglun"+data.friendCycleArticleId).val("");
         }
	 })
  }
  function save()
  {
	  var age=$("#age").val();
	  var birthday=$("#birthday").val();
	  var sex=$("#sex").val();
	  var oldid="${sessionScope.old.id}";
	   $.ajax({
           type: 'POST',
           url: '${pageContext.request.contextPath}/old/update',
           data: {
           	oldid : oldid,
           	birthday : birthday,
           	sex : sex,
           	age : age
           },
           dataType: 'json',
           success: function (data) {
        	   alert("保存成功");
        	   $("#age").val(data.age);
        	   $("#birthday").val(data.birthday);
        	   $("#sex").val(data.sex);
        	   $("#age").attr("disabled","true");
        	   $("#birthday").attr("disabled","true");
        	   $("#sex").attr("disabled","true");
        	   $("#save").hide();
           }
	   })
  }
	function zan(id)
	{
		$("#like"+id).toggleClass('liked');
  }
	
  init();
</script>
<!-- jQuery -->
</body>
</html>