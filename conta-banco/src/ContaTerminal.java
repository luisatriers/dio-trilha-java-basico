import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o NOME DO CLIENTE:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o número da AGÊNCIA:");
        String agencia = scanner.next();
        System.out.println("Digite o número da CONTA:");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o VALOR DO SALDO da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
