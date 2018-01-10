<% if((session.getAttribute("email") == null)||(session.getAttribute("email").equals(""))) {
    out.println("<script type=\"text/javascript\">");
    out.println("alert('To logout you must first be logged in!');");
    out.println("location='login.jsp';");
   	out.println("</script>");
} else {
	session.setAttribute("email", null);
	session.invalidate();
	response.sendRedirect("index.jsp");
} %>