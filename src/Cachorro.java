public class Cachorro extends Pet {
    private String porte;

    public Cachorro(String nome, String raca, int idade, String porte) {
        super(nome, raca, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    @Override
    public String toString() {
        return super.toString() + ", Porte: " + porte;
    }
}

