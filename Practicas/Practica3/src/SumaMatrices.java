import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = 0;
        
        // Solicitar al usuario el tamaño de las matrices
        while (true) {
            try {
                System.out.print("Ingrese el tamaño de las matrices: ");
                n = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                input.nextLine();
            }
        }
        
        // Inicializar las matrices
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizC = new int[n][n];
        
        // Solicitar al usuario la entrada de las matrices A y B
        System.out.println("Ingrese la matriz A:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                while (true) {
                    try {
                        matrizA[i][j] = input.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Por favor, ingrese un número entero válido.");
                        input.nextLine();
                    }
                }
            }
        }
        
        System.out.println("Ingrese la matriz B:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                while (true) {
                    try {
                        matrizB[i][j] = input.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Por favor, ingrese un número entero válido.");
                        input.nextLine();
                    }
                }
            }
        }
        
        // Sumar las matrices A y B y almacenar el resultado en la matriz C
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        // Mostrar la matriz resultante C
        System.out.println("La matriz resultante C es:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
