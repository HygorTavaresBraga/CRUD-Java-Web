package Model;

public class Pessoa {
	
	private int idPessoa;
	private String nomePessoa;
	private String cpfPessoa;
	private int idadePessoa;
	
	public Pessoa() {
		super();
	}

	public Pessoa(int idPessoa, String nomePessoa, String cpfPessoa, int idadePessoa) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.cpfPessoa = cpfPessoa;
		this.idadePessoa = idadePessoa;
	}



	public int getIdPessoa() {
		return idPessoa;
	}



	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}



	public String getNomePessoa() {
		return nomePessoa;
	}



	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}



	public String getCpfPessoa() {
		return cpfPessoa;
	}



	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}



	public int getIdadePessoa() {
		return idadePessoa;
	}



	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
}
