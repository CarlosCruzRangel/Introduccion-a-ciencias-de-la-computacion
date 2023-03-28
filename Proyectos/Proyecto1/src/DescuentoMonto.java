public class DescuentoMonto extends Descuento {

    public DescuentoMonto(double valor) {
        super(valor);
    }

    public double aplica(double precio) {
        if((precio - this.valor)<0){
            return 0;
        }else{

            return precio - this.valor;
        }
    }

    protected Descuento generaDescuento(double valor) {
        return new DescuentoMonto(valor);
    }

}