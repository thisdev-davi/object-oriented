package objectOriented.reutilizacao.alunos;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, String cpf, Endereco end, int matricula, String curso){
        super(nome, cpf, end);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno() {
        super();
        this.curso = "";
    }

    public Aluno(String nome, String cpf, int matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Curso: " + curso;
    }
}