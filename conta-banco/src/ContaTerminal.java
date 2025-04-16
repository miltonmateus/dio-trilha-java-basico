import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println(numeroConta);
        System.out.println(agencia);
        System.out.println(nome);
        System.out.println(saldo);

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque! ";

        System.out.println(mensagem);
    }
}