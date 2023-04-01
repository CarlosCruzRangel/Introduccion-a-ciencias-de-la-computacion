import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Persona is a class that represents a person, with a name, age, DNI, sex,
 * weight and height
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Persona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Persona persona1 = null;
        Persona persona2 = null;
        Persona persona3 = null;

        // Mientras no se seleccione la opción de salir, mostrar el menú
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. Introducir datos de la primera persona");
            System.out.println("2. Introducir datos de la segunda persona");
            System.out.println("3. Mostrar resultados");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Controlar que el usuario introduzca un número válido
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes introducir un número");
                sc.nextLine(); // Consumir la entrada errónea
                continue; // Volver a mostrar el menú
            }

            switch (opcion) {
                case 1:
                    // Pide por teclado los datos de la primera persona
                    System.out.println("Introduce los datos de la primera persona:");
                    System.out.print("Nombre: ");
                    String nombre1 = sc.nextLine();
                    System.out.print("Edad: ");

                    // Controlar que el usuario introduzca un número válido
                    int edad1 = 0;
                    try {
                        edad1 = sc.nextInt();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }

                    System.out.print("Sexo (H/M): ");
                    char sexo1 = sc.nextLine().charAt(0);
                    System.out.print("Peso: ");
                    double peso1 = 0;

                    // Controlar que el usuario introduzca un número válido
                    try {
                        peso1 = sc.nextDouble();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }

                    System.out.print("Altura: ");
                    double altura1 = 0;

                    // Controlar que el usuario introduzca un número válido
                    try {
                        altura1 = sc.nextDouble();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }

                    // Crea la primera persona con los datos introducidos
                    persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);
                    System.out.println("Datos de la primera persona introducidos correctamente");
                    System.out.println("Los datos de "+ nombre1  +" son: "+ persona1);
                    break;

                case 2:
                    // Pide por teclado los datos de la segunda persona
                    System.out.println("Introduce los datos de la segunda persona:");
                    System.out.print("Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Edad: ");

                    // Controlar que el usuario introduzca un número válido
                    int edad2 = 0;
                    try {
                        edad2 = sc.nextInt();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }
                    System.out.print("Sexo (H/M): ");
                    char sexo2 = sc.nextLine().charAt(0);
                    System.out.print("Peso: ");
                    double peso2 = 0;

                    // Controlar que el usuario introduzca un número válido
                    try {
                        peso2 = sc.nextDouble();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }

                    System.out.print("Altura: ");
                    double altura2 = 0;

                    // Controlar que el usuario introduzca un número válido
                    try {
                        altura2 = sc.nextDouble();
                        sc.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debes introducir un número");
                        sc.nextLine(); // Consumir la entrada errónea
                        continue; // Volver a mostrar el menú
                    }

                    // Crea la segunda persona con los datos introducidos
                    persona2 = new Persona(nombre2, edad2, sexo2, peso2, altura2);
                    System.out.println("Datos de la segunda persona introducidos correctamente");
                    break;

                case 3:
                    // Muestra los resultados de ambas personas
                    System.out.println("RESULTADOS:");
                    System.out.println("Persona 1: " + persona1);
                    System.out.println("Persona 2: " + persona2);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida guapo, vuelve a intentarlo");
                    break;
            }
        }
    }

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public static final char sexo_por_defecto = 'H';
    private static final int peso_ideal_bajo = -1;
    private static final int peso_ideal_normal = 0;
    private static final int peso_ideal_alto = 1;

    //Persona
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    public Persona() {
        this("", 0, sexo_por_defecto, 0, 0);
        generarDNI();
    }

    public Persona(String nombre, int edad, double peso) {
        this(nombre, edad, sexo_por_defecto, peso, 0);
        generarDNI();
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    private char comprobarSexo(char sexo) {
        return sexo == 'H' || sexo == 'M' ? sexo : sexo_por_defecto;
    }

    private int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return peso_ideal_bajo;
        } else if (imc >= 20 && imc <= 25) {
            return peso_ideal_normal;
        } else {
            return peso_ideal_alto;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void generarDNI() {
        final int NUMERO_DNI = 100000000;
        Random rand = new Random();
        int numeroDNI = rand.nextInt(NUMERO_DNI);
        dni = String.valueOf(numeroDNI) + "-" + Character.toString((char) (numeroDNI % 23 + 65));
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + dni + "\nSexo: " + sexo + "\nPeso: " + peso
                + "\nAltura: " + altura;
    }

    public void mostrarMensajePeso() {
        int resultadoIMC = calcularIMC();
        switch (resultadoIMC) {
            case peso_ideal_bajo:
                System.out.println("Estas debajo de tu peso");
                break;
            case peso_ideal_normal:
                System.out.println("Increible, estas en tu peso ideal");
                break;
            case peso_ideal_alto:
                System.out.println("Estas por encima de tu peso ideal");
                break;
        }
    }

}