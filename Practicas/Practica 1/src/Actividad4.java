import java.util.Scanner;

/**
 * Actividad 4 de la practica 1 de ICC.
 * 
 * Programa que imprime todos los numeros pares entre dos numeros
 * que se le piden al usuario.Validara si el primer numeri que se
 * escribe es menor o igual a segundo numero,se imprimen los valores
 * y se acaba el programa,caso contrario manda un mensaje al usuario
 * y le dejara nuevamente volver a intentar.
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez
 * 
 * @since 26 de Febrero 2022
 * @version v1.0
 */

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primerNumero, segundoNumero;

        do {
            System.out.print("Escribe el primer numero: ");
            primerNumero = sc.nextInt();
            System.out.print("Escribe el segundo numero: ");
            segundoNumero = sc.nextInt();

            if (primerNumero > segundoNumero) {
                System.out.println("El primer valor es más grande que el segundo, intenta de nuevo.");
            }
        } while (primerNumero > segundoNumero);

        System.out.print("Los primeros numeros pares son: ");
        for (int i = primerNumero; i <= segundoNumero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nSe acabo el programa.");
    }
}
