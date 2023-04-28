import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Idioma solresol = new Solresol();

        System.out.println("\n BIENVENIDO AL PROGRAMA SOLRESOL \n");

        boolean salir = false;

        while (!salir) {
            System.out.println("\u001B[1m" + "\nSeleccione una opción:" + "\u001B[0m");
            System.out.println("1. Verificar sintaxis de una cadena");
            System.out.println("2. Obtener antónimo de una palabra");
            System.out.println("3. Obtener notación abreviada de una palabra");
            System.out.println("4. Obtener notación completa de una palabra");
            System.out.println("5. Salir");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {

                    case 1:
                        System.out.print("\nIntroduzca la cadena a verificar:");
                        String cadena = scanner.nextLine();

                        if (solresol.esSolresol(cadena)) {
                            System.out.println("\u001B[32;1;4m" + "La cadena es sintácticamente correcta en Solresol." + "\u001B[0m");
                        } else {
                            System.out.println("\u001B[31;1m" + "La cadena no es sintácticamente correcta en Solresol." + "\u001B[0m");
                        }
                        break;


                    case 2:
                        System.out.print("\nIntroduzca la palabra de la que quiere obtener su antónimo:");
                        String palabra = scanner.nextLine();
                        if (solresol.esSolresol(palabra)) {
                            String antonimo = solresol.daAntonimo(palabra);
                           
                            if (antonimo == null) {
                                System.out.println("\u001B[31;1m" + "La palabra introducida no tiene antónimo en Solresol." + "\u001B[0m");
                            } else {
                                System.out.println("\u001B[32;1;4m" + "El antónimo de " + palabra + " es " + antonimo + "."  + "\u001B[0m");
                            }
                        
                        } else {
                            System.out.println("\u001B[31;1m" + "No se puede obtener el antonimo de lo que ingresaste por que la palabras es no pertenece en Solresol" + "\u001B[0m");
                        }
                        break;


                    case 3:
                        System.out.println("\nIntroduzca la palabra de la que quiere obtener su notación abreviada:");
                        palabra = scanner.nextLine();

                        String notacionAbreviada = solresol.daNotacionAbreviada(palabra);
                        System.out.println("\u001B[32;1;4m" + "La notación abreviada de " + palabra + " es " + notacionAbreviada + "." + "\u001B[0m");

                        if (solresol.esSolresol(notacionAbreviada)) {
                            System.out.println("\u001B[32" + "Y ademas esta cadena si pertenece al lenguaje Solresol"  + "\u001B[0m");
                        } else {
                            System.out.println("\u001B[31;1m" + "y por eso la palabra no es sintácticamente correcta en Solresol." + "\u001B[0m");
                        }
                        
                        break;


                    case 4:
                        System.out.println("\nIntroduzca la notación abreviada de la palabra:");
                        String notacionCompleta = scanner.nextLine();

                        String palabraCompleta = solresol.daNotacionCompleta(notacionCompleta);
                        if (palabraCompleta == null) {
                            System.out.println("\u001B[31m" + "No se puede obtener la notación completa de " + notacionCompleta + "." + "\u001B[0m");
                        } else {
                            System.out.println("\u001B[32;1;4m" + "La notación completa de " + notacionCompleta + " es " + palabraCompleta + "." + "\u001B[0m");
                        }

                        if (solresol.esSolresol(palabraCompleta)) {
                            System.out.println("\u001B[32" + "Y ademas esta cadena si pertenece al lenguaje Solresol" + "\u001B[0m");
                        } else {
                            System.out.println("\u001B[31;1m" + "Y por eso la palabra no es sintácticamente correcta en Solresol." + "\u001B[0m");
                        }

                        break;
                    case 5:
                        salir = true;
                        System.out.println("¡Adio Buapo");
                        break;
                    default:
                        System.out.println("\u001B[35;1;4m" + "Opción inválida. Introduzca un número del 1 al 5." + "\u001B[0m");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Consumir el salto de línea
                System.out.println("\u001B[35;1;4m" + "Debe introducir un número del 1 al 5." + "\u001B[0m");
            }
        }

        scanner.close();
    }
}
