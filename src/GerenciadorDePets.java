import java.util.ArrayList;
import java.util.List;

public class GerenciadorDePets {
    private List<Pet> pets = new ArrayList<>();

    public void cadastrarPet(Pet pet) {
        if (existePet(pet.getNome())) {
            System.out.println("Pet com o nome '" + pet.getNome() + "' já está cadastrado.");
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
            System.out.println("Nenhum pet cadastrado.");
            return;
        }
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public void editarPet(String nomeAntigo, String novoNome, String novaRaca, int novaIdade) {
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nomeAntigo)) {
                pet.setNome(novoNome);
                pet.setRaca(novaRaca);
                pet.setIdade(novaIdade);
                System.out.println("Pet atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Pet com o nome '" + nomeAntigo + "' não encontrado.");
    }

    public void reservarPet(String nome) {
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome)) {
                pet.reservar();
                System.out.println("Pet reservado com sucesso!");
                return;
            }
        }
        System.out.println("Pet com o nome '" + nome + "' não encontrado.");
    }

    public void deletarPet(String nome) {
        Pet petToRemove = null;
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome)) {
                petToRemove = pet;
                break;
            }
        }
        if (petToRemove != null) {
            pets.remove(petToRemove);
            System.out.println("Pet deletado com sucesso!");
        } else {
            System.out.println("Pet com o nome '" + nome + "' não encontrado.");
        }
    }
}
