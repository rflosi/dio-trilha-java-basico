import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o Número da Conta - ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o Nome da Agência - ");
        String numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.print("Digite o Nome do Cliente - ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o Saldo da Conta - ");
        float saldoConta = scanner.nextFloat();

        System.out.println("");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + numeroAgencia + ", conta " + numeroConta);
        System.out.println("e seu saldo " + saldoConta + " já está disponível para saque.");
        System.out.println("");

        scanner.close();

    }
}
