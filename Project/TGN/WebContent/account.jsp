<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@include file="header.jsp"%>
 <%@page import="si.um.feri.iroks.tgn.*"%>
 <%@page import="java.sql.Blob"%>
 <%@page import="java.io.OutputStream" %>
 

 <%@page import="org.apache.commons.codec.binary.Base64" %>
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
			
			<%	
				String email = (String) session.getAttribute("email");
				User loggedIn = new UserDao().selectUser(email);
				Blob pic = loggedIn.getPhoto();
				byte[] picData = pic.getBytes(1, (int) pic.length());
			%>
				<img src="data:image/jpeg;base64,<%=Base64.encodeBase64() %> Base64.encodeBase64()" height="50px" width="50px" alt="userPhoto" >
			
			
				<input style="width: 200px;" type="text" id="first_name" name="first_name" value="" placeholder="Name" required><br>
				<input style="width: 200px;" type="text" id="last_name" name="last_name" value="" placeholder="Last name" required><br>
				<input type="hidden" id="email" name="email" value="admin@tgn.com">
				<input style="width: 200px;" type="password" id="pass" name="pass"  value="" placeholder="Password" required><br>
				<input style="width: 200px;" type="password" id="pass1" name="pass1"  value="" placeholder="Repeat password" required><br>
				<input style="height: 50px; width: 100px;" type="submit" class="btn btn-1" value="Update" />
				
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
							
        </form>
	</div>
	<% } %>
 <%@include file="footer.jsp"%>
 