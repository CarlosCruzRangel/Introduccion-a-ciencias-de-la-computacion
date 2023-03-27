/**
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 25 del 2023, UNAM.
 * @version v1.0
 */

/**
 * Descuento is an abstract class that implements Descontable and provides a default implementation for
 * all methods except aplica.
 */

public abstract class Descuento implements Descontable {
    
    protected double valor;

    public Descuento(double valor) {
        this.valor = valor;
    }

    public double aplica(double precio) {
        return precio;
    }

    public boolean esMayor(double precio, Descuento otro) {
        if ((this.aplica(precio) > otro.aplica(precio)))
        return false;
        else{
            return true;
        }
    }

    public boolean esDelMismoTipo(Descuento otro) {
        return (this.getClass().equals(otro.getClass()) || 
                otro instanceof DescuentoMonto && this instanceof DescuentoMonto ||
                otro instanceof DescuentoPorcentaje && this instanceof DescuentoPorcentaje);
    }
    

    public boolean tieneValor() {
        return (this.valor > 0);
    }

    public Descuento combina(Descuento otro) {
        if (this.esDelMismoTipo(otro)) {
            double valorCombinado = this.valor + otro.valor;
            return this.generaDescuento(valorCombinado);
        } else {
            return this.generaDescuento(0);
        }
    }

    public double acumula(double precio, Descuento otro) {
        double precioConDescuentoMonto = precio - otro.valor;
        double precioConDescuentoMontoYPorcentaje = this.aplica(precioConDescuentoMonto);
        return precioConDescuentoMontoYPorcentaje;
    }

    public Descuento multiplica(double factor) {
        double valorMultiplicado = this.valor * factor;
        Descuento descuentoMultiplicado = this.generaDescuento(valorMultiplicado);
        System.out.println("El resultado de la multiplicación es: " + valorMultiplicado);
        return descuentoMultiplicado;
    }

    public Descuento generaEquivalente(double precio) {
        double valorEquivalente = precio / (1 - (this.valor / 100));
        return this.generaDescuento(valorEquivalente - precio);
    }

    public boolean esIgual(Descuento otro) {
        return (this.esDelMismoTipo(otro) && this.valor == otro.valor);
    }

    public String muestra() {
        return this.getClass().getSimpleName() + " " + this.valor;
    }

    protected abstract Descuento generaDescuento(double valor);

}