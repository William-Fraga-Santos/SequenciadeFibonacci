package ProjetoFibonacciRecursivo;

class FibonacciRecursivo {

    public  int recursivo(int f) {
        if (f < 2){
        return f;

        } else {
            return recursivo(f-1) + recursivo(f-2);
        }
    }
}