import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("         💰 BANCO BYTEBANK 💰           ");
        System.out.println("========================================");
        System.out.println("Selecione a operacao (DEPOSITO / SAQUE):");

        try {
            String operacao = scanner.nextLine().trim().toUpperCase();

            System.out.print("Informe o saldo inicial da conta: R$ ");
            int saldoInicial = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Informe o valor da operacao: R$ ");
            int valorOperacao = Integer.parseInt(scanner.nextLine().trim());

            Conta conta = new Conta(saldoInicial);

            System.out.println("\n----------------------------------------");
            System.out.println("Processando operacao...");
            System.out.println("----------------------------------------");

            if ("DEPOSITO".equals(operacao)) {
                conta.depositar(valorOperacao);
                System.out.println("Sucesso! Saldo final: R$ " + conta.getSaldo());
            } else if ("SAQUE".equals(operacao)) {
                conta.sacar(valorOperacao);
                System.out.println("Sucesso! Saldo final: R$ " + conta.getSaldo());
            } else {
                System.out.println("Erro: operacao invalida");
            }

            System.out.println("========================================");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("========================================");
        } catch (Exception e) {
            System.out.println("Erro: operacao invalida");
            System.out.println("========================================");
        } finally {
            scanner.close();
        }
    }
}