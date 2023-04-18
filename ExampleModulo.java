import java.util.Scanner;

public class ExampleModulo{
    public static void main(String args[]) {
        int numero;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite um número inteiro: ");
          numero = input.nextInt();
    

          if(numero < 0) {
            System.out.printf("O módulo do número é: %d", numero * -1);
          } else {
            System.out.printf("O módulo do número é: %d", numero);
          }
        }
    }
}