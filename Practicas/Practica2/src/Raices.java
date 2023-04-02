import java.util.Scanner;

/**
 * It calculates the roots of a quadratic equation
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Raices {

    // Declaring the variables that will be used in the class.
    private double a;
    private double b;
    private double c;
    public double discriminante;

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

        discriminante = Math.pow(b, 2) - 4 * a * c;

        return discriminante;
    }

    /**
     * > This function returns true if the discriminant is greater than or equal to
     * zero, and false
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
     * This function checks if the equation has real roots, and if it does, it
     * prints them
     */
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("\033[32m" + "Las raíces son: x1 = " + x1 + ", x2 = " + x2 + "\033[0m");
        } else {
            System.out.println("\033[31m" + "La ecuación no tiene solución real." + "\033[0m");
        }
    }

    /**
     * If the equation has roots, it gets them. If it has a root, it gets it. If it
     * doesn't have a
     * root, it says so
     */
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("\033[32m" + "La ecuación tiene una única solución: x = " + x + "\033[0m");
        } else {
            System.out.println("\033[31m" + "La ecuación no tiene solución real." + "\033[0m");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0, b = 0, c = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("\n \n");
                System.out.print("\033[35m" + "Ingrese el coeficiente a: " + "\033[0m");
                a = Double.parseDouble(input.nextLine());
                System.out.print("\033[35m" + "Ingrese el coeficiente b: " + "\033[0m");
                b = Double.parseDouble(input.nextLine());
                System.out.print("\033[35m" + "Ingrese el coeficiente c: " + "\033[0m");
                c = Double.parseDouble(input.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar valores numéricos válidos. Intente de nuevo.\n");
            }
        }

        Raices ecuacion = new Raices(a, b, c);

        boolean exit = false;

        while (!exit) {
            
            // Printing the menu of options.
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("--------------------");
            System.out.println("1 - Obtener discriminante");
            System.out.println("2 - Verificar si tiene raíces");
            System.out.println("3 - Verificar si tiene una única raíz");
            System.out.println("4 - Calcular las raíces (si existen)");
            System.out.println("5 - Salir");
            System.out.print("\nIngrese una opción: ");

            String opcion = input.nextLine();

            switch (opcion) {

                // Printing the discriminant of the equation.
                case "1":
                    System.out.println("\033[32m" + "\nEl discriminante es: " + ecuacion.getDiscriminante() + "\033[0m");
                    break;

                // Printing the result of the method tieneRaices()
                case "2":
                    System.out.println("\033[32m" + "\n¿Tiene raíces? " + ecuacion.tieneRaices() + "\033[0m");
                    break;

                // Printing the result of the method tieneRaiz()
                case "3":
                    System.out.println("\033[32m" + "\n¿Tiene una única raíz? " + ecuacion.tieneRaiz() + "\033[0m");
                    break;

                // Calling the method calcular() and printing the result.
                case "4":
                    System.out.println();
                    ecuacion.calcular();
                    break;

                // Exiting the program.
                case "5":
                    exit = true;
                    break;

                /* A default case for the switch statement. If the user enters a value that is not 1,
                2, 3, 4 or 5, it will print the message "Opción inválida. Intente de nuevo." and
                then break the switch statement. */
                default:
                    System.out.println("\033[31m" + "\nOpción inválida. Intente de nuevo.\n" + "\033[0m");
                    break;
            }
        }

        input.close();
    }
}