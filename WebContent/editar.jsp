<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Edição</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	
	<h1 class="text-center">Editar</h1>

	<div class="container-fluid mt-4">
		<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4 mx-auto">
			
				<form action="editarPessoa">
				
					<div class="form-group mb-2">
						<label for="idPessoa">ID</label>
						<input required readonly type="text" class="form-control" id="idPessoa" name="idPessoa" value="<% out.println(request.getAttribute("idPessoa")); %>">
					</div>
				
					<div class="form-group mb-2">
						<label for="nomePessoa">Nome</label>
						<input required type="text" class="form-control" id="nomePessoa" name="nomePessoa" value="<% out.println(request.getAttribute("nomePessoa")); %>">
					</div>
					
					<div class="form-group mb-2">
						<label for="cpfPessoa">CPF</label>
						<input required type="text" class="form-control" id="cpfPessoa" name="cpfPessoa" value="<% out.println(request.getAttribute("cpfPessoa")); %>">
					</div>
					
					<div class="form-group mb-2">
						<label for="idadePessoa">Idade</label>
						<input required type="text" class="form-control" id="idadePessoa" name="idadePessoa" value="<% out.println(request.getAttribute("idadePessoa")); %>">
					</div>
					
					<button type="submit" class="btn btn-dark">Editar</button>
					
				</form>
				
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
</html>