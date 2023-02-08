import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a){
        System.out.println("Adicionando aluno!");
        alunos.add(a);
    }

    public void exibeTodos(){
        System.out.println("Exibindo todos os alunos!");
     for  (int i = 0; i < alunos.size(); i++){
         System.out.println(alunos.get(i).getNome());
     }
    }

    public void  exibeTodosAlunosGraduacao(){
        System.out.println("Exibindo aluno da graduação!");
        for (Aluno a : alunos) {
            if(a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
        }


    public void exibeAprovados(){
        System.out.println("Exibindo alunos aprovados!");
       for (int i = 0; i < alunos.size(); i++){
           if(alunos.get(i).calcularMedia() >= 6){
               System.out.println(alunos.get(i).getNome());
           }
       }
    }

    public void ExibeAluno(Integer ra){
        System.out.println("Exibindo alunos por Ra!");
        for (int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getRa().equals(ra)) {
                System.out.println(alunos.get(i));
            }
        }
    }
}
