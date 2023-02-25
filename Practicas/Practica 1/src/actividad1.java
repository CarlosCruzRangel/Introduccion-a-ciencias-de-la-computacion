import java.util.Scanner;

/*
 * Programa el cual pedira que ingreses 5 cadenas,
 * el programa indicara si la cadena es un NUMERO,
 * en caso contrario dara un mensaje de que no es
 * un numero
 */
public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Escribe 5 cadenas:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Cadena " + i + ": ");
            cadena = sc.nextLine();
            if (esNumero(cadena)) {
                System.out.println("Esto es un numero");
            } else {
                System.out.println("Esto no es un numero");
            }
        }
    }

    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
