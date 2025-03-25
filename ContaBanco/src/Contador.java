import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        do {
            System.out.println();
            System.out.print("Digite o primeiro parâmetro - ");
            parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro  - ");
            parametroDois = terminal.nextInt();
            System.out.println();

            try {
                // chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("*** O segundo parâmetro deve ser maior que o primeiro");
            }
        } while (parametroUm >= parametroDois);

        System.out.println();
        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem

        for (int conta = 0; conta < contagem; conta++) {
            int sequencia = conta + 1;
            System.out.println("Contagem " + sequencia + " de " + contagem);
        }

    }

}
