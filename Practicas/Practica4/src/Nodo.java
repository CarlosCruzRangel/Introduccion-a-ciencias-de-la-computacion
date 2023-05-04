/**
 * getters y setter de la clase Nodo
 * 
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 2 mayo 2023, UNAM
 * @version v1.0
 * 
 */

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /*
     * Getters y Setters
     */
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Esta es una implementación del método equals en Java que verifica si dos
     * objetos de la misma clase tienen el mismo valor para un atributo específico.
     * 
     * @param obj El parámetro "obj" es un objeto de tipo Object, que es la
     *            superclase de todas las clases de Java. Se utiliza como parámetro
     *            en el método equals() para comparar el objeto actual con otro
     *            objeto para la igualdad.
     * @return El metodo devulve un valor booleano, ya sea true o false.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        if (this.dato != other.dato) {
            return false;
        }
        return true;
    }

}
