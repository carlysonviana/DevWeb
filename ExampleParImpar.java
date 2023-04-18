import java.util.Scanner;

public class ExampleParImpar {
    public static void main(String args[]) {
        int numero;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite um número natural: ");
          numero = input.nextInt();
    

          if(numero % 2 == 0) {
            System.out.printf("O número %d é par!", numero);
          } else {
            System.out.printf("O número %d é ímpar!", numero);
          }
        }
    }
}