import java.util.Random;
import java.util.Scanner;

public class Password {

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
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        this.contrasena = sb.toString();
    }

}
