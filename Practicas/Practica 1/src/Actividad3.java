/**
 * Actividad 3 de la práctica 1 de ICC.
 *
 * @author Carlos Cruz Rangel 312285823
 * @author Toprak Memik Hernandez 419002354
 * 
 * @since 26 de Febrero 2022
 * @version v1.0
 */

public class Actividad3 {

    public static void main(String[] args) {

        int valor1 = 34;
        int valor2 = 2;
        int valor3 = 4;
        int valor4 = 9;
        int valor5 = 90;

        /*
         * la expresión ++valor1, el operador de incremento prefijo significa que el
         * valor de valor1 se incrementa en 1 antes de ser utilizado en la expresión.
         * Por lo tanto, el primer temino vale 35.
         * 
         * En la expresión --valor2, el operador de decremento prefijo significa que el
         * valor de valor2 se decrementa en 1 antes de ser utilizado en la expresión.
         * Por lo tanto, el segundo término es 1.
         * 
         * En la expresión valor2++, el operador de incremento posfijo significa que el
         * valor actual de valor2 se utiliza en la expresión, pero luego se incrementa
         * en 1. Por lo tanto, el tercero es 2.
         * 
         * Finalmente,  valor1 seincrementa en 1 antes de ser utilizado en la expresión. 
         * Por lo tanto, el último término es 35.
         * 
         * Por lo tanto, el valor de misterioso1 es 35 - 1 + 2 + 35 = 71.
         */
        int misterioso1 = (++valor1) - (--valor2) + (valor2++) + (++valor1);
        
        /**
         * En la expresión valor4++, el operador de incremento posfijo significa que el
         * valor actual de valor4 se utiliza en la expresión, pero luego se incrementa
         * en 1. Por lo tanto, el primer termino es: 9.
         * 
         * la expresión ++valor4, el operador de incremento prefijo significa que el
         * valor de valor4 se incrementa en 1 antes de ser utilizado en la expresión.
         * Por lo tanto, el segundo temino vale 10.
         * 
         * En la expresión valor5++, el operador de incremento posfijo significa que el
         * valor actual de valor5 se utiliza en la expresión, pero luego se incrementa
         * en 1. Por lo tanto, el tercer termino es: 90.
         * 
         * Finalmente,  valor1 seincrementa en 1 antes de ser utilizado en la expresión. 
         * Por lo tanto, el último término es 89.
         * 
         * Por lo tanto, el valor de misterioso1 es 9 + 10 + 90 - 89 = 20.
         */
        int misterioso2 = (valor4++) + (++valor4) + (valor5++) - (--valor5);

        System.out.println(misterioso1);
        System.out.println(misterioso2);
    }
}
