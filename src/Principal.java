
public class Principal {

	public static void main(String[] args) {
		
		//Objeto  = instância da Classe
		Pessoa Victor = new Pessoa();
		
		Pessoa luiz = new Pessoa("Luiz", 15);
		Pessoa rafael = new Pessoa();

		luiz.setNome("Luiz");
		
		System.out.println(Victor.getNome());
		System.out.println(luiz.getNome());
	}

}
