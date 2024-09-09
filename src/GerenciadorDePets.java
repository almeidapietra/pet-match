import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDePets {
    private List<Pet> pets = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void cadastrarPet(Scanner sc) {
        System.out.print("Digite o tipo de Pet (Cachorro/Gato): ");
        String tipo = sc.nextLine().trim().toLowerCase();

        if (!tipo.equals("cachorro") && !tipo.equals("gato")) {
            System.out.println("Tipo de pet inválido!");
            return;
        }
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();  // Limpa o buffer

        Pet pet;

        if (tipo.equals("cachorro")) {
            System.out.print("Porte (Pequeno/Médio/Grande): ");
            String porte = sc.nextLine();
            pet = new Cachorro(nome, raca, idade, porte);
        } else {
            pet = new Gato(nome, raca, idade);
        }

        if (existePet(nome)) {
            System.out.println("Pet com o nome '" + nome + "' já está cadastrado.");
        } else {
            pets.add(pet);
            System.out.println("Pet cadastrado com sucesso!");
        }
    }

    public boolean existePet(String nome) {
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void listarPets() {
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet encontrado!\n");
        } else {
            System.out.println("Lista de Pets cadastrados:\n ");
            for (Pet pet : pets) {
                System.out.println("Nome: " + pet.getNome());
                System.out.println("Raca: " + pet.getRaca());
                System.out.println("Idade: " + pet.getIdade());
                System.out.println("Reservado: " + pet.isReservado());

                if (pet instanceof Cachorro cachorro) {
                    System.out.println("Porte: " + cachorro.getPorte());
                }
                System.out.println();
            }
        }
    }

    public void editarPet(Scanner sc) {
        System.out.print("Digite o nome do pet: ");
        String nome = sc.nextLine();

        boolean petEncontrado = false;

        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite o novo nome do Pet: ");
                String novoNome = sc.nextLine();

                System.out.print("Digite a nova idade do Pet: ");
                int novaIdade = sc.nextInt();
                sc.nextLine();

                pet.setNome(novoNome);
                pet.setIdade(novaIdade);
                petEncontrado = true;
                System.out.println("Pet atualizado com sucesso!\n");
                break;
            }
        }
        if (!petEncontrado) {
            System.out.println("Pet não encontrado.\n");
        }

    }

    public void reservarPet(String nome) {
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome)) {
                if (!pet.isReservado()) {
                    pet.setReservado(true);
                    System.out.println("Pet '" + nome + "' reservado com sucesso!");
                } else {
                    System.out.println("Pet '" + nome + "' já está reservado.");
                }
                return;
            }
        }
        System.out.println("Pet '" + nome + "' não encontrado.");
    }


    public void retirarPet(String nome) {
        boolean petRemovido = false;

        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.getNome().equalsIgnoreCase(nome)) {
                // Verifica se o pet está reservado
                if (pet.isReservado()) {
                    // Remove o pet da lista
                    pets.remove(i);
                    System.out.println("Pet '" + nome + "' retirado com sucesso!");
                } else {
                    System.out.println("Pet '" + nome + "' não está reservado.");
                }
                petRemovido = true;
                break;
            }
        }

        if (!petRemovido) {
            System.out.println("Pet '" + nome + "' não encontrado.");
        }
    }


}