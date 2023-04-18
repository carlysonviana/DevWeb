import java.util.Scanner;

public class ExampleMult {
    public static void main(String args[]) {
        double valor1;
        double valor2;
        double resultado;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite o 1º valor da multiplicação: ");
          valor1 = input.nextDouble();
          System.out.print("Digite o 2º valor da multiplicação: ");
          valor2 = input.nextDouble();
    
          resultado = valor1 * valor2;

          if(resultado < 25 || resultado > 50) {
            System.out.printf("A metade do resultado é: %.1f", resultado / 2);
          } else {
            System.out.printf("O resultado é: %.1f", resultado);
          }
        }
    }
}