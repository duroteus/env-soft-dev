import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private Integer nDeMatricula;
    private String curso;

    private List<Notas> notas = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, Integer idade, String genero, Integer nDeMatricula, String curso) {
        super(nome, idade, genero);
        this.nDeMatricula = nDeMatricula;
        this.curso = curso;
    }

    public Integer getnDeMatricula() {
        return nDeMatricula;
    }

    public void setnDeMatricula(Integer nDeMatricula) {
        this.nDeMatricula = nDeMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double calcularMedia() {
        Double somaDasNotas = 0.0;

        for (Notas nota : notas) {
            somaDasNotas += nota.getNota();
        }

        return somaDasNotas / notas.size();
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public void adicionaNota(Notas nota) {
        notas.add(nota);
    }

    public void listarNotas() {
        for (Notas nota : notas) {
            System.out.printf("Nota: %.1f.%nDisciplina: %s", nota.getNota(), nota.getDisciplina().getNome());
        }
    }

}
