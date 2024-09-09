import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDePets {
    private List<Pet> pets = new ArrayList<>();
    private Scanner sc = new Scanner(System.in); // Não precisa passar Scanner como parâmetro se já está disponível como atributo da classe

    // Método para cadastrar um novo pet
    public void cadastrarPet() {
        System.out.print("Digite o tipo de Pet (Cachorro/Gato): ");
        String tipo = sc.nextLine().trim().toLowerCase();

        // Verifica se o tipo de pet é válido
        if (!tipo.equals("cachorro") && !tipo.equals("gato")) {
            System.out.println("Tipo de pet inválido!");
            return;
        }

        // Coleta informações comuns ao pet
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        // Cria o objeto do tipo Pet com base no tipo escolhido
        Pet pet;
        if (tipo.equals("cachorro")) {
            System.out.print("Porte (Pequeno/Médio/Grande): ");
            String porte = sc.nextLine();
            pet = new Cachorro(nome, raca, idade, porte);
        } else {
            pet = new Gato(nome, raca, idade);
        }

        // Verifica se o pet já existe pelo nome
        if (existePet(nome)) {
            System.out.println("Pet com o nome '" + nome + "' já está cadastrado.");
        } else {
            pets.add(pet); // Adiciona o pet à lista
            System.out.println("Pet cadastrado com sucesso!");
        }
    }

    // Verifica se um pet com o nome fornecido já existe
    public boolean existePet(String nome) {
        return pets.stream().anyMatch(pet -> pet.getNome().equalsIgnoreCase(nome)); // Utiliza Stream API para simplificar
    }

    // Lista todos os pets cadastrados
    public void listarPets() {
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet encontrado!\n");
        } else {
            System.out.println("Lista de Pets cadastrados:\n");
            for (Pet pet : pets) {
                System.out.println("Nome: " + pet.getNome());
                System.out.println("Raça: " + pet.getRaca());
                System.out.println("Idade: " + pet.getIdade());
                System.out.println("Reservado: " + (pet.isReservado() ? "Sim" : "Não"));

                // Se o pet for um cachorro, exibe também o porte
                if (pet instanceof Cachorro) {
                    System.out.println("Porte: " + ((Cachorro) pet).getPorte());
                }
                System.out.println();
            }
        }
    }

    // Edita as informações de um pet já cadastrado
    public void editarPet() {
        System.out.print("Digite o nome do pet a ser editado: ");
        String nome = sc.nextLine();

        Pet petEncontrado = pets.stream()
                .filter(pet -> pet.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null); // Usa Stream API para buscar o pet

        if (petEncontrado != null) {
            System.out.print("Digite o novo nome do Pet: ");
            String novoNome = sc.nextLine();
            System.out.print("Digite a nova idade do Pet: ");
            int novaIdade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            petEncontrado.setNome(novoNome);
            petEncontrado.setIdade(novaIdade);
            System.out.println("Pet atualizado com sucesso!\n");
        } else {
            System.out.println("Pet não encontrado.\n");
        }
    }

    // Reserva um pet, se ele não estiver reservado
    public void reservarPet(String nome) {
        Pet petEncontrado = pets.stream()
                .filter(pet -> pet.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);

        if (petEncontrado != null) {
            if (!petEncontrado.isReservado()) {
                petEncontrado.reservar(); // Chama o método reservar ao invés de setReservado(true)
                System.out.println("Pet '" + nome + "' reservado com sucesso!");
            } else {
                System.out.println("Pet '" + nome + "' já está reservado.");
            }
        } else {
            System.out.println("Pet '" + nome + "' não encontrado.");
        }
    }

    // Remove um pet da lista, mas apenas se ele estiver reservado
    public void retirarPet(String nome) {
        Pet petEncontrado = pets.stream()
                .filter(pet -> pet.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);

        if (petEncontrado != null) {
            if (petEncontrado.isReservado()) {
                pets.remove(petEncontrado); // Remove o pet da lista
                System.out.println("Pet '" + nome + "' retirado com sucesso!");
            } else {
                System.out.println("Pet '" + nome + "' não está reservado.");
            }
        } else {
            System.out.println("Pet '" + nome + "' não encontrado.");
        }
    }
}
