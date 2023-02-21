package schoolsptech.primeiraapi;

public class Heroi {
    private String nome;

    private String habilidade;
    private int idade;
    private int forca;


    private boolean vivo;

    public Heroi() {
    }

    public Heroi(String nome, int idade, String habilidade, int forca, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.forca = forca;
        this.vivo = vivo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public int getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
