import java.util.Scanner;
/**
 * This class prompts the user to input two matrices of the same size, product them, and outputs
 * the resulting matrix.
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 26 abril 2023, UNAM
 * @version v1.0
 *  
 */
public class ProductoMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        boolean inputValid = false; //Verification for exceptions
        
        
        System.out.println("\n BIENVENIDO \n");
        
        /* In this block of code the user is asked to enter the size of the matrix,
        also an exception is added to catch any error on the part of the user */
        do {
            try {
                System.out.print("\u001B[33m" + "Ingrese el tamaño de las matrices, recuerda que son cuadradas, asi que \n solo basta con que ingreses el valor de n: " + "\033[0m");
                n = sc.nextInt();
                inputValid = true;
            } catch (Exception e) {
                System.out.println("\n \u001B[31;1;4m" + "Error: entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                sc.nextLine();
            }
        } while (!inputValid);

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];

        /* In this block of code the user is asked to enter the data of the matrix A,
        in addition an exception is added to catch any error on the part of the user */
        System.out.println("\n \u001B[34m" + "Ingresa los valores de la matriz A:" + "\033[0m");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    matrizA[i][j] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                    sc.nextLine(); 
                    j--; // repetir intento
                }
            }
        }

        /* In this block of code the user is asked to enter the data of the matrix B,
        in addition an exception is added to catch any error on the part of the user */
        System.out.println("\n \u001B[34m" + "Ingresa los valores de la matriz B:" + "\033[0m");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    matrizB[i][j] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                    sc.nextLine(); 
                    j--; // repetir intento
                }
            }
        }

        //In this block of code, the product between matrix A and matrix B is made.
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // The following code block shows the result in a beautiful way to the user
        System.out.println("\u001B[32;1m");

        System.out.println("El producto de las matrices A y B es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\033[0m"+ "\n");
    
    }
}