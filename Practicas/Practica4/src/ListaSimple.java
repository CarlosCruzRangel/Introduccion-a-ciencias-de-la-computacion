public class ListaSimple implements Lista {

    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    @Override
    public void insertarCabeza(Nodo elemento) {
        elemento.setSiguiente(cabeza);
        cabeza = elemento;
    }

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

    @Override
    public void eliminarElemento(Nodo elemento) {
        if (cabeza != null) {
            if (cabeza.equals(elemento)) {
                cabeza = cabeza.getSiguiente();
            } else {
                Nodo actual = cabeza;
                while (actual.getSiguiente() != null && !actual.getSiguiente().equals(elemento)) {
                    actual = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                }
            }
        }
    }

    @Override
    public Nodo buscarElemento(Nodo elemento) {
        Nodo actual = cabeza;
        while (actual != null && !actual.equals(elemento)) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    @Override
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    @Override
    public boolean esVacia() {
        return cabeza == null;
    }
}
