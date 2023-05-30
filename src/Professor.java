public class Professor extends Pessoa {

    private Integer nDeFuncionario;
    private String disciplina;

    public Professor(String nome, Integer idade, String genero, Integer nDeFuncionario, String disciplina) {
        super(nome, idade, genero);
        this.nDeFuncionario = nDeFuncionario;
        this.disciplina = disciplina;
    }

    public Integer getnDeFuncionario() {
        return nDeFuncionario;
    }

    public void setnDeFuncionario(Integer nDeFuncionario) {
        this.nDeFuncionario = nDeFuncionario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
