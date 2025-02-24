import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double deposito = scanner.nextDouble();

        double saqueInicial = scanner.nextDouble();

        double saqueFinal = scanner.nextDouble();


        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial;

        if (deposito >= 0.00) {
            saldoFinal = saldoFinal + deposito;
        } else  {
            saldoFinal = saldoFinal - deposito;
        }

        if (saqueInicial >= 0.00) {
            saldoFinal = saldoFinal + saqueInicial;
        } else {
            saldoFinal = saldoFinal - saqueInicial;
        }

        if (saqueFinal >= 0.00) {
            saldoFinal = saldoFinal + saqueFinal;
        } else {
            saldoFinal = saldoFinal - saqueFinal;
        }


        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }

}