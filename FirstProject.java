import java.util.Scanner;

public class FirstProject {
  public static void main(String args[]) {
    double distancia; //distancia = 1260.0;
    double tempoMinutos; //tempo = 4.0;
    double tempoSegundos;

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite a distância percorrida (em metros): ");
      distancia = input.nextDouble();
      System.out.print("Digite o tempo gasto (em minutos): ");
      tempoMinutos = input.nextDouble();

      tempoSegundos = tempoMinutos * 60;

      System.out.printf("João teve velocidade média de: %.2f m/s", distancia/tempoSegundos);
    }
  }
}