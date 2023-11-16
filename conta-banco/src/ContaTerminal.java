import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e validando o número da Agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e validando o número da Conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = 0;

        // Validação para garantir que seja fornecido um número inteiro
        while (true) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                break; // Se a conversão for bem-sucedida, sair do loop
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido para a Conta:");
            }
        }

        // Solicitando e validando o nome do Cliente
        String nomeCliente = "";
        while (true) {
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();

            // Validando se o nome contém apenas letras
            if (nomeCliente.matches("[a-zA-Z]+")) {
                break; // Se contiver apenas letras, sair do loop
            } else {
                System.out.println("Insira apenas letras. Tente novamente.");
            }
        }

        // Solicitando e lendo o saldo da Conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com os dados da conta bancária em letras maiúsculas
        System.out.println("Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

