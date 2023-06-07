import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private Integer nDeFuncionario;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, Integer idade, String genero, Integer nDeFuncionario, Disciplina disciplina) {
        super(nome, idade, genero);
        this.nDeFuncionario = nDeFuncionario;
    }

    public Integer getnDeFuncionario() {
        return nDeFuncionario;
    }

    public void setnDeFuncionario(Integer nDeFuncionario) {
        this.nDeFuncionario = nDeFuncionario;
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public void atribuirNota(Aluno aluno, Disciplina disciplina, Double nota) {
        Notas novaNota = new Notas(nota, disciplina, aluno);
        aluno.adicionaNota(novaNota);
    }

    public Integer calcularCargaHorariaTotal() {
        int cargaHoraria = 0;
        for (Disciplina disciplina : disciplinas) {
            cargaHoraria += disciplina.getCargaHoraria();
        }
        return cargaHoraria;
    }

}
