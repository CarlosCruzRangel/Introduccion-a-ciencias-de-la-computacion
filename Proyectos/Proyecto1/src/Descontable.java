/** 
 * Los servicios que debe ofrecer un Descuento que puede ser
 * de tipo porcentaje o de monto se listan en esta interfaz .
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Marzo 25 del 2023, UNAM.
 * @version v1.0
*/

public interface Descontable {

    /**
     * Aplica el descuento correspondiente al valor y tipo de
     * del objeto invocante .
     *
     * @param precio El precio al que hay que aplicarle el
     *               descuento .
     * @return Un valor mayor o igual a 0, con el descuento aplicado .
     */
    public double aplica(double precio);

    /**
     * Aplica el descuento del objeto invocante y otro descuento ,
     * comparando los resultados .
     *
     * @param precio El precio al que hay que aplicarle el
     *               descuento .
     * @param otro   El descuento con el cual se har ́a la comparaci ́on.
     * @return true si el objeto invocante posee un mayor descuento
     *         al aplicarese , false en otro caso .
     */
    public boolean esMayor(double precio, Descuento otro);

    /**
     * Indica si es del mismo tipo que otro descuento .
     * 
     * @param otro El descuento con el cual se har ́a la comparaci ́on.
     * @return true si son del mismo tipo , false en otro caso
     */
    public boolean esDelMismoTipo(Descuento otro);

    /**
     * Indica si el valor del descuento es mayor a cero .
     *
     * @return true si su valor es mayor que cero , false en otro
     *         caso .
     */
    public boolean tieneValor();

    /**
     * Si son del mismo tipo , suma sus valores y devuelve el
     * resultado . Si no son del mismo tipo , devuelve un descuento
     * sin valor .
     *
     * @param otro El descuento con el que se planea combinar .
     * @return Un descuento que combina ambos , o bien , un descuento
     *         en ceros si son incompatibles .
     */
    public Descuento combina(Descuento otro);

    /**
     * Si son del mismo tipo , los combina , si no , aplica primero el
     * descuento de monto y luego el porcentaje .
     *
     * @param precio El precio al que hay que aplicarle ambos
     *               descuentos .
     * @param otro   El descuento con el que se planea combinar .
     * @return Un valor mayor o igual a 0, con ambos descuentos
     *         aplicados .
     */
    public double acumula(double precio, Descuento otro);

    /**
     * Multiplica el valor del descuento por cierto factor y genera
     * un nuevo descuento .
     *
     * @param factor El factor por el que se multiplicar ́a el valor
     *               del descuento .
     * @return Un nuevo descuento generado a partir del objeto
     *         invocante y el factor a multiplicar .
     */
    public Descuento multiplica(double factor);

    /**
     * Genera un descuento del tipo opuesto al del objeto invocante ,
     * con la cualidad de que al ser aplicados un precio , ambos dan
     * el mismo descuento (o al menos muy similar si es que hay
     * problema con los decimales ).
     *
     * @param precio El precio al que al aplicarle el descuento
     *               original , o el equivalente , deber ́ıa devolver la
     *               misma cantidad .
     * @return Un nuevo descuento equivalente al invocante , de tipo
     *         opuesto .
     */
    public Descuento generaEquivalente(double precio);

    /**
     * Indica si el objeto invocante son del mismo tipo y tienen el
     * mismo valor .
     *
     * @param otro El descuento con el que se har ́a la comparaci ́on.
     * @return true si son iguales , false en otro caso .
     */
    public boolean esIgual(Descuento otro);

    /**
     * Devuelve una cadena que muestre el tipo y el valor del
     * descuento .
     *
     * @return La cadena correspondiente al descuento .
     */
    public String muestra();
    
}
