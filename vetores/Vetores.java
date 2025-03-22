import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        final int tam = 5;
        char[] gabarito = { 'a', 'b', 'c', 'd', 'e' };
        char[] respostas = new char[tam];
        int nota = 0;
       
        Scanner scanner  = new Scanner(System.in);

        for(int i= 0;i<tam;i++){
          System.out.printf("informe a nota é:%d",i);
          respostas[i]=scanner.nextLine().charAt(0);
        }
        
        for(int i= 0;i<tam;i++){
            if (respostas[i]== gabarito[i]) {
                nota++;
            }
        }
        System.out.println("os acertos dos aluno:"+nota);

    }
}
