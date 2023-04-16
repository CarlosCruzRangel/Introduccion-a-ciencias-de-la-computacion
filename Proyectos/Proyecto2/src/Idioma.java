/**
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Abril 25 del 2023, UNAM.
 * @version v1.0
 */

public interface Idioma {
    
    /**
    * Verifica que una cadena sea sintácticamente correcta en Solresol
    *
    * @param cadena La cadena a verificar.
    * @return true si es válida, false en otro caso.
    */
    public boolean esSolresol(String cadena);
    
    /**
    * Devuelve el antónimo formado después de invertir el orden de
    * las sílabas.
    *
    * @param palabra La palabra de la que se quiere su antónimo.
    * @return el antónimo de la palabra en Solresol.
    */
    public String daAntonimo ( String palabra );
    
    /**
    * Devuelve la notación abreviada de una palabra en Solresol.
    *
    * @param palabra La palabra que se quiere abreviar.
    * @return la abreviación de la palabra en Solresol.
    */
    public String daNotacionAbreviada ( String palabra );
    
    /**
    * Devuelve la notación completa de una palabra en Solresol.
    *
    * @param abreviacion La apreviacion de una palabra.
    * @return la palabra escrita en notación completa.
    */
    public String daNotacionCompleta ( String abreviacion );
}
