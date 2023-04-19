import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            // ------ primeiro empregado ------
            Empregado empregado1 = new Empregado("José", "Ferreira", 2320.50);
            Empregado empregado2 = new Empregado("Maria", "Souza", 3820.10);
    
            System.out.printf("Nome do empregado: %s %s\n", empregado1.getPrimeiroNome(), empregado1.getUltimoNome());
            System.out.printf("Salário anual: R$ %.2f\n", empregado1.getSalarioMensal() * 12);

            System.out.printf("Nome do empregado: %s %s\n", empregado2.getPrimeiroNome(), empregado2.getUltimoNome());
            System.out.printf("Salário anual: R$ %.2f\n", empregado2.getSalarioMensal() * 12);

            System.out.println("Os salários do empregados serão aumentados em 10%!");
            empregado1.bonusSalario();
            empregado2.bonusSalario();

            System.out.printf("Novo salário anual de %s %s: R$ %.2f\n", empregado1.getPrimeiroNome(), empregado1.getUltimoNome(), empregado1.getSalarioMensal() * 12);
            System.out.printf("Novo salário anual de %s %s: R$ %.2f\n", empregado2.getPrimeiroNome(), empregado2.getUltimoNome(), empregado2.getSalarioMensal() * 12);
        }
    }
}
