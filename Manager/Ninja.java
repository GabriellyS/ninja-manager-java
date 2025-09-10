package Manager;

public class Ninja {

    private String nome, vila;
    private int idade;

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nIdade: " + idade + "\nVila: " + vila;
    }

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    //GETs e SETs nao usados de proposito para esse desafio
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
