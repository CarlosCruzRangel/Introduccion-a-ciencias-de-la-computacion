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
    
    // Declaring the variables that will be used in the class.
    private double a;
    private double b;
    private double c;

    
    // A constructor that receives the three coefficients of the equation.
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    /**
     * This function returns the discriminant of a quadratic equation
     * 
     * @return The discriminant of the quadratic equation.
     */
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    
    /**
     * > This function returns true if the discriminant is greater than or equal to zero, and false
     * otherwise
     * 
     * @return The method is returning a boolean value.
     */
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    
    /**
     * It returns true if the discriminant is equal to 0.
     * 
     * @return The method is returning a boolean value.
     */
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    
    /**
     * This function checks if the equation has real roots, and if it does, it prints them
     */
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las raíces son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

    
    /**
     * If the equation has roots, it gets them. If it has a root, it gets it. If it doesn't have a
     * root, it says so
     */
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
