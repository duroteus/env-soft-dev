public class Disciplina {

    private String nome;
    private Integer codigo;
    private Integer cargaHoraria;

    public Disciplina(String nome, Integer codigo, Integer cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean verificarAprovacao(Aluno aluno) {
        if (aluno.calcularMedia() > 7.0) {
            return true;
        }
        return false;
    }
}
