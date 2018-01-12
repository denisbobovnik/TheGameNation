<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp"%>
<% if(session.getAttribute("email") == null) {%>
<br>
<div class="container">
	<form onsubmit="return validateLogin()" method="post" action="/TGN/Login" style="text-align: center">
		<h3>Login</h3><br>
		<input style="width: 200px;" type="text" id="email" name="email" value="" placeholder="Email" required><br>
		<input style="width: 200px;" type="password" id="pass" name="pass"  value="" placeholder="Password" required><br>
		<input style="height: 50px; width: 100px;" type="submit" class="btn btn-1" value="Login" />
		
		<br />
		<center><p id="feedback_reg"></p></center>
		
		<%String doesntExist = "";
		if(request.getAttribute("doesntExist")!= null) {
			doesntExist = (String) request.getAttribute("doesntExist");%>
			<br /><center><%=doesntExist %></center>
		<%}%>
		
		<h3>Without an account? Create one <a href="registration.jsp">here</a>.</h3>
	</form>	
</div>
<% } else {                    
    out.println("<script type=\"text/javascript\">");
    out.println("alert('To login you must first logout!');");
    out.println("location='index.jsp';");
   	out.println("</script>");
	}    	
%>
<%@include file="footer.jsp"%>