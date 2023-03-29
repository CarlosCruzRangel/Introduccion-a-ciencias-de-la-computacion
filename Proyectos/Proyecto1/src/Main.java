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
        
        System.out.println("\n \n Hola:");
        
        System.out.print("¿Cual es el precio del articulo? ");
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
                    System.out.println("\n"+"\033[31m" + "¿Tiene valor el descuento de porcentaje? " + porcentaje.tieneValor() + "\033[0m");
                    System.out.println("\n"+"\033[31m" + "¿Tiene valor el descuento de monto? " + monto.tieneValor() + "\033[0m");
                    break;

                case 6:
                    Descuento combinado = porcentaje.combina(monto);
                    System.out.println("\n"+"\033[31m" + "Descuento combinado: " + combinado.muestra() + "\033[0m");
                    break;

                case 7:
                    System.out.println("\n"+"\033[31m" + "Precio con ambos descuentos acumulados: " + porcentaje.acumula(precio, monto) + "\033[0m");
                    break;

                case 8:
                    System.out.print("\n"+"\033[32m" + "Ingrese factor para multiplicar el descuento (%): " + "\033[0m");
                    valor = scanner.nextDouble();
                    Descuento porcentajeMultiplicado = porcentaje.multiplica(valor);
                    System.out.println("\n"+"\033[31m" + "Descuento de porcentaje multiplicado: " + porcentajeMultiplicado.muestra() + "\033[0m");
                    
                    double nuevoPrecioPorcentaje= porcentajeMultiplicado.aplica(precio);
                    System.out.println("\n"+"\033[31m" + "Nuevo precio con el pocentaje y factor aplicado: " + nuevoPrecioPorcentaje + "\033[0m");
                    

                    break;
                case 9:
                    System.out.print("\n"+"\033[32m" + "Ingrese factor para multiplicar el descuento de monto: " + "\033[0m");
                    valor = scanner.nextDouble();
                    
                    Descuento montoMultiplicado= monto.multiplica(valor);
                    System.out.println("\n"+"\033[31m" + "Descuento de monto multiplicado: " + montoMultiplicado.muestra() + "\033[0m");
                    
                    double nuevoPrecioMonto= montoMultiplicado.aplica(precio);
                    System.out.println("\n"+"\033[31m" + "Nuevo precio con el monto y factor aplicado: " + nuevoPrecioMonto + "\033[0m");

                    break;
                case 10:
                    System.out.print("Ingrese precio para generar descuento equivalente: ");
                    double precioEquivalente = scanner.nextDouble();
                    Descuento equivalente = porcentaje.generaEquivalente(precioEquivalente);
                    System.out.println("El descuento equivalente es: " + equivalente.muestra());                    
                    break;

                case 11:
                    System.out.print("\n"+"\033[32m" + "¿Cual es el precio del articulo?" + "\033[0m");
                    precio = scanner.nextDouble();
                    break;
                case 12:
                    System.out.println("\n"+"\033[31m" + "fin del programa" + "\033[0m");
                    break;

                default:
                    System.out.println("\n"+"\033[31m" + "Opcion no valida" + "\033[0m");
                    break;
                    
            }
        }
    }
} 