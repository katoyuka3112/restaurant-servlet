package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comment;

@WebServlet("/comment")
/**
 * Servlet implementation class Comment
 */
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Comment> comments;

    public CommentController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listComment", comments);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/learn/comment.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String comment = request.getParameter("comment");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		
		LocalDateTime now = LocalDateTime.now();
		
		Comment commentObj = new Comment();
		commentObj.setComment(comment);
		commentObj.setName(name);
		commentObj.setDate(now);
		
		if (comments == null) {
			comments = new ArrayList<>();
		}
		
		comments.add(commentObj);
		
		request.setAttribute("listComment", comments);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/learn/comment.jsp");
		rd.forward(request,response);
		
	}

}
