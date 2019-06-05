<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" />
	<title>Calculator</title>
</head>
<body>
	<div class="wrapper">
		<%
    		Integer tong = (Integer) request.getAttribute("tong");
    	%>
		<form action="<%=request.getContextPath()%>/calculator" method="post" >
			<h1>Nhập số vào ô trống</h1>
			<div class="form-control">
				<label class="number">Nhập số thứ 1:</label>
				<input type="text" name ="number1" value='<% if(request.getParameter("number1") != null) out.print(request.getParameter("number1"));%>'><br>
			</div>
			<div class="form-control">
				<label class="number">Nhập số thứ 2:</label>
				<input type="text" name ="number2" value='<% if(request.getParameter("number2") != null) out.print(request.getParameter("number2"));%>'></br>
			</div>
			<div class="form-control">
				<button type="submit">Tính</button>
			</div>
			<% if (tong != null) { %>
			<span>Tổng của hai số : <% out.print(tong); %></span>
			<% } %>
		</form>
	</div>
</body>
</html>