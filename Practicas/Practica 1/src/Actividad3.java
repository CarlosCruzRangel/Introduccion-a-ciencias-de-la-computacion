/**
 * Actividad 3 de la práctica 1 de ICC.
 *
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez
 * 
 * @since 26 de Febrero 2022
 * @version v1.0
 */

public class Actividad3 {

    public static void main(String[] args) {

        int valor1 = 34;
        int valor2 = 2;
        int valor3 = 4;
        int valor4 = 9;
        int valor5 = 90;

        int misterioso1 = (++valor1) - (--valor2) + (valor2++) + (++valor1);

        int misterioso2 = (valor4++) + (++valor4) + (valor5++) - (--valor5);

        System.out.println(misterioso1);
        System.out.println(misterioso2);
    }
}
