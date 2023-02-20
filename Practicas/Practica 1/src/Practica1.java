import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Practica 1: Variables, Tipos de datos primitivos, Controladores de Flujo y
 * Scanner.
 * 
 * Introduccion a Ciencias de la Computación
 * U.N.A.M.
 * 
 * @author Carlos Cruz Rangel -312285823
 * @author Toprak Memik Hernández - 419002354
 * 
 * @version 1.0
 * 
 * @since 23 de Febrero de 2023.
 */

public class Practica1 {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        System.out.println("\n");
        System.out.println("Carlos Cruz Rangel");
        System.out.println("Toprak Memik Hernández");
        System.out.println("PRESENTAN:");
        System.out.println("\n");
        System.out.println("8888888b.                           888    d8b                         d888   ");
        System.out.println("888   Y88b                          888    Y8P                        d8888   ");
        System.out.println("888    888                          888                                 888   ");
        System.out.println("888   d88P 888d888 8888b.   .d8888b 888888 888  .d8888b  8888b.         888   ");
        System.out.println("8888888P   888P        88b d88P     888    888 d88P          88b        888   ");
        System.out.println("888        888    .d888888 888      888    888 888      .d888888        888   ");
        System.out.println("888        888    888  888 Y88b.    Y88b.  888 Y88b.    888  888        888   ");
        System.out.println("888        888    \"Y888888  \"Y8888P  \"Y888 888  \"Y8888P \"Y888888      8888888 ");
       
        while (!salir) {
            
            System.out.println("\n");
            System.out.println("_  _ ____ _  _ _  _ ");
            System.out.println("|\\/| |___ |\\ | |  | ");
            System.out.println("|  | |___ | \\| |__| ");
            System.out.println("\n");
            
            System.out.println("Hola querido ayudante: \n Selecciona que Actividad quieres ver en funcionamiento" );

            System.out.println("1. Actividad 1");
            System.out.println("2. Actividad 2");
            System.out.println("3. Actividad 3");
            System.out.println("4. Actividad 4");
            System.out.println("5. Actividad 5");
            System.out.println("6. Salir");
 

            try {
 
                System.out.println("Escribe el numero de tu seleccion y pulsa enter");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;

                    
                    /**
                    * The function takes in 5 integers, and then performs a series of operations on them, and then
                    * prints out the results of those operations
                    */
                    case 3:
                    
                            System.out.println("\n Has seleccionado la opcion 3 \n Aqui encontraras la Actividad 3:");
                            int valor1 = 34;        
                            int valor2 = 2;        
                            int valor3 = 4;        
                            int valor4 = 9;        
                            int valor5 = 90;        

                            
                            int misterioso1 = (++valor1)-(--valor2)+(valor2++)+(++valor1);
                            
                            int misterioso2 = (valor4++)+(++valor4)+(valor5++)-(--valor5);

                            System.out.println(misterioso1);
                            System.out.println(misterioso2);

                        break;

                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        break;
                        
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        break;
            
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número, guapo");
                sn.next();
            }
        }
 
    }

}
