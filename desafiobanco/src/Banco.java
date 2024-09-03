import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Diogo";
        String tipoConta = "Conta Corrente";
        Double saldo = 1599.0;
        int opcao = 0;

        System.out.println("-----------(     )------------");
        System.out.println("\nUsuário: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n-----------(     )------------");

        String menu = """
                --( Menu )--
                1 - Consultar Saldo
                2 - Transferir
                3 - Deposito
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("sem saldo");
                } else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Transferencia recebida: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}