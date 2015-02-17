package common.layer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiServlet
 */
public class Jservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {
              	
			ServletOutputStream out = response.getOutputStream();
			out.println("Hola mundo, Servlet!");
			out.flush();
			out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {

	}

}
