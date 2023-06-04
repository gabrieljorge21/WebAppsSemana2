<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Optional"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ingreso de Persona</title>
</head>
<body style="font-family: Arial">

<h2>Ingreso de Persona</h2>

<span style="color: red;"> 
	<!--
	
	Se usan diferentes formas de mostrar el parametro errorMessage que vino en el request
	<%= request.getAttribute("mensajeError")%> 
	${requestScope.errorMessage}
	
	--> 
	
	<c:out value="${mensajeError}"/><br>
	
</span>
	
<form action="validar" method=post>
		<table>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Edad</td>
				<td><input type="number" name="edad"></td>
			</tr>
			<tr>
				<td>Dirección</td>
				<td><input type="text" name="direccion"></td>
			</tr>
			<tr>
				<td>Teléfono</td>
				<td><input type="number" name="telefono"></td>
			</tr>
		</table>
		<input type="submit" name="Enviar" value="Enviar">
	</form>
</body>
</html>