<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>用户页面</title>
    <style type="text/css">
    	.div1{
    		width:400px;
    		height:280px;
    		background-color:gray;
    		position: absolute;
    		top:200px;
    		left:200px;
    	}
    	.table1{
    		position: absolute;
    		top:230px;
    		left:230px;
    	}
    	.addDiv{
    		width:400px;
    		height:280px;
    		background-color:gray;
    		position: absolute;
    		top:200px;
    		left:200px;
    	}
    	.table2{
    		position: absolute;
    		top:100px;
    		left:100px;
    	}
    </style>
  </head>
  <body>
  	<form action="user/list.do" method="get">
  		<table>
  			<tr>
  				<td>用户名<input type="text" name="username"></td>
  				<td><input type="submit" value="查询"></td>
  			</tr>
  		</table>
  	</form>
  	<table>
  		<thead>
  			<tr>
  				<th>序号</th>
  				<th>用户名</th>
  				<th>姓名</th>
  				<th>角色名</th>
  				<th>状态</th>
  				<th>操作</th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach items="${ulist}" var="u">
  				<tr>
  					<td></td>
  					<td>${u.userName}</td>
  					<td></td>
  					<td>
  						${u.role.roleName }
  					</td>
  					<td>
  						<input type="checkbox" <c:if test="${u.status eq '1'}">checked="checked"</c:if>>
  					</td>
  					<td>	
  						<button id="edit" onclick="showEdit()">编辑</button>
  						<button id="del" onclick="del('${u.uid}')">删除</button>
<!--   						<a href="javascript:showEdit(${u.uid})">编辑</a> -->
<!--   						<a href="javascript:del(${u.uid})">删除</a> -->
  					</td>
  				</tr>
  			</c:forEach>
  		</tbody>
  	</table>
  	
  	<button id="add" onclick="showAdd()">新增</button>
  		<div class="div1" id="div1">
  			<form>
  			<input type="hidden" id="hiddenUserId" >
  			<table class="table1" id="table1">
  				<tr>
  					<td>状态</td>
  					<td><input type="checkbox"></td>
  				</tr>
  				<tr>
  					<td><input type="button" id="" value="submit"></td>
  					<td><input type="button" onclick="hideEdit()" value="关闭"></td>
  				</tr>
  			</table>
  		</div>
  		<div class="addDiv" id="addDiv">
  			<form action="user/add.do">
	  			<table class="table2" id="table2">
	  				<tr>
	  					<td>用户名</td>
	  					<td><input type="text" name="username"></td>
	  				</tr>
	  				<tr>
	  					<td>密码</td>
	  					<td><input type="text" name="password"></td>
	  				</tr>
	  				<tr>
	  					<td><input type="submit" value="新增"></td>
	  					<td><input type="button" onclick="hideAdd()" value="关闭"></td>
	  				</tr>
	  			</table>
  			</form>
  		</div>
  	<script type="text/javascript" src="js/jquery.min.js"></script>
  	<script type="text/javascript" >
  		$(function(){
  			$("#div1").hide();
  			$("#table1").hide();
  			$("#addDiv").hide();
  			$("table2").hide();
  		});
  		
  		function showEdit(){
  			var id = $("#hiddenUserId").val();
  			$("#div1").show();
  			$("#table1").show();
  		}
  		function hideEdit(){
  			$("#div1").hide();
  			$("#table1").hide();
  		}
  		function showAdd(){
  			$("#addDiv").show();
  			$("table2").show();
  		}
  		function hideAdd(){
  			$("#addDiv").hide();
  			$("table2").hide();
  		}
  		
  		function del(uid){
  			var url = "user/del.do?uid="+uid;
  			$.get(url,function(data){
  				if(data=="success"){
	  				alert("删除成功");
  				}else {
  					alert("删除失败")
  				}
				location.reload(); 		
  			});
  		}
  	</script>
  </body>
</html>
