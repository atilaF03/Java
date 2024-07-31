package Java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1, Selector = 0;
        float dinheiro = 100, soma = 0, sub = 0;

        while (contador != 0) {
            informacoes();
            Selector = scan.nextInt();
            System.out.println("o opção selecionada foi(" + Selector + ")");

            switch (Selector) {
                case 1:

                    if (dinheiro > 0) {

                        System.out.println("insira o valor da transferencia bancaria:");
                        sub = scan.nextFloat();

                        if (sub <= dinheiro) {
                            dinheiro = dinheiro - sub;
                            System.out.println("tranferencia concluida com sucesso ");
                        } else {
                            System.out.println("saldo invalido");
                        }

                    } else {
                        System.out.println("seu saldo esta negativo ");

                    }

                    break;

                case 2:
                    System.out.println("Insira o valor do deposito ");
                    soma = scan.nextFloat();
                    System.out.println("seu Saldo foi atualizado com sucesso");
                    dinheiro += soma;
                    break;
                case 3:
                    System.out.format(" R$ " + dinheiro);
                    break;
                case 4:
                    if (Selector >= 4) {
                        System.out.println("opção invalida");
                    }
                    break;
                default:
            }
        }

    }

    public static void informacoes() {
        System.out.println("====================================");
        System.out.println("1-Fazer transferencia bancaria ");
        System.out.println("2-Depositar em conta");
        System.out.println("3-ver debito em conta ");
        System.out.println("====================================");

    }
}
