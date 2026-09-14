public class Recursividad {

    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE MÉTODOS RECURSIVOS ===");
        
        int n = 5;
        System.out.println("Factorial de " + n + ": " + factorial(n));
        System.out.println("Suma hasta " + n + ": " + sumaRecursiva(n));
        System.out.println("Fibonacci en posición " + n + ": " + fibonacci(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumaRecursiva(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaRecursiva(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}