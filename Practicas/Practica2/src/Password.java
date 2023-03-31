import java.util.Random;
import java.util.Scanner;

/**
 * The class Password generates a random password with at least 2 uppercase
 * letters, 1 lowercase letter, and 5 numbers
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprac Memik Hernandez
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Password {

    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(String contrasena) {
        this.longitud = contrasena.length();
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
        this.longitud = contrasena.length();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < longitud; i++) {
            char c = contrasena.charAt(i);
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
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        // Generar al menos 2 mayúsculas
        String password = "";
        for (int i = 0; i < 2; i++) {
            int index = random.nextInt(mayusculas.length());
            password += mayusculas.charAt(index);
        }

        // Generar al menos 1 minúscula
        int index = random.nextInt(minusculas.length());
        password += minusculas.charAt(index);

        // Generar al menos 5 números
        for (int i = 0; i < 5; i++) {
            index = random.nextInt(numeros.length());
            password += numeros.charAt(index);
        }

        // Completar la contraseña con caracteres aleatorios
        while (password.length() < longitud) {
            String caracteres = mayusculas + minusculas + numeros;
            index = random.nextInt(caracteres.length());
            password += caracteres.charAt(index);
        }

        this.contrasena = password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de casos de prueba: ");
        int numCasos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCasos; i++) {
            System.out.println("\nCASO DE PRUEBA #" + (i + 1));

            Password password = new Password();
            boolean passwordFuerte = false;

            while (!passwordFuerte) {
                System.out.println("Su contraseña generada es: " + password.getContrasena());
                System.out.print("¿Desea utilizar esta contraseña? (S/N): ");
                String opcion = scanner.nextLine();

                if (opcion.equalsIgnoreCase("S")) {
                    passwordFuerte = password.esFuerte();
                    if (!passwordFuerte) {
                        System.out.println("Su contraseña no cumple con los requisitos de seguridad.");
                        System.out.println("Debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.");
                    }
                } else {
                    System.out.print("Ingrese su propia contraseña: ");
                    String nuevaContrasena = scanner.nextLine();
                    password.setContrasena(nuevaContrasena);
                    passwordFuerte = password.esFuerte();
                    if (!passwordFuerte) {
                        System.out.println("Su contraseña no cumple con los requisitos de seguridad.");
                        System.out.println("Debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.");
                    }
                }
            }

            System.out.println("Su contraseña es segura.");
        }
    }

}
