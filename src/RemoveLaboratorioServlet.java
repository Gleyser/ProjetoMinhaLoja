

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgl.gerenciador.servlet.Banco;

/**
 * Servlet implementation class RemoveLaboratorioServlet
 */
@WebServlet("/removeLaboratorio")
public class RemoveLaboratorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
             
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);
		Banco banco = new Banco();
		banco.removeLaboratorio(id);
	}

	

}
