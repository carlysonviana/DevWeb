import java.util.Scanner;

public class ExampleSalario {
    public static void main(String args[]) {
        double salario;
        double salarioReajustado;
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite o salário atual: R$ ");
          salario = input.nextDouble();
    
          salarioReajustado = salario + salario * 0.1;
    
          System.out.printf("O salário reajustado foi: R$ %.2f", salarioReajustado);
        }
    }
}
