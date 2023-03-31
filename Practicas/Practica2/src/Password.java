import java.util.Random;
import java.util.Scanner;
public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de casos de prueba: ");
        int casosPrueba = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= casosPrueba; i++) {
            System.out.println("Caso de prueba #" + i);
            System.out.println("1. Generar contraseña por el sistema");
            System.out.println("2. Ingresar contraseña manualmente");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            Password password;
            if (opcion == 1) {
                password = new Password();
                System.out.println("Contraseña generada: " + password.getContraseña());
            } else {
                System.out.print("Ingrese la contraseña: ");
                String contraseña = scanner.nextLine();
                password = new Password(contraseña);
            }
            if (password.esFuerte()) {
                System.out.println("La contraseña es fuerte.");
            } else {
                System.out.println("La contraseña es débil.");
                while (!password.esFuerte()) {
                    System.out.print("La contraseña es débil. Ingrese una nueva contraseña: ");
                    String nuevaContraseña = scanner.nextLine();
                    password.setContraseña(nuevaContraseña);
                }
                System.out.println("La nueva contraseña es: " + password.getContraseña());
            }
        }
    }

    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(String contraseña) {
        this.longitud = contraseña.length();
        this.contraseña = contraseña;
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarPassword() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        this.contraseña = sb.toString();
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        this.longitud = contraseña.length();
    }
}
