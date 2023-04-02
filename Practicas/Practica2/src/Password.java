import java.util.Random;
import java.util.Scanner;

/**
 * The class Password generates a random password with at least 2 uppercase
 * letters, 1 lowercase letter, and 5 numbers
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 1 abril 2023, UNAM
 * @version v1.0
 */

public class Password {

    private int longitud;
    private String contrasena;

    // A constructor that sets the length of the password to 8 and generates a password.
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // A constructor that takes a string as a parameter and sets the length of the password to the
    // length of the string and sets the password to the string.
    public Password(String contrasena) {
        this.longitud = contrasena.length();
        this.contrasena = contrasena;
    }

    /**
     * This function returns the value of the variable contrasena
     * 
     * @return The password.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * This function returns the length of the array
     * 
     * @return The value of the variable longitud.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * The function setContrasena() sets the value of the variable contrasena to the value of the
     * parameter contrasena, and sets the value of the variable longitud to the length of the value of
     * the variable contrasena
     * 
     * @param contrasena The password to be checked.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
        this.longitud = contrasena.length();
    }

    /**
     * It checks if the password is strong by checking if it has more than 2 uppercase letters, more
     * than 1 lowercase letter, and more than 5 numbers
     */
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
        if (((mayusculas > 2) && (minusculas > 1)) && (numeros > 5)) {
            return true;

        } else {
            return false;
        }

    }

    /**
     * Generate a random password with at least 3 uppercase letters, 2 lowercase letters, and 6 numbers
     */
    public void generarPassword() {
        Random random = new Random();
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        // Generar al menos 2 mayúsculas
        String password = "";
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(mayusculas.length());
            password += mayusculas.charAt(index);
        }

        // Generar al menos 1 minúscula
        for (int i = 0; i < 2; i++) {
            int index = random.nextInt(minusculas.length());
            password += minusculas.charAt(index);
        }

        // Generar al menos 5 números
        int index = random.nextInt(minusculas.length());
        for (int i = 0; i < 6; i++) {
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

                password.generarPassword();
                password.setContrasena(password.getContrasena());
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
