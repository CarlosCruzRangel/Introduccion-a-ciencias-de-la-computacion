/**
 * DescuentoMonto is a class that represents a discount of a fixed amount
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 29 del 2023, UNAM.
 * @version v1.0
 */

public class DescuentoMonto extends Descuento {

    // Calling the constructor of the superclass.
    public DescuentoMonto(double valor) {
        super(valor);
    }

    /**
     * If the price is less than the discount, return 0, otherwise return the price minus the discount
     * 
     * @param precio the price of the product
     * @return The price of the item minus the value of the coupon.
     */
    public double aplica(double precio) {
        if ((precio - this.valor) < 0) {
            return 0;
        } else {

            return precio - this.valor;
        }
    }

    /**
     * This function returns a new instance of the DescuentoMonto class, which is a subclass of the
     * Descuento class.
     * 
     * @param valor The value of the discount
     * @return A new instance of DescuentoMonto.
     */
    protected Descuento generaDescuento(double valor) {
        return new DescuentoMonto(valor);
    }

}