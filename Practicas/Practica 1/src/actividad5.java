import java.util.Scanner; 
public class Actividad5 {
    
    /*
     * Programa que imprime una escalera de asteriscos y una escalera
     * invertida de asteriscos.El programa pedira un numero al usuario 
     * el cual tomara como altura de la escalera
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la piramide: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n ");

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
