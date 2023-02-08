public class AlunoPos extends Aluno {

    private Double nota1;
    private Double nota2;
    private Double notaMOnografia;
    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMOnografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMOnografia = notaMOnografia;
    }

    @Override
    public Double calcularMedia() {
        double media = 0;

        media = nota1 + nota2 + notaMOnografia / 3;

        return media;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaMOnografia() {
        return notaMOnografia;
    }

    public void setNotaMOnografia(Double notaMOnografia) {
        this.notaMOnografia = notaMOnografia;
    }

    @Override
    public String toString() {
        return String.format( "Alunos Pos" +
                "\n nota1: " + nota1 +
                ", \n nota2: " + nota2 +
                ", \n nota3: " + notaMOnografia +
                super.toString() + "\n");
    }
}
