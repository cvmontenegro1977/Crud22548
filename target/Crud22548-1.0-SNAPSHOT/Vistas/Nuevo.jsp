<%-- 
    Document   : Nuevo
    Created on : 27 dic. 2022, 10:50:15
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Agregar Socio</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- CSS only -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
		<!-- JavaScript Bundle with Popper -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
		<script src="https://kit.fontawesome.com/7056d93397.js" crossorigin="anonymous"></script>
		
	</head>
	<body>
		<div class="container">
			<h1 class="text-center">Nuevo Socio</h1>
			<div class="row">
				<form class="p-5" method="post" action="sociosController?accion=insert">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label>
						<input type="text" class="form-control" name="nombre" id="nombre" required>
					</div>
					<div class="mb-3">
						<label for="apellido" class="form-label">Apellido</label>
						<input type="text" class="form-control" name="apellido" id="apellido" required>
					</div>
					<div class="mb-3">
						<label for="direccion" class="form-label">Dirección</label>
						<input type="text" class="form-control" name="Direccion" id="Direccion" required>
					</div>
					<div class="mb-3">
						<label for="Fecha_Nacimiento" class="form-label">Fecha Nacimiento</label>
						<input type="text" class="form-control" name="Fecha Nacimiento" id="Fecha_Nacimiento" required>
					</div>
					<div class="mb-3">
						<label for="Localidad" class="form-label">Localidad</label>
						<input type="text" class="form-control" name="Localidad" id="Localidad" required>
					</div>
					<div class="mb-3">
						<label for="Email" class="form-label">Email</label>
						<input type="text" class="form-control" name="Email" id="Email" required>
					</div>
					<div class="mb-3">
						<label for="Teléfono" class="form-label">Teléfono</label>
						<input type="text" class="form-control" name="Teléfono" id="Teléfono" required>
					</div>
					
					<button type="submit" class="btn btn-primary">Agregar</button>					
					
				</form>		
				
				
			</div>
			
			
			
		</div>
		
		
	</body>
</html>

