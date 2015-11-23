import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Inicializando Servlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		System.out.println("Metodo Service chamado:");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p>Inicializando</p>");
		out.println(request.getParameter("Consulta"));
		//out.println(request.getParameterValues("valor"));
		out.println(getInitParameter("nome"));
		out.println(getServletContext().getInitParameter("adminEmail"));
		out.println("<p>Inicializando Contexto</p>");
		out.println("</html></body>");
		out.flush();
		out.close();
	}
}