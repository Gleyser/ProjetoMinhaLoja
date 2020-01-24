<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Laboratório</title>
</head>
<body>



	<form action="${linkServletNovaEmpresa}" method="post">

		Nome: <input type="text" name="nome" /> <br><br>
		Capacidade: <input type="text" name="capacidade" />
		Data de abertura: <input type="text" name="data" />
		<input type="submit"/>

	</form>
</body>
</html>