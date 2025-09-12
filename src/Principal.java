
public class Principal {

	public static void main(String[] args) {
		
		//Objeto  = instância da Classe
		Pessoa victor_obj = new Pessoa();
		
		Pessoa luiz_obj = new Pessoa("Luiz", 15);
		Pessoa rafael_obj = new Pessoa();

		luiz_obj.setNome("Luiz");
		
		System.out.println(victor_obj.getNome());
		System.out.println(luiz_obj.getNome());
	}

}
