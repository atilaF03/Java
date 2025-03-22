
public class App {

	public static void main(String[] args) {
		// define um uso do objeto em java{
			Celular celularA = new Celular();
		//}
		celularA.Nome = "iphone12";
		celularA.TamanhoTela = 6.1f;
		celularA.Armazenamento = 256;
		celularA.SistemaOperacional = "Ios";

		Celular celularB = new Celular();
		celularB.Nome = "Samsumg";
		celularB.TamanhoTela = 6.1f;
		celularB.Armazenamento = 256;
		celularB.SistemaOperacional = "Android";
		


		System.out.format(" o celular é: %s o tamanho da tela é de %.1f o armazenamento é de %d e o sistema operacional é %s\n", celularA.Nome, celularA.TamanhoTela,celularA.Armazenamento,celularA.SistemaOperacional );
		System.out.format(" o celular é: %s o tamanho da tela é de %.1f o armazenamento é de %d e o sistema operacional é %s\n", celularB.Nome, celularB.TamanhoTela,celularB.Armazenamento,celularB.SistemaOperacional );

	}
}
//objeto em java
public class Celular {
    //atributos de celular
    
    String Nome;
    String SistemaOperacional;
    int Armazenamento;
    Float TamanhoTela;

}

