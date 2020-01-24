package br.com.sgl.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
public class NovoLaboratorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Não é uma boa prática possuir código de interface e visualização HTML dentro de uma classe. 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cadastrando novo laboratório");
		String nomeLaboratorio = req.getParameter("nome");
		String  capacidade = req.getParameter("capacidade");
		String paramDataLaboratorio = req.getParameter("data");
		Laboratorio lab = new Laboratorio();	
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dataAbertura = sdf.parse(paramDataLaboratorio);
			lab.setDataAbertura(dataAbertura);
			
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		lab.setNome(nomeLaboratorio);
		lab.setCapacidade(capacidade);		
		Banco banco = new Banco();
		banco.adiciona(lab);	
		
		//chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("/ListaLaboratorios");
        req.setAttribute("laboratorio", lab.getNome());
        rd.forward(req, resp);
		 
		//PrintWriter out = resp.getWriter();
		//out.println("<html><body>Laboratório " + nomeLaboratorio + " cadastrado com sucesso com a capacidade " + capacidade + " </body></html>");
	}

}
