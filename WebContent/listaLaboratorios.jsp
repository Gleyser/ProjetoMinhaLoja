<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.sgl.gerenciador.servlet.Laboratorio"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Laboratórios</title>
</head>
<body>

	<ul>
		<%
        List<Laboratorio> lista = (List<Laboratorio>)request.getAttribute("laboratorios");
        for (Laboratorio lab : lista) { 
    %>
        <li><%= lab.getNome() %></li>
    <%
        }
    %>
	</ul>

</body>
</html>