import java.util.Scanner;

public class Banco {
    public static void main(String args[]) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o nome do cliente: ");
            Conta cliente = new Conta(input.nextLine(), -10);

            System.out.printf("O nome do cliente: %s%n", cliente.getNome());
            System.out.printf("O saldo do cliente: %.2f%n", cliente.getSaldo());

            System.out.print("Digite o valor do depósito do cliente: ");
            cliente.deposito(input.nextDouble());

            System.out.printf("O nome do cliente: %s%n", cliente.getNome());
            System.out.printf("O saldo do cliente: %.2f%n", cliente.getSaldo());
        }
    }
}
