<%@page import="model.Comment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Comment comment = (Comment) request.getAttribute("comment"); %>
<div class="content">
	<div class="datetime">
		<span><%=comment.getDate("yyyy-MM-dd HH:mm:ss") %></span>
	</div>
	<div class="name">
		<span><%=comment.getName() %></span>
	</div>
	<div class="comment">
		<p><%=comment.getComment() %></p>
	</div>
</div>