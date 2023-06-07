import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Integer numero;
    private String disciplina;
    private Professor professor;

    private List<Aluno> alunos = new ArrayList<>();

    public Turma(Integer numero, String disciplina, Professor professor) {
        this.numero = numero;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.imprimirInformacoes();
        }
    }

    public Integer calcularQuantidadeAlunos() {
        return alunos.size();
    }
}
