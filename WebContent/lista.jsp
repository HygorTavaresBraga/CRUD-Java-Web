<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
 <%@ page import= "Model.Pessoa" %>   
 <%@ page import= "java.util.ArrayList" %> 
 
 <% ArrayList<Pessoa> lista = (ArrayList<Pessoa>) request.getAttribute("pessoas");%> 
    
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  
  	<style>
  	
  		a{
  			text-decoration: none;
  		}
  	
  	</style>
  
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
		<h1 class="text-center">Lista</h1>
	</div>

	<div class="container-fluid mt-4">
		<div class="row">
			<div class="col-sm-5 col-md-5 col-lg-5 mx-auto">
				
				<table class="table table-dark text-center">
				  <thead>
				  
				    <tr>
				      <th scope="col">ID</th>
				      <th scope="col">Nome</th>
				      <th scope="col">CPF</th>
				      <th scope="col">Idade</th>
				      <th scope="col">Alterações</th>
				    </tr>
				    
				  </thead>
				  
				  <tbody>
				  
				  <% for(int i=0; i<lista.size(); i++){ %>
				  
				    <tr>
				      <td><%= lista.get(i).getIdPessoa() %></td>
				      <td><%= lista.get(i).getNomePessoa() %></td>
				      <td><%= lista.get(i).getCpfPessoa() %></td>
				      <td><%= lista.get(i).getIdadePessoa() %></td>
				      <td>
				      	<a href="editar?idPessoa=<%= lista.get(i).getIdPessoa() %>">
				      		<button class="btn btn-success">
					      		Editar
				      		</button>
				      	</a>
				      	
				      	<a href="excluir?idPessoa=<%= lista.get(i).getIdPessoa() %>">
				      		<button class="btn btn-danger">
				      			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-circle-fill" viewBox="0 0 16 16">
								  <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM5.354 4.646a.5.5 0 1 0-.708.708L7.293 8l-2.647 2.646a.5.5 0 0 0 .708.708L8 8.707l2.646 2.647a.5.5 0 0 0 .708-.708L8.707 8l2.647-2.646a.5.5 0 0 0-.708-.708L8 7.293 5.354 4.646z"/>
								</svg>
				      		</button>
				      	</a>
				      </td>
				    </tr>
				    
				    <% } %>
				  
				  </tbody>
				  
				</table>
				
			</div>
		</div>
	</div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>