import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, dígite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, dígite a agência da conta: ");
            String agencia = scanner.next();

            System.out.println("Insira o seu nome: ");
            String nomeCliente = scanner.next();

            System.out.println("Insira o seu sobrenome: ");
            String sobrenomeCliente = scanner.next();

            System.out.println("Insira o seu saldo: ");
            float saldo = scanner.nextFloat();

            System.out.println("Olá "+ nomeCliente +" "+sobrenomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        }

    }
}