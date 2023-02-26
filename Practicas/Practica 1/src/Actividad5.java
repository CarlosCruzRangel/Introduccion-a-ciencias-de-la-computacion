import java.util.Scanner;

/**
 * Actividad 5 de la practica 1 de ICC.
 * 
 * Programa que imprime una escalera de asteriscos y una escalera
 * invertida de asteriscos.El programa pedira un numero al usuario
 * el cual tomara como altura de la escalera.
 * 
 * @author JAVATAR
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 26 de Febrero 2022
 * @version v1.0
 */

public class Actividad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la piramide: ");
        int altura2 = scanner.nextInt();

        System.out.println("\nEscalera:");
        escalera(altura2);

        System.out.println("\nEscalera Invertida:");
        escaleraInvertida(altura2);

    }  

    /**
     * Toma un número entero como argumento e imprime una escalera 
     * de asteriscos de la misma altura
     * 
     * @param altura2 The height of the staircase.
     */
    public static void escalera(int altura2) {
        String escalon = "";
        for (int i = 0; i < altura2; i++) {
            escalon += "*";
            System.out.println(escalon);
        }
    }
    
    
    /**
     * Toma un número entero como argumento e imprime una escalera
     * invertida de asteriscos de la misma altura
     * 
     * @param altura2 The height of the inverted staircase.
     */
    public static void escaleraInvertida(int altura2) {
        String escalon = "";
        for (int i = 0; i < altura2; i++) {
            escalon += "*";
        }
        for (int i = altura2; i > 0; i--) {
            System.out.println(escalon.substring(0, i));
        }
    }

}
