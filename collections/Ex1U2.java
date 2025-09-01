package collections;
import java.util.ArrayList;
import java.util.Scanner;

// U2 = Unidade2
public class Ex1U2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        preencher(list);
        removerPar(list);
        sc.close();
    }

    static void preencher(ArrayList<Integer> list){
        System.out.println("-- Preencher Lista --");
        int num;
        System.out.print("Digite um num (0 - sair): ");
        num = sc.nextInt();

        while(num != 0) {
            list.add(num);
            System.out.print("Digite um num (0 - sair): ");
            num = sc.nextInt();
        }
        System.out.println(list);
    }

    static void removerPar(ArrayList<Integer> list){
        System.out.println("-- Remove Par --");
        list.removeIf(num -> num % 2==0);
        System.out.println(list);
    }
}