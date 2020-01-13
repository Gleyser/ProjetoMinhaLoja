<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<c:if test="${not empty laboratorio}">
            Laboratório ${laboratorio} cadastrado com sucesso!
        </c:if>
        
        <c:if test= "${empty laboratorio}">
            Nenhum laboratório cadastrado!
        </c:if>
</body>
</html>