import java.util.Scanner;

/**
 * This Java class takes user input for the size and elements of a matrix, as well as a scalar value,
 * and calculates the product of the matrix and scalar.
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 26 abril 2023, UNAM
 * @version v1.0
 *  
 */

public class ProductoEscalar {

    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n BIENVENIDO \n");
        /* In this block of code the user is asked to enter the size of the matrix,
        also an exception is added to catch any error on the part of the user */
        while (true) {
            try {
                System.out.print("\u001B[33m" + "Ingrese el tamaño de las matrices, recuerda que son cuadradas, asi que \n solo basta con que ingreses el valor de n: " + "\033[0m");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                sc.nextLine();
            }
        }
        
        double[][] matrizA = new double[n][n];
        
        /* In this block of code the user is asked to enter the data of the matrix A,
        in addition an exception is added to catch any error on the part of the user */
        System.out.println("\n \u001B[34m" + "Ingrese los elementos de la matriz A: "+"\n \u001B[34m");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    try {
                        matrizA[i][j] = sc.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                        sc.next();
                    }
                }
            }
        }

        // In this block of code the user is asked to enter the data of K,
        System.out.println("\n \u001B[34m" + "Ingrese el número real k:"+ "\033[0m");
        double k = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                k = sc.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("\n \u001B[31;1;4m" + "Error: Debe ingresar un número real. Intente nuevamente." + "\033[0m"+ "\n");
                sc.nextLine(); // Limpiar el búfer de entrada
            }
        }


        // Product of Matrix A*k
        double[][] resultado = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] * k;
            }
        }

        // The following code block shows the result in a beautiful way to the user
        System.out.println("\u001B[32;1m");
        
        System.out.println("El producto de la matriz A y el número real k es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\033[0m"+ "\n");

    }
}
