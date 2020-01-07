package br.com.sgl.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cadastrando novo laboratório");
		String nomeLaboratorio = req.getParameter("nome");
		String  capacidade = req.getParameter("capacidade");
		Laboratorio lab = new Laboratorio();
		lab.setNome(nomeLaboratorio);
		lab.setCapacidade(capacidade);
		Banco banco = new Banco();
		banco.adiciona(lab);
		
		 
		PrintWriter out = resp.getWriter();
		out.println("<html><body>Laboratório " + nomeLaboratorio + " cadastrado com sucesso com a capacidade " + capacidade + " </body></html>");
	}

}
