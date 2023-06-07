public class Pessoa {

    private String nome;
    private Integer idade;
    private String genero;

    public Pessoa(String nome, Integer idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimirInformacoes() {
        System.out.printf("Nome do aluno: %s. Idade: %d. Gênero: %s.%n", this.nome, this.idade,
                this.genero);
    }

    public boolean maiorDeIdade() {
        if (this.idade >= 18) {
            return true;
        }
        return false;
    }

}
