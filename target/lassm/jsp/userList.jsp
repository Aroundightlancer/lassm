<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<SCRIPT type="text/javascript">
function del(){
if(confirm("真的要删除该条记录吗?")){
return true;
}else{
return false;
}
}
</SCRIPT>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr> 
		<th>编号</th>
		<th>用户名</th>
		<th>密码</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${User}" var="k" >
	<tr>
		<td>${k.id}</td>
		<td>${k.name}</td>
		<td>${k.pwd}</td>
		<td>
		<a href="${pageContext.request.contextPath}/User/del/${k.id}" onclick = "return del()">shanchu</a>
		</td>
		</tr>
 		</c:forEach>
</table>

</body>
</html>