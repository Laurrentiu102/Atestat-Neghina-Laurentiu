/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-12 11:04:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Pages.vinde;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vindemodel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/ttlogo.png\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/galerieimagini.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/vindemodel.css\">\r\n");
      out.write("<title>TodayTech</title>\r\n");
      out.write("<script>\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tconst queryString = window.location.search;\r\n");
      out.write("\t\tconst urlParams = new URLSearchParams(queryString);\r\n");
      out.write("\t\tconst email = urlParams.get('email');\r\n");
      out.write("\t\tvar a=\"\"\r\n");
      out.write("\t\tfor(var i=0;i<document.getElementsByTagName(\"a\").length;i++){\r\n");
      out.write("\t\t\tvar a=(document.getElementsByTagName(\"a\")[i].href+email).substring((document.getElementsByTagName(\"a\")[i].href+email).indexOf(\"/todaytech/\"));\r\n");
      out.write("\t\t\tdocument.getElementsByTagName(\"a\")[i].setAttribute(\"href\", a); \r\n");
      out.write("\t\t\tdocument.getElementById('labele').innerHTML=(\"Pret: \"+a+\" lei\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("h1{\r\n");
      out.write("    font-family: \"Avenir Next\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";\r\n");
      out.write("    color: #353b50;\r\n");
      out.write("    letter-spacing: 0;\r\n");
      out.write("    line-height: 1.2;\r\n");
      out.write("    font-size: 2.15rem;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("h4{\r\n");
      out.write("\tfont-family: \"Avenir Next\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";\r\n");
      out.write("}\r\n");
      out.write(".bara{\r\n");
      out.write("\tbackground: #f26522;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    -webkit-animation-duration: 1s;\r\n");
      out.write("    animation-duration: 1s;\r\n");
      out.write("    -webkit-animation-fill-mode: both;\r\n");
      out.write("    animation-fill-mode: both;\r\n");
      out.write("    -webkit-animation-name: slideInLeft;\r\n");
      out.write("    animation-name: slideInLeft;\r\n");
      out.write("}\r\n");
      out.write(".bara-fundal {\r\n");
      out.write("    background: #D2D8E3;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    height: 5px;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("    margin-top:5%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    transition: all .2s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write(".divsus{\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    z-index: 1030;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    height: 4rem;\r\n");
      out.write("    margin:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes slideInLeft {\r\n");
      out.write("  0% {\r\n");
      out.write("    transform: translate3d(-100%, 0, 0);\r\n");
      out.write("    visibility: visible;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("100% {\r\n");
      out.write("    transform: translateZ(0);\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<label id=\"labele\">asd</label>\r\n");
      out.write("<div class=\"divsus\"></div>\r\n");
      out.write("<div class=\"bara-fundal\"><span class=\"bara\" style=\"width: 40%;\"></span></div>\r\n");
      out.write("<h1 style=\"font-size:50px;text-align:center\">Selecteaza modelul tau de telefon</h1>\r\n");
      out.write("<div style=\"margin-left:10%;margin-right:10%\" class=\"gallery-grid\">\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_SE_2020&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonese2020.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone SE 2020</h4></figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_11_Pro_Max&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone11promax.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 11 Pro Max</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_11_Pro&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone11pro.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 11 Pro</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_11&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone11.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 11</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_XS_Max&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonexsmax.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone XS Max</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_XS&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonexs.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone XS</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_XR&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonexr.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone XR</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_X&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonex.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone X</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_8_Plus&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone8plus.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 8 Plus</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_8&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone8.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 8</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_7_Plus&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone7plus.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 7 Plus</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_7&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone7.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 7</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_6S_Plus&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone6splus.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 6S Plus</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_6S&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone6s.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 6S</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_6_Plus&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone6plus.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 6 Plus</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_6&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphone6.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone 6</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/configuraremodelS?model=iPhone_SE&email=\">\r\n");
      out.write("    <figure class=\"gallery-frame\">\r\n");
      out.write("      <img class=\"gallery-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Resurse/PozeTelefoane/iphonese.jpg\" alt=\"symbol image\">\r\n");
      out.write("      <figcaption><h4 style=\"margin-top:0;\">iPhone SE</figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("    </a>\r\n");
      out.write("  </div>\r\n");
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
