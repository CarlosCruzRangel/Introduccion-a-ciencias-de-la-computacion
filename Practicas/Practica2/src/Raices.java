/**
 * It calculates the roots of a quadratic equation
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprac Memik Hernandez 
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Raices {
    private double a;
    private double b;
    private double c;

    // Constructor que recibe los tres coeficientes de la ecuación
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para obtener el discriminante
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Método para saber si la ecuación tiene dos raíces
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    // Método para saber si la ecuación tiene una única raíz
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    // Método para obtener las raíces de la ecuación
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las raíces son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

    // Método que muestra por consola las posibles soluciones de la ecuación
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única solución: x = " + x);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
