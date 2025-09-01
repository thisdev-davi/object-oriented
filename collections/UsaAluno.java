package collections;
import introducao.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

public class UsaAluno {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Aluno> list = new ArrayList<Aluno>();
        int opc;

        do {
            System.out.print("\n| MENU |\n"
                    + "1| Cadastrar\n"
                    + "2| Pesquisar matricula\n"
                    + "3| Imprimir todos os alunos\n"
                    + "4| Sair\n"
                    + ">> ");
            opc = sc.nextInt();
            sc.nextLine();

            switch(opc) {
                case 1:
                    cadastrar(list);
                    break;
                case 2:
                    pesquisarMatricula(list);
                    break;
                case 3:
                    imprimirTodos(list);
                    break;
                case 4:
                    System.out.println("Programa Finalizado.");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        } while(opc != 4);
        sc.close();
    }

    static void cadastrar(ArrayList<Aluno> list){
        System.out.println("\n-- Cadastro --");
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
        list.add(aluno);
    }

    static void pesquisarMatricula(ArrayList<Aluno> list){
        System.out.println("\n-- Pesquisar Matricula --");
        if(list.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.print("Matricula: ");
        int matricula = sc.nextInt();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getMatricula() == matricula){
                System.out.println("Aluno Encontrado: " + list.get(i));
                return;
            }
        }
        System.out.println("Matricula não Encontrada!");
    }

    static void imprimirTodos(ArrayList<Aluno> list){
        System.out.println("\n-- Imprimir Aluno --");
        if(list.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getNome());
        }
    }
}