

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Hello() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter output=response.getWriter();
		
		output.print("<html><body>");
		output.print("<h3>This line will get printed when the file is run on the server(Tomcat server v9.0, in this case)</h3>");
		output.print("</body></html>");
	}

}
