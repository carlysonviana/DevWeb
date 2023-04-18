import java.util.Scanner;

public class ExampleBar {
  public static void main(String args[]) {
    double barra;
    double sobra;

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite o tamanho da barra (em metros): ");
      barra = input.nextDouble();

      sobra = barra % 5;

      System.out.printf("O que sobrou da barra foi: %.2f m", sobra);
    }
  }
}