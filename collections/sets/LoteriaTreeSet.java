package poo.collections.sets;
import  java.util.TreeSet;
import java.util.ArrayList;

public class LoteriaTreeSet {
        public static void main(String[] args) {
            TreeSet<Integer> numeros = sorteiaNumeros(10);
            System.out.print("Sorteio de 10 num: | ");
            imprime (numeros);

            System.out.print("Sorteio de 20 num: | ");
            numeros = sorteiaNumeros(20);

            Object[] vetor = new Object[50];
            vetor = numeros.toArray();
            System.out.println("Posicao [5]: " + vetor[5]);

            ArrayList<Integer> array = new ArrayList<Integer>(numeros);
            System.out.println("Posicao [5]: " + array.get(5));

            imprime(numeros);
        }

        public static TreeSet<Integer> sorteiaNumeros(int quant) {
            TreeSet<Integer> numeros = new TreeSet<Integer>();
            int num;

            while(numeros.size() < quant) {
                num = (int) (100 * Math.random()+1);
                numeros.add(num);
            }
            return numeros;
        }

        public static void imprime (TreeSet<Integer> numeros) {
            for (int i : numeros){
                System.out.print(i+"  ");
                System.out.print("| ");
            }
            System.out.println();
        }
}
