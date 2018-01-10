package si.um.feri.iroks.tgn;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SALT = "my-salty-text";
       
    public Login() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        boolean correctPassword = false;
        correctPassword = login(email, pass);
        if(correctPassword) {
        	session.setAttribute("email", email);
        	response.sendRedirect("index.jsp");
        } else {
        	String doesntExist = "Wrong password or user doesn't exist! Try again.";
	        request.setAttribute("doesntExist", doesntExist);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
	}
	public Boolean login(String email, String password) {
		Boolean isAuthenticated = false;
		String saltedPassword = SALT + password;
		String dbMail = "", dbPass = "";
		String hashedPassword = new UserDao().generateHash(saltedPassword);
		try {
			Class.forName("com.mysql.jdbc.Driver");
    	    Connection con = DBConnect.getConnection();
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery("select * from users where email='" + email + "';");
	        if (rs.next()) {
	        	dbMail = rs.getString(4);
	        	dbPass = rs.getString(5);
	        	if((dbMail.compareTo(email)==0)&&(dbPass.compareTo(hashedPassword)==0))
	        		isAuthenticated = true;
	        	else
	        		isAuthenticated = false;
	        }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isAuthenticated;
	}
}