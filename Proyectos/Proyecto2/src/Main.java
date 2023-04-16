import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solresol solresol = new Solresol();
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese una palabra en Solresol (do, re, mi, fa, sol, la, si):");
            String entrada;
            try {
                entrada = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error al leer la entrada del usuario.");
                continue;
            }

            try {
                if (solresol.esSolresol(entrada)) {
                    System.out.println("La palabra es válida en Solresol.");
                } else {
                    System.out.println("La palabra no es válida en Solresol.");
                }
            } catch (Exception e) {
                System.out.println("Error al verificar la cadena ingresada.");
            }

            System.out.println("Desea salir? (s/n)");
            String respuesta;
            try {
                respuesta = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error al leer la entrada del usuario.");
                continue;
            }
            if (respuesta.equalsIgnoreCase("s")) {
                salir = true;
            }
        }
    }
}
