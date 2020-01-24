<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Laboratórios</title>
</head>
<body>

<c:if test="${not empty laboratorio}">
            Laboratório ${laboratorio} cadastrado com sucesso!
        </c:if>

 Lista de laboratórios: <br />

	<ul>
		<c:forEach items="${laboratorios}" var="lab">
			<li>${lab.nome} - <fmt:formatDate value="${lab.dataAbertura}" pattern="dd/MM/yyyy"/></li>
		</c:forEach>
	</ul>

</body>
</html>