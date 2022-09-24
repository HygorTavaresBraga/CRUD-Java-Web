<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cadastro</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div>
		<a href="index">
			<button class="btn btn-dark">
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
		  		<path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0zm3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z"/>
				</svg>
				Voltar
			</button>
		</a>
		<h1 class="text-center">Cadastro</h1>
	</div>

	<div class="container-fluid mt-4">
		<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4 mx-auto">
			
				<form action="cadastrar">
				
					<div class="form-group mb-2">
						<label for="nome">Nome</label>
						<input type="text" class="form-control" id="nome" name="nome">
					</div>
					
					<div class="form-group mb-2">
						<label for="cpf">CPF</label>
						<input type="text" class="form-control" id="cpf" name="cpf">
					</div>
					
					<div class="form-group mb-2">
						<label for="idade">Idade</label>
						<input type="number" class="form-control" id="idade" name="idade">
					</div>
					
					<button type="submit" class="btn btn-dark">
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-check-circle-fill" viewBox="0 0 16 16">
						<path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-3.97-3.03a.75.75 0 0 0-1.08.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-.01-1.05z"/>
						</svg>
						Cadastrar
					</button>
					
				</form>
				
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>