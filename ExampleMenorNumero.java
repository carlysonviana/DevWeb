import java.util.Scanner;

public class ExampleMenorNumero {
    public static void main(String args[]) {
        int numero1;
        int numero2;
        int numero3;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite o 1º número: ");
          numero1 = input.nextInt();
          System.out.print("Digite o 2º número: ");
          numero2 = input.nextInt();
          System.out.print("Digite o 3º número: ");
          numero3 = input.nextInt();
    

          if(numero1 <= numero2 && numero1 <= numero3) {
            System.out.printf("O menor número é %d ", numero1);
          } else if(numero2 < numero1 && numero2 < numero3) {
            System.out.printf("O menor número é %d ", numero2);
          } else {
            System.out.printf("O menor número é %d ", numero3);
          }
        }
    }
}