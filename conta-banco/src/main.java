import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os dados Conta: ");

        // Pegando o número da Conta
        System.out.print("\nNumero: ");
        conta.Numero = teclado.nextInt();
        teclado.nextLine();

        // Pegando o número da Agencia
        System.out.print("Agencia: ");
        conta.Agencia = teclado.next();
        teclado.nextLine();

        // Pegando o nome do Cliente
        System.out.print("Nome: ");
        conta.NomeCliente = teclado.next();
        teclado.nextLine();

        // Pegando o saldo da Conta
        System.out.print("Saldo: ");
        conta.Saldo = teclado.nextDouble();
        teclado.nextLine();


        System.out.println("Olá " + conta.NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.Agencia + " conta " + conta.Numero + " é seu saldo " + conta.Saldo + " já está disponivel para saque.");





    
        
    }
    
}
