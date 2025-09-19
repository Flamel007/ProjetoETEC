
public class Pessoa {

	//Abaixo da Class = atributo
	private String nomeAt;
	private int idadeAt;
	private Endereco endereco;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePar, int idadePar, Endereco enderecoPar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
		this.endereco = enderecoPar;
	}
	
	//Getters 
	public String getNome() {
		return nomeAt;
	}
	
	public int getIdade() {
		return idadeAt;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	//Setters
	public void setNome(String nomePar) {
		this .nomeAt = nomePar;
	}
	
	public void setIdade(int idadePar) {
		this .idadeAt = idadePar;
	}
	
	public void setEndereco(Endereco enderecoPar) {
		this .endereco = enderecoPar;
	}
}
