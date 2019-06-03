package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorController
 */
@WebServlet("/calculator")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/calculator.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strNumber1 = request.getParameter("number1");
		String strNumber2 = request.getParameter("number2");
		int number1 = Integer.parseInt(strNumber1);
		request.setAttribute("number1", number1);
		int number2 = Integer.parseInt(strNumber2);
		request.setAttribute("number1", number1);
		int tong = number1 + number2;
		request.setAttribute("tong", tong);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/calculator.jsp");
		rd.forward(request, response);

	}

}
