/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2020-04-09 10:02:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("body#joinForm{ background-image:url(\"https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg\"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:10px;}\r\n");
      out.write("\r\n");
      out.write(".form-heading { color:#fff; font-size:23px;}\r\n");
      out.write(".modal-header h2{ color:#444444; font-size:18px; margin:0 0 8px 0;}\r\n");
      out.write(".modal-header p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}\r\n");
      out.write(".join-form .form-control {\r\n");
      out.write("  background: #f7f7f7 none repeat scroll 0 0;\r\n");
      out.write("  border: 1px solid #d4d4d4;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  line-height: 50px;\r\n");
      out.write("}\r\n");
      out.write(".main-div {\r\n");
      out.write("  background: #ffffff none repeat scroll 0 0;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  margin: 10px auto 30px;\r\n");
      out.write("  max-width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".join-form .form-group {\r\n");
      out.write("  margin-bottom:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".join-form{ text-align:center;}\r\n");
      out.write(".forgot a {\r\n");
      out.write("  color: #777777;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write(".join-form .btn.btn-primary {\r\n");
      out.write("  background: #f0ad4e none repeat scroll 0 0;\r\n");
      out.write("  border-color: #f0ad4e;\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  line-height: 50px;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".join-form .btn.btn-default {\r\n");
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
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>UTC</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//이메일 인증버튼을 누르면\r\n");
      out.write("\tfunction emailcheck(){\r\n");
      out.write("\t\tvar x = document.getElementById(\"inputEmail\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(x == \"\"){\r\n");
      out.write("\t\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\twindow.open(\"SemiProjectServlet.do?command=emailcheck&member_email=\"+x,\"\",\r\n");
      out.write("\t\t\t\t\"left='+(screen.availWidth-660)/2+', top='+(screen.avilHeight-430)/2+', width=300px; height=200px\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t//회원가입 빈값\r\n");
      out.write("\tfunction signup(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//회원가입 입력조건\r\n");
      out.write("\t\tvar userPw = document.joinform.member_pw;\r\n");
      out.write("\t\tvar userPwRe = document.joinform.member_pw_re;\r\n");
      out.write("\t\tvar userName = document.joinform.member_name;\r\n");
      out.write("\t\tvar userEmail = document.joinform.member_email;\r\n");
      out.write("\t\tvar emailcheck = document.joinform.inputEmail.readOnly;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(userName.value == \"\"){\r\n");
      out.write("\t\t\talert(\"이름을 입력해주세요.\");\r\n");
      out.write("\t\t\tuserName.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(userEmail.value == \"\"){\r\n");
      out.write("\t\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t\tdocument.joinform.member_email.focus();\r\n");
      out.write("\t\t\tuserEmail.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(userPw.value == \"\"){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("\t\t\tuserPw.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(userPwRe.value ==\"\"){\r\n");
      out.write("\t\t\talert(\"비밀번호를 한번 더 입력해주세요.\");\r\n");
      out.write("\t\t\tuserPwRe.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//비밀번호가 같은지 검사\r\n");
      out.write("\t\tif(userPw.value != userPwRe.value){\r\n");
      out.write("\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//비밀번호 6자리 미만이면 알림\r\n");
      out.write("\t\tif(userPw.value.length < 6){\r\n");
      out.write("\t\t\talert(\"비밀번호는 6자리 이상으로 만들어주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//비밀번호 생성시 특수문자 섞어서 만들기\r\n");
      out.write("\t\tif(!userPw.value.match(/([a-zA-Z0-9].*[!,@,#,$,%,^,&,*,?,_,~])|([!,@,#,$,%,^,&,*,?,_,~].*[a-zA-Z0-9])/)){\r\n");
      out.write("\t\t\talert(\"비밀번호는 특수문자(!@$%^&* 만 허용)를 섞어서 6자리 이상으로 만들어주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(emailcheck == false){\r\n");
      out.write("\t\t\talert(\"이메일 인증을 해주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<body id=\"joinForm\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"join-form\">\r\n");
      out.write("\r\n");
      out.write("    <form name=\"joinform\" id=\"join-form\" action=\"SemiProjectServlet.do\" method=\"post\" onSubmit=\"return signup(); \">\r\n");
      out.write("    <input type=\"hidden\" name=\"command\" value=\"insertuser\">\r\n");
      out.write("       \r\n");
      out.write("    <div class=\"modal-header\">\r\n");
      out.write("    <div class=\"main-div\">\r\n");
      out.write("   <h2>Sign Up</h2>\r\n");
      out.write("   <p>Enjoy UTC</p>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("    \t<div class=\"modal-body\">\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"form-group\">\r\n");
      out.write("           <input type=\"text\" name=\"member_name\" class=\"form-control\" id=\"inputId\" placeholder=\"name\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("           <input type=\"email\" name=\"member_email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email Address\">\r\n");
      out.write("           <input type=\"button\" name=\"email_check\" class=\"btn btn-primary\" value=\"이메일 인증하기\"\r\n");
      out.write("           onclick=\"emailcheck();\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <input type=\"password\" name=\"member_pw\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <input type=\"password\" name=\"member_pw_re\" class=\"form-control\" id=\"inputPassword_chk\" placeholder=\"Password_check\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    \t </div>\r\n");
      out.write("     <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" onclick=\"email_check(member_email)\">Join</button>\r\n");
      out.write("        <br> <br> \r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<p class=\"botto-text\"> Designed by Sunil Rajput</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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