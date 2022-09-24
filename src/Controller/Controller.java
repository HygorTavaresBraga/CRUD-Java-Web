package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Conexao;
import DAO.PessoaDao;
import Model.Pessoa;

@WebServlet(urlPatterns = {"/Controller" , "/index" , "/create", "/read", "/cadastrar", "/editar", "/editarPessoa", "/excluir"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Conexao conexao = new Conexao();
	Pessoa pessoa = new Pessoa();
	PessoaDao pessoaDao = new PessoaDao();

    public Controller() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getServletPath();
		
		if(url.equals("/index")){
			IndexPage(request, response);
			
		}else if(url.equals("/create")) {
			RegisterPage(request, response);
			
		}else if(url.equals("/read")) {
			Read(request, response);
			
		}else if(url.equals("/cadastrar")) {
			Insert(request, response);
			
		}else if(url.equals("/editar")) {
			getPessoaById(request, response);	
			
		}else if(url.equals("/editarPessoa")) {
			Update(request, response);
			
		}else if(url.equals("/excluir")) {
			Delete(request, response);
			
		}else{
			response.sendRedirect("index.html");
		}

	}
	
	protected void IndexPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.html");
	}
	
	protected void RegisterPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadastro.jsp");
	}
	
	protected void Insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		pessoa.setNomePessoa(request.getParameter("nome"));
		pessoa.setCpfPessoa(request.getParameter("cpf"));
		pessoa.setIdadePessoa(Integer.parseInt(request.getParameter("idade")));
		
		pessoaDao.insert(pessoa);
		
		response.sendRedirect("read");
		
	}
	
	protected void Read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Pessoa> lista = pessoaDao.read();
		request.setAttribute("pessoas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		rd.forward(request,response);
		
		response.sendRedirect("lista.jsp");
	}
	
	protected void getPessoaById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		pessoa.setIdPessoa(Integer.parseInt(request.getParameter("idPessoa")));
		pessoaDao.getPessoaById(pessoa);
		
		request.setAttribute("idPessoa", pessoa.getIdPessoa());
		request.setAttribute("nomePessoa", pessoa.getNomePessoa());
		request.setAttribute("cpfPessoa", pessoa.getCpfPessoa());
		request.setAttribute("idadePessoa", pessoa.getIdadePessoa());
		
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
		
	}
	
	protected void Update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		pessoa.setIdPessoa(Integer.parseInt(request.getParameter("idPessoa")));
		pessoa.setNomePessoa(request.getParameter("nomePessoa"));
		pessoa.setCpfPessoa(request.getParameter("cpfPessoa"));
		pessoa.setIdadePessoa(Integer.parseInt(request.getParameter("idadePessoa")));
		
		pessoaDao.update(pessoa);
		response.sendRedirect("read");

	}
	
	protected void Delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		pessoa.setIdPessoa(Integer.parseInt(request.getParameter("idPessoa")));
		pessoaDao.delete(pessoa);	
		
		response.sendRedirect("read");
	}
	

}

