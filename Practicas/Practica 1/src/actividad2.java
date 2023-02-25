public class Actividad2 {

    /*
     * Programa donde se declara y asignan variables necesarias
     * para representar las expresiones dadas en el main usando
     * operadores definidos en java,se imprime el valor de las 
     * variables x, y, z, w, v y los resultados de cada operacion.
     */
    public static void main(String[] args) {
        int y = 2;
        double x = Math.pow(y, 3) * (y / Math.pow(y, 2) + 1);
        double z = x * (x + 30 / Math.pow(y, 2) + (Math.pow(x, 2) / y));
        boolean w = true && false || true || true;
        boolean v = false || w && w || false || !false;
    
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de z: " + z);
        System.out.println("Valor de w: " + w);
        System.out.println("Valor de v: " + v);
        }
}
