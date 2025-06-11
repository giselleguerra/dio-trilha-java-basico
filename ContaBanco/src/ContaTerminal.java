import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o usuário
        // Obter pelo scanner os valores digitados no terminal
        
        System.out.println("Qual seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo atual: ");
        double saldo = scanner.nextDouble();
        
        scanner.close();
        
        // Exibir a mensagem conta criada

        //System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f%n já está disponível para saque.", nomeCliente, agencia, conta, saldo);

    }
}
