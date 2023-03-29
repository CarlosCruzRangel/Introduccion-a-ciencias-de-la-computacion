/**
 * Descuento is an abstract class that implements the Descontable interface and
 * has a double value, a
 * constructor, and a method that returns the value of the discount.
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 29 del 2023, UNAM.
 * @version v1.0
 */

public abstract class Descuento implements Descontable {

    protected double valor;

    // A constructor that takes a double value and sets it to the value of the
    // class.
    public Descuento(double valor) {
        this.valor = valor;
    }

    /**
     * Apply discount on the price of the item
     * 
     * @param precio The price of the product
     * @return The price of the item.
     */
    public double aplica(double precio) {
        return precio;
    }

    /**
     * This function returns true if the discount applied to the price is greater
     * than the discount applied to the other price.
     * 
     * @param precio the price of the product
     * @param otro   is the other discount
     */
    public boolean esMayor(double precio, Descuento otro) {
        if ((this.aplica(precio) > otro.aplica(precio)))
            return false;
        else {
            return true;
        }
    }

    /**
     * "If the two objects are of the same class, or if they are both of the same
     * subclass, then they are of the same type."
     * 
     * The first part of the function checks if the two objects are of the same
     * class. The second part
     * checks if they are both of the same subclass
     * 
     * @param otro The other discount
     */
    public boolean esDelMismoTipo(Descuento otro) {
        return (this.getClass().equals(otro.getClass()) ||
                otro instanceof DescuentoMonto && this instanceof DescuentoMonto ||
                otro instanceof DescuentoPorcentaje && this instanceof DescuentoPorcentaje);
    }

    /**
     * This function returns true if the value of the variable valor is greater than
     * 0
     * 
     * @return The method is returning a boolean value.
     */
    public boolean tieneValor() {
        return (this.valor > 0);
    }

    /**
     * If the two discounts are of the same type, then return a new discount of the
     * same type with the combined value. Otherwise, return a new discount of the 
     * same type with a value of 0
     * 
     * @param otro The other discount to combine with this one.
     * @return A new instance of the class Descuento.
     */
    public Descuento combina(Descuento otro) {
        if (this.esDelMismoTipo(otro)) {
            double valorCombinado = this.valor + otro.valor;
            return this.generaDescuento(valorCombinado);
        } else {
            return this.generaDescuento(0);
        }
    }

    /**
     * "If you have a price, and you have a discount, and you have a discount on top
     * of that, then you can calculate the price with the discount on top of the discount."
     * 
     * The function is called "acumula" because it accumulates discounts
     * 
     * @param precio the price of the product
     * @param otro   is the object of the class Descuento
     * @return The price with the discount applied.
     */
    public double acumula(double precio, Descuento otro) {
        double precioConDescuentoMonto = precio - otro.valor;
        double precioConDescuentoMontoYPorcentaje = this.aplica(precioConDescuentoMonto);
        return precioConDescuentoMontoYPorcentaje;
    }

    /**
     * The function multiplies the value of the discount by a factor and returns the
     * result as a new discount
     * 
     * @param factor double
     * @return A new instance of the class Descuento.
     */
    public Descuento multiplica(double factor) {
        double valorMultiplicado = this.valor * factor;
        Descuento descuentoMultiplicado = this.generaDescuento(valorMultiplicado);
        return descuentoMultiplicado;
    }

    /**
     * It takes a price and returns a discount that is equivalent to the discount
     * that was passed in
     * 
     * @param precio the price of the product
     * @return A new Descuento object is being returned.
     */
    public Descuento generaEquivalente(double precio) {
        if (this instanceof DescuentoPorcentaje) {
            double valorMonto = precio * (this.valor / 100);
            return new DescuentoMonto(valorMonto);
        } else {
            double valorPorcentaje = (this.valor / precio) * 100;
        return new DescuentoPorcentaje(valorPorcentaje);
        }
    }
    

    /**
     * If the other discount is of the same type and has the same value, then return
     * true, otherwise return false.
     * 
     * @param otro The other discount
     * @return The method returns a boolean value.
     */
    public boolean esIgual(Descuento otro) {
        return (this.esDelMismoTipo(otro) && this.valor == otro.valor);
    }

    /**
     * The function returns a string that is the name of the class and the value of
     * the variable valor
     * 
     * @return The class name and the value of the variable valor.
     */
    public String muestra() {
        return String.valueOf(this.valor);
    }

    /**
     * This function returns a Descuento object, which is a subclass of the
     * Descuento class.
     * 
     * @param valor The value of the discount.
     * @return A Descuento object.
     */
    protected abstract Descuento generaDescuento(double valor);

}