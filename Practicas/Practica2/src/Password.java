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
        // Variables for counting the number of uppercase letters, lowercase letters, and numbers in the password.
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        
        for (int i = 0; i < longitud; i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {// Checking if the character is an uppercase letter.
                mayusculas++;
            } else if (Character.isLowerCase(c)) {// Checking if the character is a lowercase letter.
                minusculas++;
            } else if (Character.isDigit(c)) { // Checking if the character is a number.
                numeros++;
            }
        }
        
        // Checking if the password has more than 2 uppercase letters, more than 1 lowercase letter,
        // and more than 5 numbers.
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
        // Creating a string with all the uppercase letters, lowercase letters, and numbers.
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        
        // Generating a random password with at least 3 uppercase letters, 2 lowercase letters, and 6
        // numbers
        String password = "";
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(mayusculas.length());
            password += mayusculas.charAt(index);
        }

        
        // Adding 2 lowercase letters to the password.
        for (int i = 0; i < 2; i++) {
            int index = random.nextInt(minusculas.length());
            password += minusculas.charAt(index);
        }

        
        // Adding 6 random numbers to the password.
        int index = random.nextInt(minusculas.length());
        for (int i = 0; i < 6; i++) {
            index = random.nextInt(numeros.length());
            password += numeros.charAt(index);
        }

        
        // Adding random characters to the password until it reaches the length of the password.
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
            System.out.println("\nEste es el caso de prueba N." + (i + 1));

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
                        System.out.println("\033[31m" + "Su contraseña no cumple con los requisitos" + "\033[0m");
                        System.out.println("\033[31m" + "Debe tener al menos 3 mayúsculas, al menos 2 minusculas y como minimo 6 numeritos" + "\033[0m");
                    }
                } else {
                    System.out.print("Ingrese su propia contraseña: ");
                    String nuevaContrasena = scanner.nextLine();
                    password.setContrasena(nuevaContrasena);
                    passwordFuerte = password.esFuerte();
                    if (!passwordFuerte) {
                        System.out.println("\033[31m" + "Su contraseña no cumple con los requisitos" + "\033[0m");
                        System.out.println("\033[31m" + "Debe tener al menos 3 mayúsculas, al menos 2 minusculas y como minimo 6 numeritos" + "\033[0m");
                    }
                }
            }

            System.out.println("\033[32m" + "Su contraseña es segura." + "\033[0m");
        }
    }

}
