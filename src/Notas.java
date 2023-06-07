public class Notas {

    private Double nota;
    private Disciplina disciplina;
    private Aluno aluno;

    public Notas(Double nota, Disciplina disciplina, Aluno aluno) {
        this.nota = nota;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
