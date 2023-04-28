import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Idioma solresol = new Solresol();
        
        System.out.println("¡Bienvenido al programa de Solresol!");
        System.out.println("====================================");
        
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Verificar sintaxis de una cadena");
            System.out.println("2. Obtener antónimo de una palabra");
            System.out.println("3. Obtener notación abreviada de una palabra");
            System.out.println("4. Obtener notación completa de una palabra");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    System.out.println("\nIntroduzca la cadena a verificar:");
                    String cadena = scanner.nextLine();
                    
                    if (solresol.esSolresol(cadena)) {
                        System.out.println("La cadena es sintácticamente correcta en Solresol.");
                    } else {
                        System.out.println("La cadena no es sintácticamente correcta en Solresol.");
                    }
                    break;
                case 2:
                    System.out.println("\nIntroduzca la palabra de la que quiere obtener su antónimo:");
                    String palabra = scanner.nextLine();
                    
                    String antonimo = solresol.daAntonimo(palabra);
                    if (antonimo == null) {
                        System.out.println("La palabra introducida no tiene antónimo en Solresol.");
                    } else {
                        System.out.println("El antónimo de " + palabra + " es " + antonimo + ".");
                    }
                    break;
                case 3:
                    System.out.println("\nIntroduzca la palabra de la que quiere obtener su notación abreviada:");
                    palabra = scanner.nextLine();
                    
                    String notacionAbreviada = solresol.daNotacionAbreviada(palabra);
                    System.out.println("La notación abreviada de " + palabra + " es " + notacionAbreviada + ".");
                    break;
                case 4:
                    System.out.println("\nIntroduzca la notación abreviada de la palabra:");
                    String notacionCompleta = scanner.nextLine();
                    
                    String palabraCompleta = solresol.daNotacionCompleta(notacionCompleta);
                    if (palabraCompleta == null) {
                        System.out.println("No se puede obtener la notación completa de " + notacionCompleta + ".");
                    } else {
                        System.out.println("La notación completa de " + notacionCompleta + " es " + palabraCompleta + ".");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Gracias por usar el programa de Solresol!");
                    break;
                default:
                    System.out.println("Opción inválida. Introduzca un número del 1 al 5.");
                    break;
            }
        }
        
        scanner.close();
    }
}
