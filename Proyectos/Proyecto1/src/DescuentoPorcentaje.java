/**
 * The class DescuentoPorcentaje is a subclass of Descuento
 */
public class DescuentoPorcentaje extends Descuento {

    public DescuentoPorcentaje(double valor) {
        super(valor);
    }

    public double aplica(double precio) {
        double descuento = precio * (this.valor / 100);
        if((precio - descuento)<0){
            return 0;
        }else{

            return precio - descuento;
        }
    }

    protected Descuento generaDescuento(double valor) {
        return new DescuentoPorcentaje(valor);
    }

}
