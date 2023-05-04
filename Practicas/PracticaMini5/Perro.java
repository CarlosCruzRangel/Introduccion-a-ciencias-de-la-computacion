package PracticaMini5;

public class Perro extends Animal {
    public Perro(int size, int age) {
        super(size, age);
    }

    public void imprimirDatos() {
        System.out.println("Edad del perro: " + getEdad() + ", tamaño del perro: " + getSize());
    }
}