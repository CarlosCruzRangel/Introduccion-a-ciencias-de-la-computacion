import java.util.Random;
import java.util.Scanner;

public class Persona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide por teclado los datos de la primera persona
        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        System.out.print("Sexo (H/M): ");
        char sexo1 = sc.nextLine().charAt(0);
        System.out.print("Peso: ");
        double peso1 = sc.nextDouble();
        System.out.print("Altura: ");
        double altura1 = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea

        // Crea la primera persona con los datos introducidos
        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);

        // Pide por teclado los datos de la segunda persona
        System.out.println("\nIntroduce los datos de la segunda persona:");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Crea la segunda persona con los datos introducidos
        Persona persona2 = new Persona();

        // Crea la tercera persona con los datos por defecto
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(70);
        persona3.setAltura(1.75);

        // Muestra los resultados de las tres personas
        System.out.println("\nResultados:");
        System.out.println(persona1.toString());
        persona1.mostrarMensajePeso();
        persona1.esMayorDeEdad();
        System.out.println();
        System.out.println(persona2.toString());
        persona2.mostrarMensajePeso();
        persona2.esMayorDeEdad();
        System.out.println();
        System.out.println(persona3.toString());
        persona3.mostrarMensajePeso();
        persona3.esMayorDeEdad();

        sc.close();
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

    public Persona() {
        this("", 0, sexo_por_defecto, 0, 0);
        generarDNI();
    }

    public Persona(String nombre, int edad, double peso) {
        this(nombre, edad, sexo_por_defecto, peso, 0);
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
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