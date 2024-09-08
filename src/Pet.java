public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private boolean reservado;

    // Construtor completo
    public Pet(String nome, int idade, String raca, boolean reservado) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.reservado = reservado;
    }

    // Construtor simplificado
    public Pet(String nome, String raca, int idade) {
        this(nome, idade, raca, false); // Definindo reservado como false por padrão
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + ", Reservado: " + reservado;
    }
}
