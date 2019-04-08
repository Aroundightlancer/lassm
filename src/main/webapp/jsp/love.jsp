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
  <title>老人爱好情况</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
        <div class="row">
                <div class="col-md-3">
                  <!-- Widget: user widget style 2 -->
                  <div class="card card-widget widget-user-2">
                    <!-- Add the bg color to the header using any of the bg-* classes -->
                    <div class="widget-user-header bg-primary-gradient">
                      <!-- /.widget-user-image -->
                      <div class="row">
                      <div class="col-md-7">
                      <h3 class="">青菜</h3></div>
                      <div class="col-md-5">
                      <h5 class="widget-user-desc">10</h5></div>
                    </div>
                    </div>
                    <div class="card-footer p-0">
                      <ul class="nav flex-column">
                        <li class="nav-item">
                          <a href="#" class="nav-link">
                            喜爱程度 <span class="float-right badge bg-success">每餐都要吃</span>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a href="#" class="nav-link">
                            医生建议 <span class="float-right badge bg-info">可以多吃</span>
                          </a>
                        </li>
                       
                      </ul>
                    </div>
                  </div>
                  <!-- /.widget-user -->
                </div>
              </div>
</div>
<!-- ./wrapper -->

</body>
</html>
