package objectOriented.reutilizacao.alunos;
import java.util.ArrayList;

public class AppTest {
    public static void main(String[] args){
        ArrayList<Pessoa> listPessoa = new ArrayList<>();


    }

    public static void cadastrar(ArrayList<Pessoa> list){
        Endereco endereco = new Endereco("", "Serra", "ES", 77, 29333444);

        Pessoa pessoa1 = new Pessoa("Mauro", "321", endereco);
        Pessoa pessoa2 = new Pessoa("Pedro", "456");
        Aluno aluno1 = new Aluno("Arthur", "678", endereco, 1, "Contabilidade");
        Aluno aluno2 = new Aluno("Davi", "901", 2, "Ciência da computação");

        list.add(pessoa1);
        list.add(pessoa2);
        list.add(aluno1);
        list.add(aluno2);
    }
}
