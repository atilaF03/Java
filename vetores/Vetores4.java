import java.util.Scanner;

public class Vetores4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Tamanho fixo de 10 para o array
        int contador = 0; // Contador para controlar quantos números estão armazenados
        int opcao;

        do {
            informacoes();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (contador < numeros.length) {
                        System.out.print("Digite o número para adicionar: ");
                        numeros[contador] = scanner.nextInt();
                        contador++;
                    } else {
                        System.out.println("O array está cheio. Não é possível adicionar mais números.");
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("Números armazenados:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Índice " + i + ": " + numeros[i]);
                        }
                    }
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("Não há números para remover.");
                    } else {
                        System.out.print("Digite o índice do número a remover: ");
                        int indice = scanner.nextInt();
                        if (indice < 0 || indice >= contador) {
                            System.out.println("Índice inválido.");
                        } else {
                            for (int i = indice; i < contador - 1; i++) {
                                numeros[i] = numeros[i + 1]; // Desloca os números para preencher o espaço
                            }
                            contador--; // Decrementa o contador após remover
                            System.out.println("Número removido com sucesso.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
    public static void informacoes(){
        System.out.println("\nMenu:");
        System.out.println("1 - Adicionar um número");
        System.out.println("2 - Exibir números");
        System.out.println("3 - Remover um número");
        System.out.println("4 - Finalizar programa");
        System.out.print("Escolha uma opção: ");

    }
}
