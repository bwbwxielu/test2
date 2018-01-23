<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.11.2.min.js"></script>

</head>
<body>
	<form method="post">
		<table>
		  <tr>
		    <td>客户编号:</td>
		    <td><input type="text" name="kid" id="kid" value="${role.kid}"></td>
		  </tr>
		  <tr>
		    <td>单位名称:</td>
		    <td><input type="text" name="name" id="name" value="${role.name}"></td>
		  </tr>
		  <tr>
		    <td>客户分类:</td>
		    <td><input type="text" name="fenlei" id="fenlei" value="${role.fenlei}"></td>
		  </tr>
		  <tr>
		    <td>联系人电话:</td>
		    <td><input type="text" name="tel" id="tel" value="${role.tel}"></td>
		  </tr>
		  <tr>
		    <td>联系地址:</td>
		    <td><input type="text" name="address" id="address" value="${role.address}"></td>
		  </tr>
		  <tr>
		    <td>开户银行:</td>
		    <td><input type="text" name="yinhang" id="yinhang" value="${role.yinhang}"></td>
		  </tr>
		  <tr>
		    <td>银行账号:</td>
		    <td><input type="text" name="zhanghao" id="zhanghao" value="${role.zhanghao}"></td>
		  </tr>
		  <tr>
		    <td>备注:</td>
		    <td><input type="text" name="beizhu" id="beizhu" value="${role.kid}"></td>
		  </tr>
		  <tr>
		    <td>单位名称简介:</td>
		    <td><input type="text" name="jname" id="jname" value="${role.jname}"></td>
		  </tr>
		  <tr>
		    <td></td>
		    <td><button class="btn btn-warning">修改</button></td>
		  </tr>
		</table>
	</form>
</body>
</html>