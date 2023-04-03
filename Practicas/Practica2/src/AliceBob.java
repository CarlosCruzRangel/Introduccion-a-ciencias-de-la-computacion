import java.util.Scanner;

/**
 * It reads the number of test cases, then for each test case it reads the length of the string and the
 * string itself, then it simulates the game between Alice and Bob and finally it checks if the strings
 * A and B are equal at the end of the game
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class AliceBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de casos
        System.out.print("Ingrese el número de casos: ");
        int T = scanner.nextInt();
        scanner.nextLine(); // leer el salto de línea después del número de casos

        for (int i = 0; i < T; i++) {
            // Pedir la longitud de la cadena y la cadena S
            System.out.print("Ingrese la longitud de la cadena S: ");
            int N = scanner.nextInt();
            scanner.nextLine(); // leer el salto de línea después del número de caracteres
            System.out.print("Ingrese la cadena S: ");
            String S = scanner.nextLine().toLowerCase();

            // Inicializar las cadenas A y B como cadenas vacías
            String A = "";
            String B = "";

            // Verificar si la longitud de la cadena S es impar
            if (N % 2 != 0) {
                System.out.println("La cadena es impar");
                continue;
            }

            // Simular el juego entre Alice y Bob
            for (int j = 0; j < N; j++) {
                char c = S.charAt(j);

                if (A.length() < B.length()) {
                    A += c;
                } else if (B.length() < A.length()) {
                    B += c;
                } else {
                    A += c;
                }
            }

            // Verificar si las cadenas A y B son iguales al final del juego
            if (A.equals(B)) {
                System.out.println("SI,las cadenas A y B son iguales");
            } else {
                System.out.println("NO,las cadenas A y B no son iguales");
            }
        }

        scanner.close();
    }
}