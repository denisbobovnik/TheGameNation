<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@include file="header.jsp"%>
 	<% if((session.getAttribute("email") == null)||(session.getAttribute("email").equals(""))) { 
 	    out.println("<script type=\"text/javascript\">");
 	    out.println("alert('To access this page, you must be logged in!');");
 	    out.println("location='login.jsp';");
 	   	out.println("</script>");
 	} else { %>
 	<br>
	<div class="container">
		<form method="post" onsubmit="return validateRegistration()" action="/TGN/UpdateUserInfo" style=" text-align:center">
			<h3>Account</h3><br>
				<input style="width: 200px;" type="text" id="first_name" name="first_name" value="" placeholder="Name" required><br>
				<input style="width: 200px;" type="text" id="last_name" name="last_name" value="" placeholder="Last name" required><br>
				<input style="width: 200px;" type="text" id="email" name="email" value="" placeholder="Email" required><br> <!-- EMAIL CANNOT BE CHANGED! -->
				<input style="width: 200px;" type="password" id="pass" name="pass"  value="" placeholder="Password" required><br>
				<input style="width: 200px;" type="password" id="pass1" name="pass1"  value="" placeholder="Repeat password" required><br>
				<input style="height: 50px; width: 100px;" type="submit" class="btn btn-1" value="Register" />
				
				<br />
				<center><p id="feedback_reg"></p></center>
				
				        <%String exists = "";
						if(request.getAttribute("exists")!= null) {
							exists = (String) request.getAttribute("exists");%>
							<br /><center><%=exists %></center>
						<%}%>
						
						<%String noMatch = "";
						if(request.getAttribute("noMatch")!= null) {
							noMatch = (String) request.getAttribute("noMatch");%>
							<br /><center><%=noMatch %></center>
						<%}%>
						
						<%String fileTooBig = "";
						if(request.getAttribute("fileTooBig")!= null) {
							fileTooBig = (String) request.getAttribute("fileTooBig");%>
							<br /><center><%=fileTooBig %></center>
						<%}%>
						
						<%String wrongFileType = "";
						if(request.getAttribute("wrongFileType")!= null) {
							wrongFileType = (String) request.getAttribute("wrongFileType");%>
							<br /><center><%=wrongFileType %></center>
						<%}%>
				
				<h3>Already have an account? Login <a href="login.jsp">here</a>.</h3>
			
        </form>
	</div>
	<% } %>
 <%@include file="footer.jsp"%>
 