package ProjetoFibonacciRecursivo;

public class Principal {
    public static void main(String[] args) {
        FibonacciRecursivo f = new FibonacciRecursivo();

        for(int i = 1; i<=6;i++){
            System.out.println(f.recursivo(i));
        }
    }
}
