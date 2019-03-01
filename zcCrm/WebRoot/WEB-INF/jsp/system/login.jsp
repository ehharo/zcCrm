<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  <body>
  	<form action="loginCheck.do" method="post">
  		<table>
  			<tr>
  				<td>用户名</td>
  				<td><input type="text" name="username"></td>
  			</tr>
  			<tr>
  				<td>密码</td>
  				<td><input type="password" name="password"></td>
  			</tr>
  			<tr>
  				<td><input type="submit" value="登录"></td>
  				<td><input type="reset" value="清空"></td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
