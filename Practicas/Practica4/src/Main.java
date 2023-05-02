import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Insertar elemento al inicio");
            System.out.println("2. Insertar elemento al final");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Verificar si la lista está vacía");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor para el elemento: ");
                    int valor = scanner.nextInt();
                    Nodo nodoInicio = new Nodo(valor);
                    lista.insertarCabeza(nodoInicio);
                    System.out.println("Elemento insertado al inicio de la lista.");
                    break;
                case 2:
                    System.out.print("Ingrese un valor para el elemento: ");
                    int valor2 = scanner.nextInt();
                    Nodo nodoFin = new Nodo(valor2);
                    lista.insertarCola(nodoFin);
                    System.out.println("Elemento insertado al final de la lista.");
                    break;
                case 3:
                    System.out.print("Ingrese un valor para el elemento a eliminar: ");
                    int valor3 = scanner.nextInt();
                    Nodo nodoEliminar = new Nodo(valor3);
                    lista.eliminarElemento(nodoEliminar);
                    System.out.println("Elemento eliminado de la lista.");
                    break;
                case 4:
                    System.out.print("Ingrese un valor para buscar en la lista: ");
                    int valor4 = scanner.nextInt();
                    Nodo nodoBuscar = new Nodo(valor4);
                    Nodo nodoEncontrado = lista.buscarElemento(nodoBuscar);
                    if (nodoEncontrado != null) {
                        System.out.println("Elemento encontrado en la lista: " + nodoEncontrado.getDato());
                    } else {
                        System.out.println("El elemento no se encuentra en la lista.");
                    }
                    break;
                case 5:
                    System.out.println("Elementos de la lista:");
                    lista.imprimirLista();
                    break;
                case 6:
                    if (lista.esVacia()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("La lista no está vacía.");
                    }
                    break;
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 7);
    }
    
}
