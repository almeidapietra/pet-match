import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePets gerenciador = new GerenciadorDePets();
        Scanner sc = new Scanner(System.in);
        int escolha = -1;

        while (escolha != 6) {
            exibirMenu();
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarPet(sc, gerenciador);
                    break;

                case 2:
                    editarPet(sc, gerenciador);
                    break;

                case 3:
                    reservarPet(sc, gerenciador);
                    break;

                case 4:
                    deletarPet(sc, gerenciador);
                    break;

                case 5:
                    listarPets(gerenciador);
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

    static void cadastrarPet(Scanner sc, GerenciadorDePets gerenciador) {
        System.out.print("Digite o tipo de Pet (Cachorro/Gato): ");
        String tipo = sc.nextLine().trim();

        if (!tipo.equalsIgnoreCase("Cachorro") && !tipo.equalsIgnoreCase("Gato")) {
            System.out.println("Tipo de pet inválido!");
            return;
        }
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Idade: ");
        int idade;
        try {
            idade = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Idade inválida. Insira um número inteiro.");
            sc.nextLine();
            return;
        }
        sc.nextLine();

        Pet pet;

        if (tipo.equalsIgnoreCase("Cachorro")) {
            System.out.print("Porte (Pequeno/Médio/Grande): ");
            String porte = sc.nextLine();
            pet = new Cachorro(nome, raca, idade, porte);
        } else {
            pet = new Gato(nome, raca, idade);
        }

        if (gerenciador.existePet(nome)) {
            System.out.println("Pet com o nome '" + nome + "' já está cadastrado.");
        } else {
            gerenciador.cadastrarPet(pet);
            System.out.println("Pet cadastrado com sucesso!");
        }
    }
    static void editarPet(Scanner sc, GerenciadorDePets gerenciador) {
        System.out.print("Digite o nome do Pet a ser editado: ");
        String nome = sc.nextLine();
        System.out.print("Novo nome: ");
        String novoNome = sc.nextLine();
        System.out.print("Nova raça: ");
        String novaRaca = sc.nextLine();
        System.out.print("Nova idade: ");
        int novaIdade;
        try {
            novaIdade = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Idade inválida. Insira um número inteiro.");
            sc.nextLine(); // Limpar o buffer do Scanner
            return;
        }
        sc.nextLine(); // Limpar o buffer do Scanner

        gerenciador.editarPet(nome, novoNome, novaRaca, novaIdade);
        System.out.println("Pet editado com sucesso!");
    }

    static void reservarPet(Scanner sc, GerenciadorDePets gerenciador) {
        System.out.print("Digite o nome do Pet a ser reservado: ");
        String nome = sc.nextLine();
        gerenciador.reservarPet(nome);
        System.out.println("Pet reservado com sucesso!");
    }

    static void deletarPet(Scanner sc, GerenciadorDePets gerenciador) {
        System.out.print("Digite o nome do Pet a ser deletado: ");
        String nome = sc.nextLine();
        gerenciador.deletarPet(nome);
        System.out.println("Pet deletado com sucesso!");
    }

    static void listarPets(GerenciadorDePets gerenciador) {
        gerenciador.listarPets();
    }
}
