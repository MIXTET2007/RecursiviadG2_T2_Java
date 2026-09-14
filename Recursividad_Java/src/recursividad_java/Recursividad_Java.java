package recursividad_java;
import java.util.Scanner;

public class Recursividad_Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Ejercicio 1: Contar vocales ---
        System.out.println("=== EJERCICIO 1: CONTAR VOCALES ===");
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.println("Número de vocales: " + vocales(texto, 0));

        // --- Ejercicio 2: Entero con mayor suma de dígitos ---
        System.out.println("\n=== EJERCICIO 2: MAYOR SUMA DE DÍGITOS ===");
        System.out.print("¿Cuántos números ingresará?: ");
        int cantidad = scanner.nextInt();

        int mayorNumero = 0;
        int mayorSuma = -1;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el entero positivo " + i + ": ");
            int num = scanner.nextInt();
            int sumaActual = sumaDigitos(num);

            if (sumaActual > mayorSuma) {
                mayorSuma = sumaActual;
                mayorNumero = num;
            }
        }
        System.out.println("El número con la mayor suma de dígitos es: " + mayorNumero + " (Suma: " + mayorSuma + ")");

        // --- Ejercicio 3: Suma de los primeros n números ---
        System.out.println("\n=== EJERCICIO 3: SUMA N NÚMEROS ===");
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        System.out.println("Suma S(" + n + "): " + sumaN(n));
    }

    // Ejercicio 1: Método recursivo para contar vocales recorriendo los índices de la cadena
    public static int vocales(String str, int i) {
        // Caso Base: al llegar al final de la cadena se detienen las llamadas
        if (i >= str.length()) {
            return 0;
        }

        char c = Character.toLowerCase(str.charAt(i));
        int esVocal = 0;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            esVocal = 1;
        }

        // Llamada recursiva avanzando a la siguiente posición
        return esVocal + vocales(str, i + 1);
    }

    // Ejercicio 2: Método recursivo para sumar dígitos
    public static int sumaDigitos(int n) {
        // Caso Base: cuando no quedan dígitos por procesar
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    // Ejercicio 3: Suma S(n) = S(n-1) + n tal como se indica en la presentación
    public static int sumaN(int n) {
        // Caso Base
        if (n <= 0) {
            return 0;
        }
        return sumaN(n - 1) + n;
    }
}