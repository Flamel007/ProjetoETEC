
public class Pessoa {

	//Abaixo da Class = atributo
	String nomeAt;
	int idadeAt;
	Endereco endereco;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePar, int idadePar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	}
	
	//Getters 
	public String getNome() {
		return nomeAt;
	}
	
	public int getIdade() {
		return idadeAt;
	}
	
	//Setters
	public void setNome(String nomePar) {
		this .nomeAt = nomePar;
	}
	
	public void setIdade(int idadePar) {
		this .idadeAt = idadePar;
	}
}
