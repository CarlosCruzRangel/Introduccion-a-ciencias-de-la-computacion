public class DescuentoMonto extends Descuento {

    public DescuentoMonto(double valor) {
        super(valor);
    }

    public double aplica(double precio) {
        return precio - this.valor;
    }

    protected Descuento generaDescuento(double valor) {
        return new DescuentoMonto(valor);
    }

}