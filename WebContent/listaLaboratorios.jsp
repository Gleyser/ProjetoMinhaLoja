<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Laborat�rios</title>
</head>
<body>

 Lista de laborat�rios: <br />

	<ul>
		<c:forEach items="${laboratorios}" var="lab">
			<li>${lab.nome }</li>
		</c:forEach>
	</ul>

</body>
</html>