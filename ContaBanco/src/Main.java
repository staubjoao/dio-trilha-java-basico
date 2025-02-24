import java.util.Scanner;

import model.ContaTerminal;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.print("Por favor digite o número da Agência: ");
        contaTerminal.setNumero(Integer.parseInt(scanner.nextLine()));
        System.out.print("Por favor digite a Agência: ");
        contaTerminal.setAgencia(scanner.nextLine());
        System.out.print("Por favor digite o seu nome: ");
        contaTerminal.setNomeCliente(scanner.nextLine());
        System.out.print("Por favor digite o seu saldo: ");
        contaTerminal.setSaldo(Double.parseDouble(scanner.nextLine()));

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n"
        , contaTerminal.getNomeCliente(), contaTerminal.getAgencia(), contaTerminal.getNumero(), contaTerminal.getSaldo());

    }
}
