import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        float saldoInicial = scanner.nextFloat();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        float transacao1 = scanner.nextFloat();

        float transacao2 = scanner.nextFloat();

        float transacao3 = scanner.nextFloat();


        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        float saldoFinal = saldoInicial;

        saldoFinal += transacao1;
        saldoFinal += transacao2;
        saldoFinal += transacao3;

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }

}
