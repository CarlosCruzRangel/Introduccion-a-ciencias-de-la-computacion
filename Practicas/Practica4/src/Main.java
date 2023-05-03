/**
 * El codigo del menu para usar las operaciones
 * de la lista
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 2 mayo 2023, UNAM
 * @version v1.0
 *  
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("\n1. Insertar elemento al inicio");
            System.out.println("2. Insertar elemento al final");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Verificar si la lista esta vacia");
            System.out.println("7. Salir");
            System.out.print("\u001B[33m" + "Ingrese una opcion: " + "\u001B[0m");
            opcion = scanner.nextInt();
            switch (opcion) {

                /*
                 * Este bloque de código maneja el caso en el que el usuario selecciona la
                 * opción 1 del menú. Solicita al usuario que ingrese un valor para el nuevo
                 * elemento, crea un nuevo nodo con ese valor, lo inserta al principio de la
                 * lista usando el método `insertarCabeza` de la clase `ListaSimple`, y luego
                 * imprime un mensaje indicando que el elemento fue insertado con éxito.
                 * Finalmente, imprime la lista actualizada utilizando el método `imprimirLista`
                 * de la clase `ListaSimple`.
                 */
                case 1:
                    System.out.print("\u001B[33m" + "Ingrese un valor para el elemento: " + "\u001B[0m");
                    int valor = scanner.nextInt();
                    Nodo nodoInicio = new Nodo(valor);
                    lista.insertarCabeza(nodoInicio);
                    System.out.println("\u001B[32m" + "\n Elemento insertado al inicio de la lista." + "\u001B[0m");

                    System.out.println("\n Elementos de la lista:");
                    lista.imprimirLista();
                    break;

                /*
                 * Este bloque de código maneja el caso en el que el usuario selecciona la
                 * opción 2 del menú. Solicita al usuario que ingrese un valor para el nuevo
                 * elemento, crea un nuevo nodo con ese valor, lo inserta al final de la lista
                 * usando el método `insertarCola` de la clase `ListaSimple`, y luego imprime un
                 * mensaje que indica que el elemento fue insertado con éxito. Finalmente,
                 * imprime la lista actualizada utilizando el método `imprimirLista` de la clase
                 * `ListaSimple`.
                 */
                case 2:
                    System.out.print("\u001B[33m" + "Ingrese un valor para el elemento: " + "\u001B[0m");
                    int valor2 = scanner.nextInt();
                    Nodo nodoFin = new Nodo(valor2);
                    lista.insertarCola(nodoFin);
                    System.out.println("\u001B[32m" + "Elemento insertado al final de la lista." + "\u001B[0m");

                    System.out.println("\n Elementos de la lista:");
                    lista.imprimirLista();
                    break;

                /**
                 * Este bloque de código maneja el caso en que el usuario selecciona la opción 3
                 * del menú. En usuario que introduzca un valor para buscarlo en la lista, crea
                 * un nuevo nodo con con ese valor, y luego llama al método `buscarElemento` de
                 * la clase `ListaSimple` para buscar el nodo en la lista. El método imprimirá
                 * un mensaje indicando si el nodo fue encontrado o no.
                 */
                case 3:
                    System.out.print("\u001B[33m" + "Ingrese un valor para buscar en la lista: " + "\u001B[0m");
                    int valor4 = scanner.nextInt();
                    Nodo nodoBuscar = new Nodo(valor4);
                    lista.buscarElemento(nodoBuscar);
                    break;

                /**
                 * Este bloque de código maneja el caso en el que el usuario selecciona la
                 * opción 4 del menú. En pide al usuario que introduzca un valor para el
                 * elemento a eliminar, crea un nuevo nodo con ese valor, y luego llama al
                 * método `eliminarElemento` de la clase `ListaSimple para eliminar el nodo de
                 * la lista. Finalmente, sale de la sentencia switch de la sentencia switch.
                 * 
                 */
                case 4:
                    System.out.print("\u001B[33m" + "Ingrese un valor para el elemento a eliminar: " + "\u001B[0m");
                    int valor3 = scanner.nextInt();
                    Nodo nodoEliminar = new Nodo(valor3);
                    lista.eliminarElemento(nodoEliminar);
                    break;

                /*
                 * En la opcion 5, Devulve la lista creada hasta el momento
                 */
                case 5:
                    System.out.println("Elementos de la lista:");
                    lista.imprimirLista();
                    break;

                /*
                 * Verifica que la lista est vacia
                 */
                case 6:
                    if (lista.esVacia()) {
                        System.out.println("\u001B[31m" + "La lista está vacia." + "\u001B[0m");
                    } else {
                        System.out.println("\u001B[32m" + "La lista no está vacia." + "\u001B[0m");
                    }
                    break;

                /* 
                 * Salir del programa
                 */    
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("\u001B[31m" + "Opcion invalida." + "\u001B[0m");
                    break;
            }
        } while (opcion != 7);
    }

}
