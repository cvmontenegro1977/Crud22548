<%-- 
    Document   : Socios
    Created on : 27 dic. 2022, 10:54:40
    Author     : Usuario
--%>

<%@page import="jdk.internal.org.jline.utils.Colors.s"%>
<%@page import="jdk.internal.org.jline.utils.Colors.s"%>
<%@page import="Modelo.sociosDaos"%>
<%@page import="Modelo.socios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>


<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
	<head>
		<title>Listado de Socios</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- CSS only -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
		<!-- JavaScript Bundle with Popper -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
		<script src="https://kit.fontawesome.com/7056d93397.js" crossorigin="anonymous"></script>
		
	
	</head>
	<body>
		<h1 class="text text-center">Listado Socios del Club</h1>
		
		<div class="container">
			
			<div class="row">
				<a class="btn btn-primary col-4 m-4 float-end" href="sociosController?accion=nuevo">Agregar Socio</a>
				<table class="table table-primary table-striped">
					<thead>
					
						<th>idSocio</th>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Direccion</th>
						<th>Foto</th>
						<th>Fecha Nacimiento</th>
						<th>Localidad</th>
						<th>Email</th>
						<th>Telefono</th>
						<th>Modificar</th>
						<th>Eliminar</th>
					</thead>
					<% 
					List<socios> resultado= null;
					sociosDaos s1=new sociosDaos();
					resultado=s1.listarSocios();
                                        for(int x=0;x<resultado.size();x++)
                                        {
                                        String ruta="sociosController?accion=Modificar&id="+resultado.get(x).getIdSocio();	
                                        String rutaE="sociosController?accion=Eliminar&id="+resultado.get(x).getIdSocio();
                    
						
					%>
					<tr>
						<td><%=resultado.get(x).getIdSocio()%></td>
						<td>< %=resultado.get(x).getNombre()%></td>
						<td>< %=resultado.get(x).getApellido()%></td>
						<td>< %=resultado.get(x).getDireccion()%></td>
						<td><img src="" class="img-rounded" width="80 px"></td>
						<td>< %=resultado.get(x).getFNac()%></td>
						<td>< %=resultado.get(x).getLocalidad()%></td>
						<td>< %=resultado.get(x).getEmail()%></td>
						<td>< %=resultado.get(x).getTelefono()%></td>
						<td class="text-center"><a href="<%=ruta%>"><i class="fa-solid fa-pen-to-square"></i></a></td> 
						<td class="text-center"><a href=""<%=rutaE%>"><i class="fa-solid fa-delete-left"></i></a></td>	
					</tr>
					<%
					}
					%>
				</table>				
								
				
			</div>	
			
			
		</div>
		 
	</body>
</html>