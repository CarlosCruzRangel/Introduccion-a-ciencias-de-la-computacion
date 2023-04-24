import java.util.Scanner;

/**
 * This class prompts the user to input two matrices of the same size, subtracts them, and outputs
 * the resulting matrix.
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 *  
 */
public class RestaMatrices {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);
        
        int n = 0;
        boolean inputValid = false; //Verification for exceptions
        
        
        System.out.println("\n BIENVENIDO \n");
        
        /* In this block of code the user is asked to enter the size of the matrix,
        also an exception is added to catch any error on the part of the user */
        do {
            try {
                System.out.print("\u001B[33m" + "Ingrese el tamaño de las matrices, recuerda que son cuadradas, asi que \n solo basta con que ingreses el valor de n: " + "\033[0m");
                n = entradaUser.nextInt();
                inputValid = true;
            } catch (Exception e) {
                System.out.println("\n \u001B[31;1;4m" + "Error: entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                entradaUser.nextLine();
            }
        } while (!inputValid);


        int[][] matrizA = new int[n][n]; //Matrix A for substraction with B
        int[][] matrizB = new int[n][n]; //Matrix B for substraction with A
        int[][] matrizC = new int[n][n]; //Matrix C for results

        /* In this block of code the user is asked to enter the data of the matrix A,
        in addition an exception is added to catch any error on the part of the user */
        System.out.println("\n \u001B[34m" + "Ingresa los valores de la matriz A:" + "\033[0m");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    matrizA[i][j] = entradaUser.nextInt();
                } catch (Exception e) {
                    System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                    entradaUser.nextLine(); 
                    j--; // repetir intento
                }
            }
        }
        
        /* In this block of code the user is asked to enter the data of the matrix A,
        in addition an exception is added to catch any error on the part of the user */
        System.out.println("\n \u001B[34m" + "Ingresa los valores de la matriz B:" + "\033[0m");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    matrizB[i][j] = entradaUser.nextInt();
                } catch (Exception e) {
                    System.out.println("\n \u001B[31;1;4m" + "Error, entrada no válida. Intente nuevamente." + "\033[0m"+ "\n");
                    entradaUser.nextLine();
                    j--; // repetir intento
                }
            }
        }

        // In this block of code, the matrices A and B are subtracted.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        // The following code block shows the result in a beautiful way to the user
        System.out.println("\u001B[32;1;4m");
        
        System.out.println("La matriz resultante C es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\033[0m"+ "\n");
        
    }
}
