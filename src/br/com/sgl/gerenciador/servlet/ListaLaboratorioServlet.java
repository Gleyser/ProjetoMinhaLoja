package br.com.sgl.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
        request.setAttribute("laboratorios", lista);
        
        RequestDispatcher rd = request.getRequestDispatcher("/listaLaboratorios.jsp"); 
        rd.forward(request,response);

	}
	
}
