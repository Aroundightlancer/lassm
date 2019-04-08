<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title> Login</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/iCheck/square/blue.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/dist/css/adminlte.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/plugins/iCheck/square/blue.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
    </div>
    <div class="card">
        <div class="card-body login-card-body">
            <p class="login-box-msg">养老院亲属管理系统登录</p>

            <form action="${pageContext.request.contextPath}/User/CheckLogin" method="post">
                <div class="form-group has-feedback">
                    <input name="name" type="text" class="form-control" placeholder="用户名" required="required">
                    <span class="glyphicon glyphicon-user form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input name="pwd" type="password" class="form-control" placeholder="密码" required="required">
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <div class="row">
                    <div class="col-8">

                    </div>
                    <!-- /.col -->
                    <div class="col-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>
            <div class="error"><c:if test="${flag!=null }"><font color="red">${flag}</font></c:if></div>
            
            <p class="mb-1">
                <a href="#">忘记密码</a>
            </p>
            <p class="mb-0">
                <a href="register.html" class="text-center">注册</a>
            </p>
        </div>
    </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/jsp/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/jsp/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/jsp/plugins/iCheck/icheck.min.js"></script>

</body>
</html>
