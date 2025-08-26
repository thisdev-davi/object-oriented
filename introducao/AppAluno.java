package introducao;
import java.util.Scanner;
public class AppAluno {
    static Scanner sc = new Scanner(System.in);
    static Aluno[] vet = new Aluno[5];

    public static void main(String[] args){
        cadastrar();
        imprimirTodos();
        sc.close();
    }

    static void cadastrar(){
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
        for(int i=0; i< vet.length; i++){
            if(vet[i] == null){
                vet[i] = aluno;
                return;
            }
        }
        System.out.println("Vetor Cheio");
    }

    static void imprimirTodos(){
        for(int i=0; i< vet.length; i++){
            if(vet[i] != null){
                System.out.println(vet[i]);
            }
        }
    }
}
