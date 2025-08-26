package introducao;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1,nota2, media;

    public Aluno(String nome, int matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calculaMedia();
    }

    public void calculaMedia(){
        this.media = (nota1+nota2)/2;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
        calculaMedia();
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
        calculaMedia();
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Matricula: " + this.matricula +
        ", Nota1: " + this.nota1 + ", Nota2: " + this.nota2 + ", Media: " + this.media;
    }
}
