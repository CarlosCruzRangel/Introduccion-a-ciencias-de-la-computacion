import java.util.Random;
import java.util.Scanner;

/**
 * Persona is a class that represents a person, with a name, age, DNI, sex,
 * weight and height
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Persona {

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

    // Persona
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
        } else if (imc > 25) {
            return peso_ideal_alto;
        } else {
            return 0;
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // First Person

        System.out.println("\n Introduce los datos de la primera persona:");

        // Asking the user to input a name, and then it is assigning it to the variable
        // nombre1.
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();

        // Asking the user to input a years, and then it is assigning it to the variable
        // edad1.
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();

        scanner.nextLine();

        // Asking the user to input a sex, and then it is assigning it to the variable
        // sexo1.
        System.out.print("Sexo (M/H): ");
        char sexo1 = scanner.nextLine().charAt(0);

        // Asking the user to input a weight, and then it is assigning it to the
        // variable peso1.
        System.out.print("Peso (kg): ");
        double peso1 = scanner.nextDouble();

        // Asking the user to input a height, and then it is assigning it to the
        // variable altura1.
        System.out.print("Altura (m): ");
        double altura1 = scanner.nextDouble();

        // Creating a new object of the class Persona, and it is assigning it to the
        // variable persona1.
        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);

        scanner.nextLine();

        // Second Person

        System.out.println("\n Introduce los datos de la segunda persona:");
        // Asking the user to input a name, and then it is assigning it to the variable
        // nombre1.

        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();

        // Asking the user to input a years, and then it is assigning it to the variable
        // edad1.
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();

        scanner.nextLine();

        // Asking the user to input a sex, and then it is assigning it to the variable
        // sexo1.
        System.out.print("Sexo (M/H): ");
        char sexo2 = scanner.nextLine().charAt(0);

        // Creating a new object of the class Persona, and it is assigning it to the
        // variable persona1.
        Persona persona2 = new Persona(nombre2, edad2, sexo2, 0, 0);

        // Third Person

        String nombre3 = "Persona Por Defecto";
        int edad3 = 0;
        double peso3 = 0;
        double altura3 = 0;
        Persona persona3 = new Persona();
        persona3.setNombre(nombre3);
        persona3.setEdad(edad3);
        persona3.setPeso(peso3);
        persona3.setAltura(altura3);

        // Information to print
        System.out.println("\n===== Información de las personas =====");

        // Printing the information of the first person.

        System.out.println("\033[31m");
        System.out.println("1. " + persona1.toString());
        persona1.mostrarMensajePeso();
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad() + "\n");

        // Printing the information of the second person.
        System.out.println("\033[32m");
        System.out.println("2. " + persona2.toString());
        persona2.mostrarMensajePeso();
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad() + "\n");
        System.out.println("\033[0m");

        // Printing the information of the third person.
        System.out.println("\033[33m");
        System.out.println("3. " + persona3.toString());
        persona3.mostrarMensajePeso();
        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad() + "\n");
        System.out.println("\033[0m");

        scanner.close();

    }

}