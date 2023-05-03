import java.util.Random;

/**
 * El codigo hace las operaciones basicas en una lista simple
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 2 mayo 2023, UNAM
 * @version v1.0
 *  
 */
public class ListaSimple implements Lista {

    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    /**
	 * Metodo que inserta un Nodo en la cabeza de la lista. 
	 * @param elemento de tipo Nodo
	 */
    @Override
    public void insertarCabeza(Nodo elemento) {
        elemento.setSiguiente(cabeza);
        cabeza = elemento;
    }

    /**
	 * Metodo que inserta un Nodo en la cola de la lista. 
	 * @param elemento de tipo Nodo
	 */
    @Override
    public void insertarCola(Nodo elemento) {
        if (cabeza == null) {
            cabeza = elemento;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(elemento);
        }
    }


    /**
	 * Metodo que elimina un elemento de la lista cualquiera. 
	 * @param elemento de tipo Nodo
	 */
    public void eliminarElemento(Nodo elemento) {
        if (cabeza == null) {
            // Si la lista está vacía, no hay nada que eliminar
            System.out.println("\u001B[31m" + "Lista vacia, No se encuentar el elemento deseado" + "\u001B[0m");
            return;
        }

        if (cabeza.equals(elemento)) {
            // Si el elemento a eliminar está en la cabeza, simplemente avanzamos la cabeza
            cabeza = cabeza.getSiguiente();
            System.out.println("\u001B[32m" + "Usted elimino el elemento: " + elemento.getDato() + " de la lista" + "\u001B[0m");
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.equals(elemento)) {
                // Si encontramos el elemento, eliminamos el nodo actual
                anterior.setSiguiente(actual.getSiguiente());
                System.out.println(
                        "\u001B[32m" + "Usted elimino el elemento: " + elemento.getDato() + " de la lista" + "\u001B[0m");
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        System.out.println("\u001B[31m" + "No se encuentra el elemento deseado" + "\u001B[0m");
        // Si llegamos al final de la lista sin encontrar el elemento, no hay nada que
        // eliminar
    }

    /**
	 * Busca un elemento de tipo Nodo en toda la lista, de no ser encontrado regresa un null. 
	 * @param elemento de tipo Nodo
	 * @return nodo si es encontrado, en otro caso retorna un null
	 */
    @Override
    public Nodo buscarElemento(Nodo elemento) {
        Nodo actual = cabeza;
        int posicion = 0;

        if (cabeza == null) {
            // Si la lista está vacía, no hay nada que eliminar
            System.out.println("\u001B[31m" + "Lista vacia" + "\u001B[0m");
        }

        while (actual != null && !actual.equals(elemento)) {
            actual = actual.getSiguiente();
            posicion++;
        }
        if (actual != null) {
            System.out.println("\u001B[32m" + "El elemento está en la posición " + posicion + " y su valor es "
                    + actual.getDato() + "\u001B[0m");
        } else {
            System.out.println("\u001B[31;1m" + "No se encuentra el elemento deseado" + "\u001B[0m");
        }
        return actual;
    }

    /**
	 * Imprime los elementos del Nodo de toda la lista. 
	 */
    public void imprimirLista() {
        Nodo actual = cabeza;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append("->");
            }
            actual = actual.getSiguiente();
        }
        System.out.println(sb.toString());
    }

    /**
	 * Verifica si la lista es vacia.
	 * @return true si es vacia, en otro caso false
	 */
    @Override
    public boolean esVacia() {
        return cabeza == null;
    }
}
