import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer numeroConta;
        String agencia;
        String nomeCliete;
        Double saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        nomeCliete = entrada.nextLine();

        System.out.println("Por favor, digite o número da sua agência:");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        numeroConta = entrada.nextInt();

        System.out.println("Por favor, digite o seu saldo:");
        saldo = entrada.nextDouble();

        System.out.println("\n");

        System.out.println(MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, sua conta é o nº {2} e seu saldo é de {3} que já está disponível para saque.",nomeCliete,agencia,numeroConta,saldo));
    }
}