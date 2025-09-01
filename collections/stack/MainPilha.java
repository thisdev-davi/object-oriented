package collections.stack;
import java.util.Scanner;

public class MainPilha {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaInt stack = new PilhaInt();
        preencher(stack);
        if (stack.size() > 0){
        System.out.println("Topo da Pilha: " + stack.top());
        }
        remover(stack);

    }

    static void preencher(PilhaInt stack){
        System.out.println("-- Preencher Lista --");
        int num = -1;
        while(num != 0) {
            System.out.print("Digite um num (0 - sair): ");
            num = sc.nextInt();
            if (num!=0){
                stack.push(num);
            }
            System.out.println(stack.top());
        }
    }

    static void remover(PilhaInt stack){
        System.out.println("-- Remover Lista --");
        if(stack.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }

        String removidos = "";
        while(!stack.isEmpty()){
            removidos += " " + stack.pop();
        }
        System.out.println("Elementos Removidos: " + removidos);
    }
}
