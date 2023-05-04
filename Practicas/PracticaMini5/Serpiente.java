package PracticaMini5;

public class Serpiente extends Animal {
    public Serpiente(int size, int age) {
        super(size, age);
    }

    public void imprimirDatos() {
        System.out.println("Edad de la Serpiente: " + getEdad() + ", tamaño de la Serpiente: " + getSize());
    }
}