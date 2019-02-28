<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>文件上传下载</title>  
</head>  

<body>  
<!--D:\javap\.metadata\.plugins\org.eclipse.wst.server.core\tmp3\wtpwebapps-->
   <form action="${pageContext.request.contextPath}/User/CheckLogin" method="post">
		<div class="input">
			<span class="u_user"></span>
			<input name="username" class="text" onfocus=" if(this.value=='输入ID或用户名登录') this.value=''" 
			onblur="if(this.value=='') this.value='输入ID或用户名登录'" 
			
			value="输入ID或用户名登录" >
		</div>
		<div class="input">
			<label class="l-login login_password">输入密码</label>
			<input name="password" class="text" 
			 type="password">
		</div>
		<div class="mb2"><input type = "submit" class="act submit" value="登录"></div>
	</form>
	 <form action="${pageContext.request.contextPath}/file/insert" class="fileAndSystemForm" id="fileAndSystemForm" name="fileAndSystemForm"
	  method="post" enctype="multipart/form-data">
	 <div class="block file">
            <label>文件</label>
            <input type="file" name="file" id = "file"> 
            <input type="submit" value="提交">
        </div>    
        </form>
        <form action="${pageContext.request.contextPath}/User/insert" method="post">
	        <input id="name" name="name" type="text"  onblur="register()">
	        <div id="error"></div>
	        <input name="pwd" type="text">
	        <input type="submit" value="添加" >
	        
        </form>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery.min.js"></script>      
<script type="text/javascript">
	function register() {
		var username=document.getElementById("name").value;
		if(username==""){
			$("#error").html("<div style='color:red'>请输入用户名</div>");
			return ;
		}
		$.ajax({
			type : 'POST',
			url : '${pageContext.request.contextPath}/User/registeryz',
			dataType:"json",
			data:{"name":$("#name").val()},
			success : function(date) {
				if (date.id > 0) {
					$("#error").html("<div style='color:red'>用户名存在</div>");
				} else {
					$("#error").html("<div style='color:green'>用户名可以注册</div>");
				}
			},
			error : function(date) {
				alert("ajax失败");
			}
		});
	};
</script>
</body>  
</html> 