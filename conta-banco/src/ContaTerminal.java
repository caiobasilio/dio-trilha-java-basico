import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Importar classe Scanner
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        // Exibir perguntas para o usuario
        System.out.println("Por favor, digite o número da conta.");
        conta.setNumero(Integer.parseInt(scanner.nextLine()));

        System.out.println("Por favor, digite o número da agência.");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite seu nome completo.");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo da sua conta.");
        conta.setSaldo(Double.parseDouble(scanner.nextLine()));

        System.out.println(
                "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                        conta.getAgencia() + ", conta " + conta.getNumero() +
                        " e seu saldo R$" + conta.getSaldo() +
                        " já está disponível para saque"
        );

    }
}