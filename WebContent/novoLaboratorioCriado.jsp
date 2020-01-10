<%
//scriptlet
String nomeLaboratorio = (String)request.getAttribute("laboratorio");
System.out.println(nomeLaboratorio);
%>

<html>
<body>
Empresa ${laboratorio} cadastrada com sucesso!
</body>
</html>