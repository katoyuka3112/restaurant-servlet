/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-05 14:18:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/reset.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" />\n");
      out.write("\t<title>Calculator</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t");

    		Integer tong = (Integer) request.getAttribute("tong");
    	
      out.write("\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/calculator\" method=\"post\" >\n");
      out.write("\t\t\t<h1>Nhập số vào ô trống</h1>\n");
      out.write("\t\t\t<div class=\"form-control\">\n");
      out.write("\t\t\t\t<label class=\"number\">Nhập số thứ 1:</label>\n");
      out.write("\t\t\t\t<input type=\"text\" name =\"number1\" value='");
 if(request.getParameter("number1") != null) out.print(request.getParameter("number1"));
      out.write("'><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-control\">\n");
      out.write("\t\t\t\t<label class=\"number\">Nhập số thứ 2:</label>\n");
      out.write("\t\t\t\t<input type=\"text\" name =\"number2\" value='");
 if(request.getParameter("number2") != null) out.print(request.getParameter("number2"));
      out.write("'></br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-control\">\n");
      out.write("\t\t\t\t<button type=\"submit\">Tính</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
 if (tong != null) { 
      out.write("\n");
      out.write("\t\t\t<span>Tổng của hai số : ");
 out.print(tong); 
      out.write("</span>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
