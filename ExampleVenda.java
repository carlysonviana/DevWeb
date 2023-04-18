import java.util.Scanner;

public class ExampleVenda {
    public static void main(String args[]) {
        double salario;
        double valorVendas;
        double salarioReajustado;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite o salário do funcionário: ");
          salario = input.nextDouble();
          System.out.print("Digite o valor das vendas do funcionário: ");
          valorVendas = input.nextDouble();
    

          if(salario < 1500 && valorVendas > 2000) {
            salarioReajustado = salario + (salario * 0.1);
            System.out.printf("Houve uma bonificação de 10%% e salário aumentou para R$ %.2f", salarioReajustado);
          } else {
            System.out.printf("Não houve bonificação, então o salário continua como R$ %.2f", salario);
          }
        }
    }
}