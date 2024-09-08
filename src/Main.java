import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePets gerenciador = new GerenciadorDePets();
        Pet p1 = new Pet();
        Scanner sc = new Scanner(System.in);
        int escolha = -1;

        while (escolha != 6) {
            exibirMenu();
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    gerenciador.cadastrarPet(sc);
                    break;

                case 2:
                    //
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }

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
