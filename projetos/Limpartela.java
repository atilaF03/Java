package projetos;

import java.util.Scanner;

public class Limpartela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, rest = 0;
		System.out.println("insira um numero");
		a = scan.nextInt();
		limparConsole();
		System.out.println("insira um numero");
		b = scan.nextInt();

		rest = a + b;
		limparConsole();
		System.out.println(" a soma é " + rest);
	}

	public static void limparConsole() {// função limpar tela
		try {
			// Limpa o console de acordo com o sistema operacional
			System.getProperty("os.name").contains("Windows");
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		} catch (Exception e) {
			System.out.println("Erro ao limpar o console: " + e.getMessage());
		}
	}
}
