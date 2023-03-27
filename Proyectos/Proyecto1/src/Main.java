import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int option;
        double precio;
        double porcen = 0.00;
        double monto = 0.00;
        Descuento descuento1 = new DescuentoPorcentaje(porcen);
        Descuento descuento2 = new DescuentoMonto(monto);

        do {
            System.out.println("--Bienvenido al menu de la tienda--");
            System.out.println("1. Aplicar descuentos ");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Ingrese precio del producto");
                    precio = scanner.nextDouble();
                    System.out.println("Ingrese descuento por porcentaje");
                    porcen = scanner.nextDouble();
                    System.out.println("Ingrese precio del producto");
                    monto = scanner.nextDouble();
                    double precioConDescuento1 = descuento1.aplica(precio);
                    System.out.println("Precio con descuento por porcentaje: " + precioConDescuento1);
                    // Ejemplo de aplicación de descuento por monto
                    double precioConDescuento2 = descuento2.aplica(precio);
                    System.out.println("Precio con descuento por monto: " + precioConDescuento2);

                    // Ejemplo de comparación de descuentos
                    boolean esMayorDescuento1 = descuento1.esMayor(precio, descuento2);
                    System.out.println("El descuento por porcentaje es mayor: " + esMayorDescuento1);

                    boolean tieneValor = descuento1.tieneValor();
                    System.out.println("Verifica que descuento e1 sea mayor a 0: " + tieneValor);

                    // Ejemplo de combinación de descuentos
                    Descuento descuentoCombinado = descuento1.combina(descuento2);
                    System.out.println("Descuento combinado: " + descuentoCombinado.muestra());

                    // Ejemplo de acumulación de descuentos
                    double precioAcumulado = descuento1.acumula(precio, descuento2);
                    System.out.println("Precio con descuentos acumulados: " + precioAcumulado);

                    System.out.println(descuento1.multiplica(2.0));
                    Descuento valorMultiplicado = descuento1.multiplica(2.0);
                    System.out.println("El resultado de la multiplicación es NEW: " + valorMultiplicado);

                    Descuento equivalente = descuento1.generaEquivalente(precio);
                    System.out.println("El descuelto equivalente es "+ equivalente);

                    System.out.println("Es del mismo tipo: " + descuento1.esDelMismoTipo(descuento2));

                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 2);
        
        scanner.close();
    
    }
}

