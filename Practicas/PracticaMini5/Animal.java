package PracticaMini5;

public class Animal {
    private int size;
    private int edad;

    public Animal(int size, int edad) {
        this.size = size;
        this.edad = edad;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        Serpiente Slytherin = new Serpiente(30, 2);
        Slytherin.imprimirDatos();

        Perro Azul = new Perro(50, 4);
        Azul.imprimirDatos();
    }
}
