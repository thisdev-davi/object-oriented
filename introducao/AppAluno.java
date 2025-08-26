package introducao;
import java.util.Scanner;
public class AppAluno {
    static Scanner sc = new Scanner(System.in);
    static int quant = 0;

    public static void main(String[] args){
        Aluno[] vet = new Aluno[5];

        cadastrar(vet);
        imprimirTodos(vet);
        sc.close();
    }

    static void cadastrar(Aluno[] vet){
        if(quant == vet.length){
            System.out.println("Vetor Cheio!");
        }

        System.out.println("--Cadastro--");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Matricula: ");
        int matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nota1: ");
        double nota1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nota2: ");
        double nota2 = sc.nextInt();
        sc.nextLine();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2);
        vet[quant] = aluno;
        System.out.println(aluno.getNome() + " Cadastrado com sucesso!");
        quant++;
    }

    static void imprimirTodos(Aluno[] vet){
        for(int i=0; i< vet.length; i++){
            if(vet[i] != null){
                System.out.println(vet[i]);
            }
        }
    }
}
