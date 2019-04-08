<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<html>
<%@ include file="include.jsp"%>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>老人活动情况</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
 <div class="card">
            <div class="card-header">
              <h3 class="card-title">老人姓名：${sessionScope.old.name}</h3>
            </div>
            <div class="card-body">
              <table id="example1" class="table table-bordered table-striped">
               <thead>
                 <tr>
                      <th>活动名</th>
                      <th>日期</th>
                      
                    </tr>
                </thead>
                <tbody>
			         <c:forEach items="${activity}" var="k">
			     		<tr>
							<td>
							${k.activityName}
							</td>
							<td>
							<fmt:formatDate value="${k.createtime}" pattern="yyyy-MM-dd"/>
							</td>
						</tr>
			 		</c:forEach>
			 		
                </tbody>
              <tfoot>
                <tr>
                 <tr>
                      <th>活动名</th>
                      <th>日期</th>
                    </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
          
</div>
<!-- ./wrapper -->

<script>
  $(function () {
    $("#example1").DataTable();
  });
</script>
</body>
</html>
