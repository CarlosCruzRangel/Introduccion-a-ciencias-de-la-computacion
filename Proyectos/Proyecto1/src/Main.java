import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inPrecio = new Scanner(System.in);
        int opcion = 0;
        
        double valor = 10.0;
        Descuento porcentaje = new DescuentoPorcentaje(valor);
        Descuento monto = new DescuentoMonto(valor);
        Descuento porcentajeAcu = new DescuentoPorcentaje(valor);
        Descuento montoAcu = new DescuentoMonto(valor);
        
        System.out.println("\n \n Menú:");
        
        System.out.println("¿Cual es el precio del articulo?");
        double precio = scanner.nextDouble();
        while (opcion != 12) {

            System.out.println("\n \n Oprime la opcion de la operacion que deseas realizar");
            System.out.println("1. Aplicar descuento de porcentaje");
            System.out.println("2. Aplicar descuento de monto");
            System.out.println("3. Comparar descuentos");
            System.out.println("4. Comprobar si son del mismo tipo");
            System.out.println("5. Comprobar si tienen valor");
            System.out.println("6. Combinar descuentos");
            System.out.println("7. Acumular descuentos");
            System.out.println("8. Multiplicar descuento de porcentaje por un factor");            
            System.out.println("9. Multiplicar descuento de monto por un factor");
            System.out.println("10. Generar descuento equivalente");
            System.out.println("11. Cambiar precio del articulo");
            System.out.println("12. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n"+"\033[32m" + "Ingrese valor del descuento,(%): "+"\033[0m");
                    valor = scanner.nextDouble();
                    porcentaje = new DescuentoPorcentaje(valor);
                    System.out.println("\n"+"\033[31m" + "Precio con descuento de porcentaje: " + porcentaje.aplica(precio) + "\033[0m");
                    break;

                case 2:
                    System.out.print("\n"+"\033[32m" + "Ingrese valor del descuento (monto): "+"\033[0m");
                    valor = scanner.nextDouble();
                    monto = new DescuentoMonto(valor);
                    System.out.println("\n"+"\033[31m" + "Precio con descuento de monto: " + monto.aplica(precio) + "\033[0m");
                    break;

                case 3:
                    if(porcentaje.esMayor(precio, monto) == monto.esMayor(precio, porcentaje)){
                        
                        System.out.println("\n"+"\033[31m" + "Tienen el mismo valor" + "\033[0m");
                    }else{
                        
                        System.out.println("\n"+"\033[31m" + "¿Es mayor el descuento de porcentaje al de monto? " + porcentaje.esMayor(precio, monto) + "\033[0m");
                        System.out.println("\n"+"\033[31m" + "¿Es mayor el descuento de monto al de porcentaje? " + monto.esMayor(precio, porcentaje) + "\033[0m");
                    }
                    break;
                case 4:
                
                    System.out.println("\n"+"\033[31m" + "¿Son del mismo tipo los dos descuentos? " + porcentaje.esDelMismoTipo(monto) + "\033[0m");
                    break;

                case 5:
                    System.out.println("¿Tiene valor el descuento de porcentaje? " + porcentaje.tieneValor());
                    System.out.println("¿Tiene valor el descuento de monto? " + monto.tieneValor());
                    break;

                case 6:
                    Descuento combinado = porcentaje.combina(monto);
                    System.out.println("Descuento combinado: " + combinado.muestra());
                    break;

                case 7:
                    System.out.println("Precio con ambos descuentos acumulados: " + porcentaje.acumula(precio, monto));
                    break;

                case 8:
                    System.out.print("Ingrese factor para multiplicar el descuento (%): ");
                    valor = scanner.nextDouble();
                    Descuento porcentajeMultiplicado = porcentaje.multiplica(valor);
                    System.out.println("Descuento de porcentaje multiplicado: " + porcentajeMultiplicado.muestra());
                    
                    double nuevoPrecioPorcentaje= porcentajeMultiplicado.aplica(precio);
                    System.out.println("Nuevo precio con el pocentaje y factor aplicado: " + nuevoPrecioPorcentaje);
                    

                    break;
                case 9:
                    System.out.print("Ingrese factor para multiplicar el descuento de monto: ");
                    valor = scanner.nextDouble();
                    
                    Descuento montoMultiplicado= monto.multiplica(valor);
                    System.out.println("Descuento de monto multiplicado: " + montoMultiplicado.muestra());
                    
                    double nuevoPrecioMonto= montoMultiplicado.aplica(precio);
                    System.out.println("Nuevo precio con el monto y factor aplicado: " + nuevoPrecioMonto);

                    break;
                case 10:
                    System.out.print("Ingrese precio para generar descuento equivalente: ");
                    double precioEquivalente = scanner.nextDouble();
                    Descuento equivalente = porcentaje.generaEquivalente(precioEquivalente);
                    System.out.println("El descuento equivalente es: " + equivalente.muestra());                    
                    break;

                case 11:
                    System.out.println("¿Cual es el precio del articulo?");
                    precio = scanner.nextDouble();
                    break;
                case 12:
                    System.out.println("fin del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
        }
    }
} 