<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.11.2.min.js"></script>
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
	$(function(){
		$(".btn-success").click(function(){
			location="add";
		});
		$(".btn-primary").click(function(){
			var id=$(this).val();
			location=id+"/del";
		});
		$(".btn-warning").click(function(){
			var id=$(this).val();
			location=id+"/update";
		});
	})
</script>
</head>
<body>
	<div class="container">
		<form action="list">
			<input type="text" name="lname" value="${lname}">
			<input type="submit" value="搜索">
		</form>
		<table class="table table-bordered table-hover">			
			<tr>
			  <td>编号</td>
			  <td>客户编号</td>
			  <td>单位名称</td>
			  <td>客户分类</td>
			  <td>联系人电话</td>
			  <td>联系地址</td>
			  <td>开户银行</td>
			  <td>银行账号</td>
			  <td>备注</td>
			  <td>单位名称简介</td>
			  <td>编辑  |  
			  <button class="btn btn-success" value="add()">添加</button></td>
			</tr>
			<c:forEach items="${pager.datas}" var="l">
			  <tr>
			    <td>${l.id}</td>
			    <td>${l.kid}</td>
			    <td>${l.name}</td>
			    <td>${l.fenlei}</td>
			    <td>${l.tel}</td>
			    <td>${l.address}</td>
			    <td>${l.yinhang}</td>
			    <td>${l.zhanghao}</td>
			    <td>${l.beizhu}</td>
			    <td>${l.jname}</td>
			    <td><button class="btn btn-warning" value="${l.id}">修改</button>
					<button class="btn btn-primary" value="${l.id}">删除</button></td>
			  </tr>
			</c:forEach>
			<tr>
			  <td colspan="10" align="center">
			  	<jsp:include page="/resources/inc/pager.jsp">
			  		<jsp:param value="${pager.total}" name="items"/>
			  		<jsp:param value="list" name="url"/>
			  	</jsp:include>
			  </td>
			</tr>
		</table>
	</div>
</body>
</html>