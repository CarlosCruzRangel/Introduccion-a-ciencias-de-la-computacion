import java.util.Scanner;

/**
 * The class `Main` is a program that allows the user to apply discounts to a
 * product, compare discounts, combine discounts, accumulate discounts,
 * multiply discounts, generate equivalent, discounts, and change the price
 * of the product
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 29 del 2023, UNAM.
 * @version v1.0
 */

public class Main {
    public static void main(String[] args) {

        // Creating two new scanners, one for the user input.
        Scanner scanner = new Scanner(System.in);
        Scanner inPrecio = new Scanner(System.in);

        // Declaring a variable called opcion and assigning it a value of 0.
        int opcion = 0;

        // Declaring a variable called valor and assigning it a value of 10.0 for
        // factor.
        double valor = 0.0;
        double acumuladorPorcentaje1 = 0.0;
        double acumuladorPorcentaje2 = 0.0;
        double acumuladorMonto1 = 0.0;
        double acumuladorMonto2 = 0.0;

        // Creating new objects of the class DescuentoPorcentaje and DescuentoMonto.
        Descuento porcentaje = new DescuentoPorcentaje(valor);
        Descuento monto = new DescuentoMonto(valor);


        Descuento porcentajeAcu1 = new DescuentoPorcentaje(valor);
        Descuento porcentajeAcu2 = new DescuentoPorcentaje(valor);
        Descuento montoAcu1 = new DescuentoMonto(valor);
        Descuento montoAcu2 = new DescuentoMonto(valor);

        System.out.println("\n \n Hola:");

        // Asking the user to input a price for the product.
        System.out.print("¿Cual es el precio del articulo? ");
        double precio = scanner.nextDouble();

        while (opcion != 14) {

            System.out.println("\n \n Oprime la opcion de la operacion que deseas realizar");
            System.out.println(" 1. Aplicar descuento de porcentaje");
            System.out.println(" 2. Aplicar descuento de monto");
            System.out.println(" 3. Comparar descuentos");
            System.out.println(" 4. Comprobar si son del mismo tipo");
            System.out.println(" 5. Comprobar si tienen valor");
            System.out.println(" 6. Combinar descuentos de diferente tipo");
            System.out.println(" 7. Combina dos descuentos de porcentaje");
            System.out.println(" 8. Combina dos descuentos de monto");
            System.out.println(" 9. Acumular monto y porcentaje");
            System.out.println("10. Multiplicar descuento de porcentaje por un factor");
            System.out.println("11. Multiplicar descuento de monto por un factor");
            System.out.println("12. Generar descuento equivalente");
            System.out.println("13. Cambiar precio del articulo");
            System.out.println("14. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                /*
                 * This is the first case of the switch statement. It is asking the user to
                 * input a
                 * value for the discount. Then it is creating a new object of the class
                 * DescuentoPorcentaje and assigning it to the variable porcentaje. Finally, it
                 * is
                 * printing the price of the product with the discount applied.
                 */
                case 1:
                    System.out.print("\n" + "\033[32m" + "Ingrese valor del descuento,(%): " + "\033[0m");
                    valor = scanner.nextDouble();
                    porcentaje = new DescuentoPorcentaje(valor);
                    System.out.println("\n" + "\033[31m" + "Precio con descuento de porcentaje: "
                            + porcentaje.aplica(precio) + "\033[0m");
                    break;

                /*
                 * This is the second case of the switch statement. It is asking the user to
                 * input a
                 * value for the discount. Then it is creating a new object of the class
                 * DescuentoMonto
                 * and assigning it to the variable monto. Finally, it is printing the price of
                 * the
                 * product with the discount applied.
                 */
                case 2:
                    System.out.print("\n" + "\033[32m" + "Ingrese valor del descuento (monto): " + "\033[0m");
                    valor = scanner.nextDouble();
                    monto = new DescuentoMonto(valor);
                    System.out.println(
                            "\n" + "\033[31m" + "Precio con descuento de monto: " + monto.aplica(precio) + "\033[0m");
                    break;

                /*
                 * This is the third case of the switch statement. It is asking the user to
                 * input a
                 * value for the discount. Then it is creating a new object of the class
                 * DescuentoPorcentaje and assigning it to the variable porcentaje. Finally, it
                 * is
                 * printing the price of the product with the discount applied.
                 */
                case 3:
                    if (porcentaje.esMayor(precio, monto) == monto.esMayor(precio, porcentaje)) {

                        System.out.println("\n" + "\033[31m" + "Tienen el mismo valor" + "\033[0m");
                    } else {

                        System.out.println("\n" + "\033[31m" + "¿Es mayor el descuento de porcentaje al de monto? "
                                + porcentaje.esMayor(precio, monto) + "\033[0m");
                        System.out.println("\n" + "\033[31m" + "¿Es mayor el descuento de monto al de porcentaje? "
                                + monto.esMayor(precio, porcentaje) + "\033[0m");
                    }
                    break;

                // This is the fourth case of the switch statement., Printing the price of the
                // product with the discount applied.
                case 4:

                    System.out.println("\n" + "\033[31m" + "¿Son del mismo tipo los dos descuentos? "
                            + porcentaje.esDelMismoTipo(monto) + "\033[0m");
                    break;

                // This is the fifth case of the switch statement., Printing the price of the
                // product with the discount applied.
                case 5:
                    System.out.println("\n" + "\033[31m" + "¿Tiene valor el descuento de porcentaje? "
                            + porcentaje.tieneValor() + "\033[0m");
                    System.out.println("\n" + "\033[31m" + "¿Tiene valor el descuento de monto? " + monto.tieneValor()
                            + "\033[0m");
                    break;

                /*
                 * Creating a new object of the class Descuento and assigning it to the variable
                 * combinado. Then it is printing the value of the variable combinado.
                 */
                case 6:
                    Descuento combinado = porcentaje.combina(monto);
                    System.out.println("\n" + "\033[31m" + "Descuento combinado: " + combinado.muestra() + "\033[0m");
                    break;

                
                // Creating a new object of the class DescuentoPorcentaje and then it is calling the method
                // combina() and aplica() on the object.
                case 7:
                    System.out.print("\n" + "\033[32m" + "Ingresa el primer porcentaje para combinar: " + "\033[0m");
                    acumuladorPorcentaje1 = inPrecio.nextDouble();
                    System.out.print("\n" + "\033[32m" + "Ingresa el segundo porcentaje para combinar: " + "\033[0m");
                    acumuladorPorcentaje2 = inPrecio.nextDouble();

                    porcentajeAcu1 = new DescuentoPorcentaje(acumuladorPorcentaje1);
                    porcentajeAcu2 = new DescuentoPorcentaje(acumuladorPorcentaje2);

                    porcentaje = porcentajeAcu1.combina(porcentajeAcu2);
                    System.out.println(
                            "\n" + "\033[31m" + "El porcentaje combinado es " + porcentaje.muestra() + "\033[0m");
                    System.out.println("\n" + "\033[31m" + "El nuevo precio con descuento de porcentaje combinado: "
                            + porcentaje.aplica(precio) + "\033[0m");
                    break;

                
                // Creating a new object of the class DescuentoMonto and then it is calling the method
                // combina() and aplica() on the object.
                case 8:
                    System.out.print("\n" + "\033[32m" + "Ingresa el primer monto para combinar: " + "\033[0m");
                    acumuladorMonto1 = inPrecio.nextDouble();
                    System.out.print("\n" + "\033[32m" + "Ingresa el segundo monto para combinar: " + "\033[0m");
                    acumuladorMonto2 = inPrecio.nextDouble();

                    montoAcu1 = new DescuentoMonto(acumuladorMonto1);
                    montoAcu2 = new DescuentoMonto(acumuladorMonto2);

                    monto = montoAcu1.combina(montoAcu2);
                    System.out.println("\n" + "\033[31m" + "El monto combinado es " + monto.muestra() + "\033[0m");
                    System.out.println("\n" + "\033[31m" + "El nuevo precio con descuento de monto combinado: "
                            + monto.aplica(precio) + "\033[0m");
                    break;

                // Printing out the price of the item with the discount applied.
                case 9:
                    System.out.println(
                            "\n" + "\033[32m" + "Descuento por porcentaje: " + porcentaje.muestra() + "\033[0m");
                    System.out.println("\n" + "\033[32m" + "Descuento por monto: " + monto.muestra() + "\033[0m");

                    System.out.println("\n" + "\033[31m" + "Precio con ambos descuentos acumulados: "
                            + porcentaje.acumula(precio, monto) + "\033[0m");

                    break;
                /*
                 * Asking the user to input a value for the discount. Then it is creating a new
                 * object
                 * of the class DescuentoPorcentaje and assigning it to the variable porcentaje.
                 * Finally, it is printing the price of the product with the discount applied.
                 */
                case 10:
                    System.out.print(
                            "\n" + "\033[32m" + "Ingrese factor para multiplicar el descuento (%): " + "\033[0m");
                    valor = scanner.nextDouble();
                    Descuento porcentajeMultiplicado = porcentaje.multiplica(valor);
                    System.out.println("\n" + "\033[31m" + "Descuento de porcentaje multiplicado: "
                            + porcentajeMultiplicado.muestra() + "\033[0m");

                    double nuevoPrecioPorcentaje = porcentajeMultiplicado.aplica(precio);
                    System.out.println("\n" + "\033[31m" + "Nuevo precio con el pocentaje y factor aplicado: "
                            + nuevoPrecioPorcentaje + "\033[0m");

                    break;

                /*
                 * Asking the user to input a value for the discount. Then it is creating a new
                 * object
                 * of the class DescuentoPorcentaje and assigning it to the variable porcentaje.
                 * Finally, it is printing the price of the product with the discount applied.
                 */
                case 11:
                    System.out.print(
                            "\n" + "\033[32m" + "Ingrese factor para multiplicar el descuento de monto: " + "\033[0m");
                    valor = scanner.nextDouble();

                    Descuento montoMultiplicado = monto.multiplica(valor);
                    System.out.println("\n" + "\033[31m" + "Descuento de monto multiplicado: "
                            + montoMultiplicado.muestra() + "\033[0m");

                    double nuevoPrecioMonto = montoMultiplicado.aplica(precio);
                    System.out.println("\n" + "\033[31m" + "Nuevo precio con el monto y factor aplicado: "
                            + nuevoPrecioMonto + "\033[0m");

                    break;

                /*
                 * Asking the user to input a value for the discount. Then it is creating a new
                 * object
                 * of the class DescuentoPorcentaje and assigning it to the variable porcentaje.
                 * Finally, it is printing the price of the product with the discount applied.
                 */
                case 12:
                    System.out.println(
                            "\n" + "\033[32m" + "Descuento por porcentaje: " + porcentaje.muestra() + "\033[0m");
                    Descuento equivalenteMonto = porcentaje.generaEquivalente(precio);
                    System.out.println("\n" + "\033[31m" + "Descuento porcentaje equivalente en monto: "
                            + equivalenteMonto.muestra() + "\033[0m");

                    System.out.println("\n");

                    System.out.println("\n" + "\033[32m" + "Descuento por monto: " + monto.muestra() + "\033[0m");
                    Descuento equivalentePorcentaje = monto.generaEquivalente(precio);
                    System.out.println("\n" + "\033[31m" + "Descuento monto equivalente en porcentaje: "
                            + equivalentePorcentaje.muestra() + "\033[0m");
                    break;

                /*
                 * Asking the user to input a price for the product. Then it is assigning the
                 * value of
                 * the variable precio to the variable precio. Finally, it is breaking out of
                 * the
                 * switch statement.
                 */
                case 13:
                    System.out.print("\n" + "\033[32m" + "¿Cual es el precio del articulo? " + "\033[0m");
                    precio = scanner.nextDouble();
                    break;

                // Printing the message "fin del programa" and breaking out of the switch
                // statement.
                case 14:
                    System.out.println("\n" + "\033[31m" + "fin del programa" + "\033[0m");
                    break;

                default:
                    System.out.println("\n" + "\033[31m" + "Opcion no valida" + "\033[0m");
                    break;

            }
        }
    }
}