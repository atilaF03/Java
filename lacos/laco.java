import java.util.Scanner;

public class laco {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int Number = 0, escolha = 0, Number2;

        do {

            System.out.println("Insira o primeiro valor");
            Number = scan.nextInt();
            System.out.println("Insira o Segundo valor");
            Number2 = scan.nextInt();

            System.out.println("==========================================================");
            System.out.println("insira a sua escolha");
            System.out.println("1 ver os numeros ");
            System.out.println("2 para verificar se os numeros são pares");
            System.out.println("3 verificar se a media dos numero é maior ou igual a 7 ");
            System.out.println("4 Deseja inserir um novo numero");
            System.out.println("5  encerrar o programa");
            System.out.println("==========================================================");
            escolha = scan.nextInt();


            switch (escolha) {
                case 1:
                    if (Number % 2 == 0) {
                        System.out.println("o numero é multiplo");
                    } else {
                        System.out.println("o numeo não é multiplo");
                    }
                    break;
                case 2:
                    if (Number % 2 == 0) {
                        System.out.println("o numero é par");
                    } else {
                        System.out.println("o numero é impar");
                    }
                    if (Number2 % 2 == 0) {
                        System.out.println("o numero é par");
                    } else {
                        System.out.println("o numer é impar");
                    }
                    break;
                case 3:
                    media(Number, Number2);
                    break;
                case 4:
                    System.out.println("Insira o primeiro valor");
                    Number = scan.nextInt();
                    System.out.println("Insira o Segundo valor");
                    Number2 = scan.nextInt();
                    break;
                default:
                    break;
            }
            escolha++;
        } while (escolha < 5); // cria um laço infinito 

    }

    public static void media(int a, int b) {
        // função para contar média
        int media = (a + b) / 2;
        System.out.println(" A media é" + media);
        if (media > 7) {
            System.out.println(" a media a maior que 7 ");
        } else {
            System.out.println("a media do numero não é igual a 7 ");
        }
    }

}
