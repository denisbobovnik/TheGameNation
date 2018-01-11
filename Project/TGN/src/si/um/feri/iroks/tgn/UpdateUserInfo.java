package si.um.feri.iroks.tgn;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(urlPatterns="/UpdateUserInfo")
public class UpdateUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SALT = "my-salty-text";
       
    public UpdateUserInfo() {
        super();
    }
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	UserDao forTheServlet = new UserDao();
    	
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    	String first_name = request.getParameter("first_name");
    	String last_name = request.getParameter("last_name");
    	String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String pass1 = request.getParameter("pass1");        
        Part filePart = request.getPart("photo");
        PrintWriter out = response.getWriter();
        
        
        if(((pass==null)&&(pass1==null))||((pass.equals("")&&(pass1.equals(""))))) { //password won't be changed
        	if(filePart.getSize()!=0) { //photo will be changed
        		InputStream inputStream = null;
        		long fileSize = 0;
                String fileName = null;
                fileSize = filePart.getSize();             
                fileName = filePart.getName();
                inputStream = filePart.getInputStream();
                if(fileSize>=16177215) {
                	String fileTooBig = "Uploaded file was too big (max. 16MB)! Try again.";
                    request.setAttribute("fileTooBig", fileTooBig);
            		request.getRequestDispatcher("/account.jsp").forward(request, response);
                }
    	    	try {
					forTheServlet.updateUserAllButPassword(email, first_name, last_name, inputStream);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		out.println("<script type=\"text/javascript\" charset=\"utf-8\">");
	    		out.println("alert('Update successful! Refreshing...');");
	    		out.println("location='account.jsp';");
	    		out.println("</script>");
        	} else { //photo won't be changed
    	    	try {
					forTheServlet.updateUserOnlyNames(email, first_name, last_name);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		out.println("<script type=\"text/javascript\" charset=\"utf-8\">");
	    		out.println("alert('Update successful! Refreshing...');");
	    		out.println("location='account.jsp';");
	    		out.println("</script>");
        	}
        } else if(pass.compareTo(pass1)==0) { //passwords must match to be changed
        	if(filePart.getSize()!=0) { //photo will be changed
        		InputStream inputStream = null;
        		long fileSize = 0;
                String fileName = null;
                fileSize = filePart.getSize();             
                fileName = filePart.getName();
                inputStream = filePart.getInputStream();
                if(fileSize>=16177215) {
                	String fileTooBig = "Uploaded file was too big (max. 16MB)! Try again.";
                    request.setAttribute("fileTooBig", fileTooBig);
            		request.getRequestDispatcher("/account.jsp").forward(request, response);
                }
                String saltyPassword = SALT + pass;
    			String hashedPassword = forTheServlet.generateHash(saltyPassword);
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	    	    Connection con = DBConnect.getConnection();
	    	    try {
					Statement st = con.createStatement();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    	    	try {
					forTheServlet.updateUserAll(email, first_name, last_name, hashedPassword, inputStream);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		out.println("<script type=\"text/javascript\" charset=\"utf-8\">");
	    		out.println("alert('Update successful! Refreshing...');");
	    		out.println("location='account.jsp';");
	    		out.println("</script>");
        	} else { //photo won't be changed
        		String saltyPassword = SALT + pass;
    			String hashedPassword = forTheServlet.generateHash(saltyPassword);
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	    	    Connection con = DBConnect.getConnection();
	    	    try {
					Statement st = con.createStatement();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    	    	try {
					forTheServlet.updateUserAllButPhoto(email, first_name, last_name, hashedPassword);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		out.println("<script type=\"text/javascript\" charset=\"utf-8\">");
	    		out.println("alert('Update successful! Refreshing...');");
	    		out.println("location='account.jsp';");
	    		out.println("</script>");
        	}
        } else if(pass.compareTo(pass1)!=0) { //passwords didn't match
        	String noMatch = "Passwords didn't match! Try again.";
            request.setAttribute("noMatch", noMatch);
    		request.getRequestDispatcher("/account.jsp").forward(request, response);
        }
	}
}