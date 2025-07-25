import java.util.Scanner;
public class ComntaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os 4 ultimos número do cartão: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu saldo atual: R$ ");
        Float saldo = scanner.nextFloat();

        
        System.out.printf("\nOlá %s! Obrigado por criar sua conta conosco.\n", nome);
        System.out.printf("Agência: %s\n", agencia);
        System.out.printf("Número da Conta: %d\n", numero);
        System.out.printf("Saldo: R$%.2f - já disponível para saque.\n", saldo);

    }
}
