/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.13
 * Generated at: 2018-01-11 17:53:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1515343008188L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1515693136761L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("   <!DOCTYPE HTML>\r\n");
      out.write("    <html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>TGN - The Game Nation</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel='stylesheet' id='prettyphoto-css'  href=\"css/prettyPhoto.css\" type='text/css' media='all'>\r\n");
      out.write("    <link href=\"css/fontello.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <style>\r\n");
      out.write("    body {\r\n");
      out.write("        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("    \r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/validator.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.scrollTo-1.4.2-min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.localscroll-1.2.7-min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("          $(document).ready(function(){\r\n");
      out.write("            $(\"a[rel^='prettyPhoto']\").prettyPhoto();\r\n");
      out.write("          });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("\t    <div class=\"navbar-wrapper\">\r\n");
      out.write("      <div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->\r\n");
      out.write("            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </a>\r\n");
      out.write("            <h1 class=\"brand\"><a href=\"index.jsp\">TGN - The Game Nation</a></h1>\r\n");
      out.write("            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->\r\n");
      out.write("            <nav class=\"pull-right nav-collapse collapse\">\r\n");
      out.write("              <ul id=\"menu-main\" class=\"nav\">\r\n");
      out.write("                \r\n");
      out.write("                <li><a title=\"portfolio\" href=\"index.jsp\">Home</a></li> <!-- this will be 3 most recent or something... -->\r\n");
      out.write("                \r\n");
      out.write("                <li><a title=\"services\" href=\"topics.jsp\">All topics</a></li>\r\n");
      out.write("                \r\n");
      out.write("     \t\t\t");
 if ((session.getAttribute("email") != null) && (((String) session.getAttribute("email")).compareTo("")!=0)) { 
      out.write("           \r\n");
      out.write("               \t\t<li><a title=\"team\" href=\"account.jsp\">Account</a></li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
 if ((session.getAttribute("email") == null) || (((String) session.getAttribute("email")).compareTo("")==0)) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a title=\"login\" href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a title=\"logout\" href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t              \r\n");
      out.write("              </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <!-- /.navbar-wrapper -->\r\n");
      out.write("    <div id=\"top\"></div>\r\n");
      out.write("    <!-- ******************** HeaderWrap ********************-->\r\n");
      out.write("    <div id=\"headerwrap\">\r\n");
      out.write("      <header class=\"clearfix\">\r\n");
      out.write("        <h1><span>Legend!</span> We make web a beautiful place.</h1>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"span12\">\r\n");
      out.write("              <h2>Signup for our Newsletter to be updated</h2>\r\n");
      out.write("              <input type=\"text\" name=\"your-email\" placeholder=\"you@yourmail.com\" class=\"cform-text\" size=\"40\" title=\"your email\">\r\n");
      out.write("              <input type=\"submit\" value=\"Notify me\" class=\"cform-submit\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"span12\">\r\n");
      out.write("              <ul class=\"icon\">\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\"><i class=\"icon-pinterest-circled\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\"><i class=\"icon-facebook-circled\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\"><i class=\"icon-twitter-circled\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\"><i class=\"icon-gplus-circled\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\"><i class=\"icon-skype-circled\"></i></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--******************** Feature ********************-->\r\n");
      out.write("    <div class=\"scrollblock\">\r\n");
      out.write("      <section id=\"feature\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"span12\">\r\n");
      out.write("              <article>\r\n");
      out.write("                <p>We work to make web a beautiful place.</p>\r\n");
      out.write("                <p>We craft beautiful designs and convert them into</p>\r\n");
      out.write("                <p>fully functional and user-friendy web app.</p>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ./span12 -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- .row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ./container -->\r\n");
      out.write("      </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!--******************** Portfolio Section ********************-->\r\n");
      out.write("    <section id=\"portfolio\" class=\"single-page scrollblock\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"align\"><i class=\"icon-desktop-circled\"></i></div>\r\n");
      out.write("        <h1 id=\"folio-headline\">Portfolio...</h1>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-01.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-01.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>Ethan Marcotte Design</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-02.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-02.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>A Book Apart</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-03.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-03.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>Four Rules for Designers</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-01.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-03.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>Ethan Marcotte Design</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-02.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-01.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>A Book Apart</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <div class=\"span4\">\r\n");
      out.write("            <div class=\"mask2\"> <a href=\"img/portfolio-03.jpg\" rel=\"prettyPhoto\"><img src=\"img/portfolio-02.jpg\" alt=\"\"></a> </div>\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <hgroup>\r\n");
      out.write("                <h2>Four Rules for Designers</h2>\r\n");
      out.write("              </hgroup>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\r\n");
      out.write("                <a class=\"more-link\" href=\"#\">view project</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!--******************** Services Section ********************-->\r\n");
      out.write("    <section id=\"services\" class=\"single-page scrollblock\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"align\"><i class=\"icon-cog-circled\"></i></div>\r\n");
      out.write("        <h1>Services</h1>\r\n");
      out.write("        <!-- Four columns -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span3\">\r\n");
      out.write("            <div class=\"align\"> <i class=\"icon-desktop sev_icon\"></i> </div>\r\n");
      out.write("            <h2>Web design</h2>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span3 -->\r\n");
      out.write("          <div class=\"span3\">\r\n");
      out.write("            <div class=\"align\"> <i class=\"icon-vector sev_icon\"></i> </div>\r\n");
      out.write("            <h2>Print Design</h2>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span3 -->\r\n");
      out.write("          <div class=\"span3\">\r\n");
      out.write("            <div class=\"align\"> <i class=\"icon-basket sev_icon\"></i> </div>\r\n");
      out.write("            <h2>Ecommerce</h2>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span3 -->\r\n");
      out.write("          <div class=\"span3\">\r\n");
      out.write("            <div class=\"align\"> <i class=\"icon-mobile-1 sev_icon\"></i> </div>\r\n");
      out.write("            <h2>Marketing</h2>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.span3 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!--******************** Testimonials Section ********************-->\r\n");
      out.write("    <section id=\"testimonials\" class=\"single-page hidden-phone\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"blockquote-wrapper\">\r\n");
      out.write("            <blockquote class=\"mega\">\r\n");
      out.write("              <div class=\"span4\">\r\n");
      out.write("                <p class=\"cite\">John Doe &amp; Sons:</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"span8\">\r\n");
      out.write("                <p class=\"alignright\">\"We highly appreciate the enthusiasm and creative talent of the people at Legend!\"</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </blockquote>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.blockquote-wrapper -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!--******************** News Section ********************-->\r\n");
      out.write("    <section id=\"news\" class=\"single-page scrollblock\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"align\"><i class=\"icon-pencil-circled\"></i></div>\r\n");
      out.write("        <h1>Our Blog</h1>\r\n");
      out.write("        <!-- Three columns -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <article class=\"span4 post\"> <img class=\"img-news\" src=\"img/blog_img-01.jpg\" alt=\"\">\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <p class=\"post-date\"><i class=\"icon-calendar\"></i> March 17, 2013</p>\r\n");
      out.write("              <h2>A girl running on a road</h2>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s. &hellip;</p>\r\n");
      out.write("                <a href=\"#\" class=\"more-link\">read more</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <article class=\"span4 post\"> <img class=\"img-news\" src=\"img/blog_img-02.jpg\" alt=\"\">\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <p class=\"post-date\">February 28, 2013</p>\r\n");
      out.write("              <h2>A bear sleeping on a tree</h2>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s. &hellip;</p>\r\n");
      out.write("                <a href=\"#\" class=\"more-link\">read more</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("          <article class=\"span4 post\"> <img class=\"img-news\" src=\"img/blog_img-03.jpg\" alt=\"\">\r\n");
      out.write("            <div class=\"inside\">\r\n");
      out.write("              <p class=\"post-date\">February 06, 2013</p>\r\n");
      out.write("              <h2>A Panda playing with his baby</h2>\r\n");
      out.write("              <div class=\"entry-content\">\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s. &hellip;</p>\r\n");
      out.write("                <a href=\"#\" class=\"more-link\">read more</a> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.inside -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- /.span4 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-large\">Go to our blog</a> </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!--******************** Team Section ********************-->\r\n");
      out.write("    <section id=\"team\" class=\"single-page scrollblock\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"align\"><i class=\"icon-group-circled\"></i></div>\r\n");
      out.write("        <h1>Meet the team</h1>\r\n");
      out.write("        <!-- Five columns -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span2 offset1\">\r\n");
      out.write("            <div class=\"teamalign\"> <img class=\"team-thumb img-circle\" src=\"img/portrait-1.jpg\" alt=\"\"> </div>\r\n");
      out.write("            <h3>Andrew</h3>\r\n");
      out.write("            <div class=\"job-position\">web designer</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span2 -->\r\n");
      out.write("          <div class=\"span2\">\r\n");
      out.write("            <div class=\"teamalign\"> <img class=\"team-thumb img-circle\" src=\"img/portrait-2.jpg\" alt=\"\"> </div>\r\n");
      out.write("            <h3>Stephen</h3>\r\n");
      out.write("            <div class=\"job-position\">web developer</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span2 -->\r\n");
      out.write("          <div class=\"span2\">\r\n");
      out.write("            <div class=\"teamalign\"> <img class=\"team-thumb img-circle\" src=\"img/portrait-3.jpg\" alt=\"\"> </div>\r\n");
      out.write("            <h3>Maria</h3>\r\n");
      out.write("            <div class=\"job-position\">graphic designer</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span2 -->\r\n");
      out.write("          <div class=\"span2\">\r\n");
      out.write("            <div class=\"teamalign\"> <img class=\"team-thumb img-circle\" src=\"img/portrait-4.jpg\" alt=\"\"> </div>\r\n");
      out.write("            <h3>John</h3>\r\n");
      out.write("            <div class=\"job-position\">project manager</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span2 -->\r\n");
      out.write("          <div class=\"span2\">\r\n");
      out.write("            <div class=\"teamalign\"> <img class=\"team-thumb img-circle\" src=\"img/portrait-2.jpg\" alt=\"\"> </div>\r\n");
      out.write("            <h3>Ashton</h3>\r\n");
      out.write("            <div class=\"job-position\">real owner</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span2 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span10 offset1\">\r\n");
      out.write("            <hr class=\"featurette-divider\">\r\n");
      out.write("            <div class=\"featurette\">\r\n");
      out.write("              <h2 class=\"featurette-heading\">Want to know more? <span class=\"muted\">| a little about us</span></h2>\r\n");
      out.write("              <p>Li Europan lingues es membres del sam familie. Lor separat existentie es un myth. Por scientie, musica, sport etc, litot Europa usa li sam vocabular. Li lingues differe solmen in li grammatica, li pronunciation e li plu commun vocabules. Omnicos directe al desirabilite de un nov lingua franca: On refusa continuar payar custosi traductores.</p>\r\n");
      out.write("              <p>At solmen va esser necessi far uniform grammatica, pronunciation e plu sommun paroles. Ma quande lingues coalesce, li grammatica del resultant lingue es plu simplic e regulari quam ti del coalescent lingues.</p>\r\n");
      out.write("              <p>A un Angleso it va semblar un simplificat Angles, quam un skeptic Cambridge amico dit me que Occidental es.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.featurette -->\r\n");
      out.write("            <hr class=\"featurette-divider\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- .span10 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--******************** Contact Section ********************-->\r\n");
      out.write("    <section id=\"contact\" class=\"single-page scrollblock\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"align\"><i class=\"icon-mail-2\"></i></div>\r\n");
      out.write("        <h1>Contact us now!</h1>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"span12\">\r\n");
      out.write("            <div class=\"cform\" id=\"theme-form\">\r\n");
      out.write("              <form action=\"#\" method=\"post\" class=\"cform-form\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"span6\"> <span class=\"your-name\">\r\n");
      out.write("                    <input type=\"text\" name=\"your-name\" placeholder=\"Your Name\" class=\"cform-text\" size=\"40\" title=\"your name\">\r\n");
      out.write("                    </span> </div>\r\n");
      out.write("                  <div class=\"span6\"> <span class=\"your-email\">\r\n");
      out.write("                    <input type=\"text\" name=\"your-email\" placeholder=\"Your Email\" class=\"cform-text\" size=\"40\" title=\"your email\">\r\n");
      out.write("                    </span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"span6\"> <span class=\"company\">\r\n");
      out.write("                    <input type=\"text\" name=\"company\" placeholder=\"Your Company\" class=\"cform-text\" size=\"40\" title=\"company\">\r\n");
      out.write("                    </span> </div>\r\n");
      out.write("                  <div class=\"span6\"> <span class=\"website\">\r\n");
      out.write("                    <input type=\"text\" name=\"website\" placeholder=\"Your Website\" class=\"cform-text\" size=\"40\" title=\"website\">\r\n");
      out.write("                    </span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"span12\"> <span class=\"message\">\r\n");
      out.write("                    <textarea name=\"message\" class=\"cform-textarea\" cols=\"40\" rows=\"10\" title=\"drop us a line.\"></textarea>\r\n");
      out.write("                    </span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                  <input type=\"submit\" value=\"Send message\" class=\"cform-submit pull-left\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cform-response-output\"></div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- ./span12 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"footer-wrapper\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <footer>\r\n");
      out.write("          <small>&copy; 2018 The Game Nation. All rights reserved.</small>\r\n");
      out.write("        </footer>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/site.js\"></script>\r\n");
      out.write("    \t\r\n");
      out.write("    </body>\r\n");
      out.write("    </html>");
      out.write('\r');
      out.write('\n');
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
