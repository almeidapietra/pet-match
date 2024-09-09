import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePets gerenciador = new GerenciadorDePets();
        Scanner sc = new Scanner(System.in); // Mantém o scanner para interação com o menu
        int escolha = -1;

        while (escolha != 6) { // Continua o loop até que a escolha seja 6 (sair)
            exibirMenu();
            escolha = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha após a escolha

            switch (escolha) {
                case 1:
                    gerenciador.cadastrarPet(); // Remove o Scanner do parâmetro, já que a classe GerenciadorDePets possui o Scanner próprio
                    break;

                case 2:
                    gerenciador.editarPet(); // Mesma coisa, não precisa passar o Scanner
                    break;

                case 3:
                    System.out.print("Digite o nome do pet para reservar: ");
                    String nomeReservar = sc.nextLine();
                    gerenciador.reservarPet(nomeReservar); // Passa o nome do pet que deseja reservar
                    break;

                case 4:
                    System.out.print("Digite o nome do pet para retirar: ");
                    String nomeRetirar = sc.nextLine();
                    gerenciador.retirarPet(nomeRetirar); // Passa o nome do pet que deseja retirar
                    break;

                case 5:
                    gerenciador.listarPets(); // Lista os pets cadastrados
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close(); // Fecha o scanner no final
    }

    // Exibe o menu de opções
    static void exibirMenu() {
        System.out.println(">>>> Menu de Pets <<<<");
        System.out.println("1 - Cadastrar Pet");
        System.out.println("2 - Editar Pet");
        System.out.println("3 - Reservar Pet");
        System.out.println("4 - Deletar Pet");
        System.out.println("5 - Listar Pets");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
