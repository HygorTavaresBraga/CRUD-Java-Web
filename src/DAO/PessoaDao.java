package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Pessoa;
import java.sql.SQLException;


public class PessoaDao {

	Connection con;
	ResultSet rs;
	
	public PessoaDao() {
		con = new Conexao().conectar();
	}
	
	public void insert(Pessoa pessoa) {
		
		String sql = "INSERT INTO pessoas (nomePessoa, cpfPessoa, idadePessoa) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, pessoa.getNomePessoa());
			stmt.setString(2, pessoa.getCpfPessoa());
			stmt.setInt(3, pessoa.getIdadePessoa());
			stmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Pessoa>read(){
			
			String sql = "SELECT * FROM pessoas";
			
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					int idPessoa = rs.getInt(1);
					String nomePessoa= rs.getString(2);
					String cpfPessoa= rs.getString(3);
					int idadePessoa= rs.getInt(4);
					
					pessoas.add(new Pessoa(idPessoa, nomePessoa, cpfPessoa, idadePessoa));
					
				}
				//con.close();				
				return pessoas;
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
			
		}
	
		public void getPessoaById(Pessoa pessoa) {
			String sql="SELECT * FROM pessoas WHERE idPessoa = ?";
			try {
				PreparedStatement stmt= con.prepareStatement(sql);
				
				stmt.setInt(1, pessoa.getIdPessoa());
				
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					pessoa.setIdPessoa(rs.getInt(1));
					pessoa.setNomePessoa(rs.getString(2));
					pessoa.setCpfPessoa(rs.getString(3));
					pessoa.setIdadePessoa(rs.getInt(4));	
				}

			}catch(Exception e) {
				
				System.out.println(e);
				
			}
		}
	
		public void update(Pessoa pessoa) {
			
			String sql = "UPDATE pessoas SET nomePessoa = ?, cpfPessoa = ?, idadePessoa = ? WHERE idPessoa =?";
			
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1, pessoa.getNomePessoa());
				stmt.setString(2, pessoa.getCpfPessoa());
				stmt.setInt(3, pessoa.getIdadePessoa());
				stmt.setInt(4, pessoa.getIdPessoa());
				stmt.executeUpdate();
				
				
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		public void delete(Pessoa pessoa) {
			String sql="DELETE FROM pessoas WHERE idPessoa = ?";
		try {
				
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, pessoa.getIdPessoa());
				stmt.executeUpdate();
				
			} catch (SQLException e) {	
				
				System.out.println(e);
				
			}
		}
	
}
