/**
 * The class DescuentoPorcentaje is a subclass of Descuento
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 29 del 2023, UNAM.
 * @version v1.0
 */

public class DescuentoPorcentaje extends Descuento {

    // Calling the constructor of the superclass.
    public DescuentoPorcentaje(double valor) {
        super(valor);
    }

    /**
     * It takes a price and returns a price
     * 
     * @param precio the price of the product
     * @return The price after the discount is applied.
     */
    public double aplica(double precio) {
        double descuento = precio * (this.valor / 100);
        if ((precio - descuento) < 0) {
            return 0;
        } else {

            return precio - descuento;
        }
    }

    /**
     * "This function returns a new instance of the DescuentoPorcentaje class, which is a subclass of
     * the Descuento class."
     * 
     * The above function is an example of a factory method
     * 
     * @param valor The value of the discount.
     * @return A new instance of DescuentoPorcentaje.
     */
    protected Descuento generaDescuento(double valor) {
        return new DescuentoPorcentaje(valor);
    }

}