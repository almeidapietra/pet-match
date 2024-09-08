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


    }

    public void editarPet(String nomeAntigo, String novoNome, int novaIdade) {

    }

    public void reservarPet(String nome) {

    }

    public void deletarPet(String nome) {

    }


}