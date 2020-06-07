package ProjetoFibonacciRecursivo;
/* Sequência de Fibonacci (0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...) */

//Sem Recursividade
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;
        int n3 = 0;
        System.out.println("Sequência com 20 números:" );
        for (int i = 0; i < 19; i++) {
            System.out.print(n3 + ", ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3+", ...");
    }
}
