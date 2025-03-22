import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array para armazenar os 10 números inteiros
        int[] numeros = new int[10];

        // Lendo os 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializando as variáveis para o menor e o maior valor
        int menor = numeros[0];
        int maior = numeros[0];

        // Encontrando o menor e o maior valor no array
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibindo os resultados
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);

        // Fechando o scanner
        scanner.close();
    }
}
