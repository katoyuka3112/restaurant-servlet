<%@page import="model.Comment"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/comment.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $.ajax({
    	url: "<%=request.getContextPath()%>/comment-ajax",
    	data: {
    		name: $("input[name=name]").val(),
    		comment: $("textarea[name=comment]").val(),
    	},
    	method: "POST",
    	success: function(result){
      		$("#comments").prepend(result);
    	}
   	});
  });
});
</script>
<title>Comment</title>
</head>
<body>
<div class="wrapper">
	<div class="left">
		 <form action="javascript:void(0)" method="post">
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
	<% List<Comment> listComment = (ArrayList) request.getAttribute("listComment"); %>
	<div class="right" id="comments">
	<%
	if (listComment != null) {
		for (int i = listComment.size() - 1; i >= 0; i--) { %>
		<div class="content">
			<div class="datetime">
				<span><%=listComment.get(i).getDate("yyyy-MM-dd HH:mm:ss") %></span>
			</div>
			<div class="name">
				<span><%=listComment.get(i).getName() %></span>
			</div>
			<div class="comment">
				<p><%=listComment.get(i).getComment() %></p>
			</div>
		</div>
	<%}} %>
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