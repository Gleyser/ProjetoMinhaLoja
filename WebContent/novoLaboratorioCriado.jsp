<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<c:if test="${not empty laboratorio}">
            Laborat�rio ${laboratorio} cadastrado com sucesso!
        </c:if>
        
        <c:if test= "${empty laboratorio}">
            Nenhum laborat�rio cadastrado!
        </c:if>
</body>
</html>