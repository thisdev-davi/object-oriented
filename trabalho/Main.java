package trabalho;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaPaginas stack = new PilhaPaginas();

        int escolha;
        do {
            System.out.print("\n-- Menu --" +
                    "\n1- Acessar nova página"
                    + "\n2- Voltar para página Anterior"
                    + "\n3- Ver página atual"
                    + "\n4- Exibir histórico de navegação"
                    + "\n5- Sair" +
                    "\n>> ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    novaPagina(stack);
                    break;
                case 2:
                    voltarPagina(stack);
                    break;
                case 3:
                	paginaAtual(stack);
                	break;
                case 4:
                	historico(stack);
                    break;
                case 5:
                	System.out.println("Até logo :)");
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 5);
    }

    static void novaPagina(PilhaPaginas stack){
        System.out.println("\n-- Acessar Nova Página --");
        
        String url = "";
        String titulo = "";
        while(url.isEmpty()) {
        	System.out.print("Url: ");
            url =  sc.nextLine();	
        }
        while(titulo.isEmpty()) {
        	System.out.print("Titulo: ");
            titulo = sc.nextLine();	
        }
        stack.push(new Pagina(url,titulo));
    }
    
    static void voltarPagina(PilhaPaginas stack) {
    	if((stack.isEmpty()) || stack.size()==1) {
    		System.out.println("Nenhuma Página Disponível!");
    		return;
    	}
    	stack.pop();
    	paginaAtual(stack);
    }

    static void paginaAtual(PilhaPaginas stack) {
    	if(stack.isEmpty()) {
    		System.out.println("Nenhuma Pagina Acessada!");
    		return;
    	}
    	System.out.println("\n-- Página Atual --");
    	System.out.println(stack.top());
    }
    
    static void historico(PilhaPaginas stack) {
    	if(stack.isEmpty()) {
    		System.out.println("Nenhuma Pagina Acessada!");
    		return;
    	}
    	
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
