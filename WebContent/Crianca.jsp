<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Crianca" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Adicionar Crian&ccedil;a</h1>

	<form action="HCrianca" method="post">
		<label>
		Nome
		<input type="text" name="nome">
		</label>
		<label>
		Data de Nascimento
		<input type="text" name="data_nascimento">
		</label>
		<label>
		Cart&atilde;o de Cidad&atilde;o
		<input type="text" name="ccidadao">
		</label>
		<label>
		Observa&ccedil;&otilde;es
		<textarea name="observacoes" rows="10" cols="25"></textarea>
		</label>
		<input type="submit" value="Enviar">
		</form>
<h2> Lista de Crian&ccedil;as Inscritas</h2>
<table>
<tr><th>Nome da Crian&ccedil;a</th><th>Observa&ccedil;&otilde;es</th></tr>
<%
	ArrayList arc = (ArrayList) request.getAttribute("listaCriancas");

		for(int i=0; i<arc.size(); i++) {
			Crianca c =(Crianca) arc.get(i);
			
				out.append("<tr><td>" + c.getNome() + "</td><td>" + c.getObservacoes() + "</td></tr>");
		}
%>
</table>
			
</body>
</html>