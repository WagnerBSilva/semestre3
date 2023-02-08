public class TesteAluno {
    public static void main(String[] args) {

        AlunoFundamental af = new AlunoFundamental(100, "Wagner", 10.0, 7.9,
                8.0, 10.0);
        AlunoGraduacao ag = new AlunoGraduacao(101, "Andreia", 8.0, 9.9);
        AlunoPos ap = new AlunoPos(102, "João", 5.0, 8.0, 10.0);
        Escola e = new Escola("SPTECH");

        e.adicionarAluno(af);
        e.adicionarAluno(ag);
        e.adicionarAluno(ap);
        e.exibeTodos();
        e.ExibeAluno(102);
        e.exibeAprovados();
        e.exibeTodosAlunosGraduacao();


    }
}
 