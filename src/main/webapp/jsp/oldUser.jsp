<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<html>
<%@ include file="include.jsp"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Dashboard</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Font Awesome -->
   
</head>
<body>
<div class="wrapper">
      <!--   <div class="card">
                <div class="card-body p-0">
                  <table class="table table-striped">
                    <tr>
                      <th style="width: 10px">#</th>
                      <th>老人姓名</th>
                      <th>性别</th>
                      <th>年龄</th>
                      <th>关系</th>
                    </tr>
                    <tr>
                      <td>1.</td>
                      <td><a  id="name" name="name" title="点击进入老人详细信息页" href="">software</a> </td>
                      <td id="sex" name="sex">
                        
                      </td>
                      <td id="age" name="age"></td>
                      <td id="relationship" name="relationship"></td>
                    </tr>
                   
                  </table>
                </div>        
                <tr>
                  <td><a  id="name" name="name" title="点击进入老人详细信息页" href="">张三</a></td>
                  <td>男
                  </td>
                  <td>128</td>
                  <td>父母</td>
                </tr>
                <tr>
                  <td><a  id="name" name="name" title="点击进入老人详细信息页" href="">李四</a></td>
                  <td>男
                  </td>
                  <td>84</td>
                  <td>亲属</td>
                </tr>
                <tr>
                  <td><a  id="name" name="name" title="点击进入老人详细信息页" href="">王五</a></td>
                  <td>女
                  </td>
                  <td>73</td>
                  <td>朋友</td>
                </tr>
                     
                 </div> -->
            <div class="card">
            <div class="card-header">
              <h3 class="card-title">与您相关的老人列表</h3>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>老人姓名</th>
                  
                  <th>与您的关系</th>
                </tr>
                </thead>
                <tbody>
			        <c:forEach items="${oldusers}" var="k" >
			     		<tr>
							<td>
							<a title="点击进入老人详细信息页" href="${pageContext.request.contextPath}/jsp/index1.jsp?id=${k.oldId}&rel=${k.relationship}">
							${k.oldName}
							</a></td>
							<td>
							<c:if test="${k.relationship==1}">
								朋友
							</c:if>
							<c:if test="${k.relationship==2}">
								亲属
							</c:if>
							<c:if test="${k.relationship==3}">
								子女
							</c:if>
							</td>
						</tr>
			 		</c:forEach>
			 		
                </tbody>
                <tfoot>
                <tr>
                 <tr>
                  <th>老人姓名</th>
                  <th>与您的关系</th>
                </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
</div>
<!-- ./wrapper -->

</body>
<script>
  $(function () {
    $("#example1").DataTable();
  
  });
</script>
</html>
