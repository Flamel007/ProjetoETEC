
public class Principal {

	public static void main(String[] args) {
		
		//Objeto  = instância da Classe
		Pessoa victor_obj = new Pessoa();
		
		Pessoa luiz_obj = new Pessoa("Luiz", 15);
		Pessoa rafael_obj = new Pessoa();

		luiz_obj.setNome("Luiz");
		victor_obj.setNome("vIcToR");
		rafael_obj.setIdade(16);
		
		System.out.println(victor_obj.getNome());
		System.out.println(victor_obj.getIdade());
		System.out.println(luiz_obj.getNome());
		System.out.println(luiz_obj.getIdade());
		System.out.println(rafael_obj.getNome());
		System.out.println(rafael_obj.getIdade());
	}

}
