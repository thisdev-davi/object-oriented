package trabalho;
import java.util.Scanner;
import trabalho.Pagina;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaPaginas stack = new PilhaPaginas();

        int escolha;
        do {
            System.out.print("\n-- Menu --" +
                    "\n1- Acessar nova página" +
                    "\n>> ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    novaPagina(stack);
                    break;
                case 2:
                    historico(stack);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    static void novaPagina(PilhaPaginas stack){
        System.out.println("\n-- Acessar Nova Pagina --");
        System.out.print("Url: ");
        String url =  sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        stack.push(new Pagina(url,titulo));
    }

    static void historico(PilhaPaginas stack) {
        PilhaPaginas aux = new PilhaPaginas();
        System.out.println("\n-- Histórico --");
        while(!stack.isEmpty()){
            System.out.println(stack.top());
            aux.push(stack.pop());

        }

        while(!aux.isEmpty()){
            stack.push(aux.pop());
        }
    }
}
