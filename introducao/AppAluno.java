package introducao;
import java.util.Scanner;
public class AppAluno {
    static Scanner sc = new Scanner(System.in);
    static int quant = 0;

    public static void main(String[] args){
        Aluno[] vet = new Aluno[5];
        int opc;
        
        do {
        	System.out.print("\n| MENU |\n"
        			+ "1| Cadastrar\n" 
        			+ "2| Imprimir um aluno\n"
        			+ "3| Imprimir todos os alunos\n"
        			+ "4| Alterar nota1\n"
        			+ "5| Alterar nota2\n"
        			+ "6| Sair\n"
        			+ ">> ");
        	opc = sc.nextInt();
        	sc.nextLine();
        	
        	switch(opc) {
        		case 1:
        			cadastrar(vet);
        			break;
        		case 2:
        			imprimirAluno(vet);
        			break;
        		case 3:
        			imprimirTodos(vet);
        			break;
        		case 4:
        			alterarNota1(vet);
        			break;
        		case 5:
        			alterarNota2(vet);
        			break;
        		case 6:
        			System.out.println("Programa Finalizado.");
        			break;
        		default:
        			System.out.println("Opção Inválida!");
        	}
        	
        } while(opc != 6);
        sc.close();
    }
    
    static int pesquisa(Aluno[] vet, String nome){
    	for(int i=0; i<quant; i++) {
    		if(vet[i].getNome().equalsIgnoreCase(nome)) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    static void cadastrar(Aluno[] vet){
        if(quant == vet.length){
            System.out.println("Vetor Cheio!");
        }

        System.out.println("\n-- Cadastro --");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        int pos = pesquisa(vet, nome);
        
        if(pos != -1) {
        	System.out.println("Aluno já cadastrado!");
        	return;
        }
        
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
        System.out.println(aluno.getNome() + " Cadastrado com sucesso.");
        quant++;
    }

    static void imprimirAluno(Aluno[] vet) {
    	System.out.println("\n-- Imprimir Aluno --");
    	System.out.print("Nome do Aluno: ");
    	String nome = sc.next();
    	
    	int pos = pesquisa(vet, nome);
    	if(pos != -1) {
    		System.out.println("Nome: "+ vet[pos].getNome() + ", Media: " + vet[pos].getMedia());
    		return;
    	}
    	
    	System.out.println("Aluno não Encontrado!");
    }
    
    static void imprimirTodos(Aluno[] vet){
        for(int i=0; i< quant; i++){
            if(vet[i] != null){
                System.out.println(vet[i]);
            }
        }
    }
    
    static void alterarNota1(Aluno[] vet){
    	System.out.println("\n-- Alterar Nota1 --");
    	System.out.print("Nome do Aluno: ");
    	String nome = sc.next();
    	
    	int pos = pesquisa(vet, nome);
    	if(pos != -1) {
    		System.out.println("Nome: "+ vet[pos].getNome() + ", Nota1: " + vet[pos].getNota1());
    		
    		System.out.print("Nova nota1: ");
        	double nova_nota = sc.nextDouble();
        	vet[pos].setNota1(nova_nota);
    		return;
    	}
    	System.out.println("Aluno não Encontrado!");
    }
    
    static void alterarNota2(Aluno[] vet){
    	System.out.println("\n-- Alterar Nota2 --");
    	System.out.print("Nome do Aluno: ");
    	String nome = sc.next();
    	
    	int pos = pesquisa(vet, nome);
    	if(pos != -1) {
    		System.out.println("Nome: "+ vet[pos].getNome() + ", Nota2: " + vet[pos].getNota2());
    		
    		System.out.print("Nova nota2: ");
        	double nova_nota = sc.nextDouble();
        	vet[pos].setNota2(nova_nota);
    		return;
    	}
    	System.out.println("Aluno não Encontrado!");
    }
}
