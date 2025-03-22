import java.util.Scanner;

public class ternaria
 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int nota = 0;

        System.out.println("Insira uma nota");
        nota = scanf.nextInt();

        String  res = (nota >= 7 ?"Aprovado":"Reprovado" );
        // Operador térnario 
        System.out.println("resultado: "+ res);

    }
}
