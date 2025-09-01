package collections;
import java.util.LinkedList;
import java.util.Scanner;

// U2 = Unidade2
public class Ex2U2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        preencher(list);
        quantNum(list,2);
        sc.close();
    }

    static void preencher(LinkedList<Integer> list){
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

    static void quantNum(LinkedList<Integer> list, int num){
        System.out.println("-- Contador Número --");
        int count = 0;
        for (int i=0; i<list.size(); i++){
            if(list.get(i) == num){
                count++;
            }
        }
        System.out.print("O número " + num + " aparece " + count + "x na lista");
    }
}