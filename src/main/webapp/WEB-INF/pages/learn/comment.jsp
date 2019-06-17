<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/comment.css" />
<title>Comment</title>
</head>
<body>
<div class="wrapper">
	<div class="left">
		 <form action="<%=request.getContextPath()%>/comment" method="post">
		 	 <div class="form-control-txtarea">
		 		<textarea name="comment" class="txtarea" placeholder="Nội dung bình luận"></textarea>
			 </div>
			 <div class="form-control">
			 	<input type="text" name="name" placeholder="Nhập tên của bạn">
			 </div>
			 <div class="form-control">
			 	<button type="submit" class="button">Bình luận</button>
			 </div>
		 </form>
	</div>
	<div class="right" >
		<div class="content">
			<div class="datetime">
				<span>2019-06-10 22:30:00</span>
			</div>
			<div class="name">
				<span>Yuka ruto</span>
			</div>
			<div class="comment">
				<p>Watashi ha Yuka desu</p>
			</div>
		</div>
		<div class="content">
			<div class="datetime">
				<span>2019-06-10 22:30:00</span>
			</div>
			<div class="name">
				<span>Yuka ruto</span>
			</div>
			<div class="comment">
				<p>Watashi ha Yuka desu</p>
			</div>
		</div>
		<div class="content">
			<div class="datetime">
				<span>2019-06-10 22:30:00</span>
			</div>
			<div class="name">
				<span>Yuka ruto</span>
			</div>
			<div class="comment">
				<p>Watashi ha Yuka desu</p>
			</div>
		</div>
		<div class="page">
			  <a href="#">&laquo;</a>
			  <a href="#">1</a>
			  <a class="active" href="#">2</a>
			  <a href="#">3</a>
			  <a href="#">4</a>
			  <a href="#">5</a>
			  <a href="#">6</a>
			  <a href="#">&raquo;</a>
		</div>
	</div>
</div>
</body>
</html>