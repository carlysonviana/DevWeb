import java.util.Scanner;

public class DisplayData {
    public static void main(String args[]) {

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o ano: ");
            int ano = input.nextInt();
            System.out.print("Digite o mes: ");
            int mes = input.nextInt();
            System.out.print("Digite o dia: ");
            int dia = input.nextInt();

            Data data = new Data(ano, mes, dia);

            System.out.printf("A data digitada foi %d/%d/%d", data.getDia(), data.getMes(), data.getAno());
        }
       
    }
}
