package si.um.feri.iroks.tgn;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/imageServlet")
public class imageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public imageServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Blob picture = (Blob) request.getParameter("blob");
		InputStream input = resultSet.getBinaryStream("imageColumnName");
		OutputStream output = response.getOutputStream();
		response.setContentType("image/gif");
	}
}