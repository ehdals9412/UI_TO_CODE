/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2020-04-09 10:33:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <title>UTC</title>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody#LoginForm{ background-image:url(\"https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg\"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:10px;}\n");
      out.write("\t.form-heading { color:#fff; font-size:23px;}\n");
      out.write("\t.modal-header h2{ color:#444444; font-size:18px; margin:0 0 8px 0;}\r\n");
      out.write("\t.modal-header p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}\r\n");
      out.write("\t.login-form .form-control {\r\n");
      out.write(" \t\tbackground: #f7f7f7 none repeat scroll 0 0;\r\n");
      out.write("  \t\tborder: 1px solid #d4d4d4;\r\n");
      out.write("  \t\tborder-radius: 4px;\r\n");
      out.write("  \t\tfont-size: 14px;\r\n");
      out.write("  \t\theight: 50px;\r\n");
      out.write("  \t\tline-height: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.main-div {\r\n");
      out.write("  \t\tbackground: #ffffff none repeat scroll 0 0;\r\n");
      out.write("  \t\tborder-radius: 2px;\r\n");
      out.write("\t\tmargin: 10px auto 30px;\r\n");
      out.write("  \t\tmax-width: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.login-form .form-group {\r\n");
      out.write("  \t\tmargin-bottom:10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.login-form{ text-align:center;}\r\n");
      out.write("\t.forgot a {\r\n");
      out.write("  \t\tcolor: #777777;\r\n");
      out.write("  \t\tfont-size: 14px;\r\n");
      out.write("  \t\ttext-decoration: underline;\r\n");
      out.write("\t}\r\n");
      out.write("\t.login-form  .btn.btn-primary {\r\n");
      out.write("  \tbackground: #f0ad4e none repeat scroll 0 0;\r\n");
      out.write("  \tborder-color: #f0ad4e;\r\n");
      out.write("  \tcolor: #ffffff;\r\n");
      out.write("  \tfont-size: 14px;\r\n");
      out.write("  \twidth: 100%;\r\n");
      out.write(" \t height: 50px;\r\n");
      out.write(" \t line-height: 50px;\r\n");
      out.write(" \t padding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(".login-form .btn.btn-default {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  line-height: 50px;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".botto-text {\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back { text-align: left; margin-top:10px;}\r\n");
      out.write(".back a {color: #444444; font-size: 13px;text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"LoginForm\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"login-form\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 로그인! -->\r\n");
      out.write("    <form id=\"login-form\" name=\"loginform\" action=\"SemiProjectServlet.do\" method=\"post\">\r\n");
      out.write("    <input type=\"hidden\" name=\"command\" value=\"login\"/>\r\n");
      out.write("    <div class=\"modal-header\">\r\n");
      out.write("    <div class=\"main-div\">\r\n");
      out.write("   <h2>Login</h2>\r\n");
      out.write("   <p>Please enter your ID and password</p>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("    \t<div class=\"modal-body\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("            <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email Address\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <input type=\"password\" name=\"pw\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\">\r\n");
      out.write("        </div>\r\n");
      out.write("    \t </div>\r\n");
      out.write("    \t \r\n");
      out.write("     <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("        <br> <br> \r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    </form>\r\n");
      out.write("    </div> \t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
