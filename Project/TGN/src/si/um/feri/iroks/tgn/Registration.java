package si.um.feri.iroks.tgn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SALT = "my-salty-text";

    public Registration() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    	String first_name = request.getParameter("first_name");
    	String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String pass1 = request.getParameter("pass1");
        PrintWriter out = response.getWriter();
        if(pass.compareTo(pass1)==0) {
    	    try {
    			String saltyPassword = SALT + pass;
    			String hashedPassword = new UserDao().generateHash(saltyPassword);
				Class.forName("com.mysql.jdbc.Driver");
	    	    Connection con = DBConnect.getConnection();
	    	    Statement st = con.createStatement();
	    	    /* prevents duplicate user entry to the DB */
	    		ResultSet existingUsers = st.executeQuery("select email from users");
	    	    int flag = 0;
	    		while (existingUsers.next())
	    			if (existingUsers.getString(1).compareTo(email) == 0)
	    				flag++;
	    		if(flag != 0) {
	    			String exists = "User with this email already exists!";
	    	        request.setAttribute("exists", exists);
	    			request.getRequestDispatcher("/registration.jsp").forward(request, response);
	    		}
	    		else {
	    		    PreparedStatement ss = con.prepareStatement("insert into users(first_name, last_name, email, pass, photo) values (?,?,?,?,?)");
	    			ss.setString(1, first_name);
	    			ss.setString(2, last_name);
	    			ss.setString(3, email);
	    			ss.setString(4, hashedPassword);
	    			ss.setBlob(5, new UserDao().defaultProfilePhoto());
	    			ss.executeUpdate();
	    			out.println("<script type=\"text/javascript\" charset=\"utf-8\">");
	    			out.println("alert('Registration successful! Redirecting to login...');");
	    			out.println("location='login.jsp';");
	    			out.println("</script>");
	    		}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else {
    		String noMatch = "Passwords didn't match! Try again.";
            request.setAttribute("noMatch", noMatch);
    		request.getRequestDispatcher("/registration.jsp").forward(request, response);
        }
    }
}