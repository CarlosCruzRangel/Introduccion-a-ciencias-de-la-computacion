/**
 * Actividad 2 de la práctica 1 de ICC.
 * 
 * Programa donde se declara y asignan variables necesarias
 * para representar las expresiones dadas en el main usando
 * operadores definidos en java,se imprime el valor de las
 * variables x, y, z, w, v y los resultados de cada operacion.
 *
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 26 de Febrero 2022
 * @version v1.0
 */

public class Actividad2 {

    public static void main(String[] args) {
        int y = 2;

        double a = (y * y + 1);
        double b = (y * y * y); // y cubica
        double c = (y * y); // y cuadra

        double x = (b * (y / a));

        double d = (x * x); // Cuadrado de X
        double e = (c + (d / y)); // dividendo en z = 9.12

        double z = x * ((x + 30) / e);

        boolean w = (((true && false) || true) || true);
        boolean v = ((((false || w) && w) || false) || (!false));

        System.out.println("Valor de y: " + y);
        System.out.println("Valor de x: " + x);

        System.out.println("Valor de z: " + z);
        System.out.println("Valor de w: " + w);
        System.out.println("Valor de v: " + v);
    }
}
