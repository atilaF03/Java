import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] valores = new int[3];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("insira um valor: ");
            valores[i] = sc.nextInt();
            soma += valores[i];
            
        }
        System.out.println("a media do valores: " + soma/3);
        sc.close();

    }
}
