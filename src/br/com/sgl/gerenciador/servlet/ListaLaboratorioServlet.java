package br.com.sgl.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaLaboratorioServlet
 */
@WebServlet("/ListaLaboratorios")
public class ListaLaboratorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
        List<Laboratorio> lista = banco.getLaboratorios();
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<ul>");
        for (Laboratorio lab : lista) { 
            out.println("<li>" + lab.getNome() + "</li>");
        }       
        out.println("</ul>");
        out.println("</body></html>");

	}
	
}
