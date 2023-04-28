/**
 * The Solresol class is a Java implementation of a language called Solresol,
 * which includes methods for verifying the syntax of Solresol strings, finding
 * antonyms of Solresol words, and converting between abbreviated and full
 * Solresol notation.
 * 
 * @author Carlos Cruz Rangel
 * @author Toprak Memik Hernandez
 * 
 * @since Abril. 27 del 2023, UNAM.
 * @version v1.0
 */

public class Solresol implements Idioma {

    // Silabas validas en Solresol
    private static final String[] silabas = { "do", "re", "mi", "fa", "sol", "la", "si" };

    /**
     * ************************************************************************************
     * PRIMER METODO
     * Verifica que una cadena sea sintácticamente correcta en Solresol
     *
     * @param cadena La cadena a verificar.
     * @return true si es válida, false en otro caso.
     * ************************************************************************************
     */
    public boolean esSolresol(String cadena) {

        /**
         * Verificar longitud de la cadena, en el peor de los casos una cadena correcta
         * tiene a lo mas 10 caracteres
         */
        if (cadena.length() > 10 || cadena.length() < 2) {
            return false;
        }

        /**
         * Verificar que solo contiene silabas válidas, las silabas validas son:
         * { "do", "re", "mi", "fa", "sol", "la", "si" }
         */
        int i = 0;
        while (i < cadena.length()) {
            String silaba;
            if (i + 2 < cadena.length() && esSilaba(cadena.substring(i, i + 3))) {
                silaba = cadena.substring(i, i + 3);
                i += 3;
            } else if (i + 1 < cadena.length() && esSilaba(cadena.substring(i, i + 2))) {
                silaba = cadena.substring(i, i + 2);
                i += 2;
            } else {
                System.out.println("Tu palabra que ingresaste tiene algun elemento que no pertenece a Solresol");
                return false;
            }
        }

        /**
         * Verificar para evitar mas de dos repeticiones de alguna silaba
         */
        int repeticionesConsecutivas = 1;
        String ultimaSilaba = "";
        for (i = 0; i < cadena.length(); i += ultimaSilaba.length()) {
            String silaba = "";
            if (i + 2 < cadena.length() && esSilaba(cadena.substring(i, i + 3))) {
                silaba = cadena.substring(i, i + 3);
            } else if (i + 1 < cadena.length() && esSilaba(cadena.substring(i, i + 2))) {
                silaba = cadena.substring(i, i + 2);
            } else {
                return false;
            }
            if (silaba.equals(ultimaSilaba)) {
                repeticionesConsecutivas++;
                if (repeticionesConsecutivas >= 3) {
                    System.out.println("Hay alguna silaba repetida mas de dos veces y de manera consecutiva");
                    return false;
                }
            } else {
                repeticionesConsecutivas = 1;
            }
            ultimaSilaba = silaba;
        }
        return true;

    }

    /**
     * ************************************************************************************
     * METODO AUXILIAR
     * Verifica si una silaba es válida en Solresol.
     *
     * @param silaba La silaba a verificar.
     * @return true si es válida, false en otro caso.
     * ************************************************************************************
     */
    private boolean esSilaba(String silaba) {

        for (String s : silabas) {
            if (s.equals(silaba)) {
                return true;
            }
        }
        return false;
    }

    /**
     * ************************************************************************************
     * SEGUNDO METODO
     * Devuelve el antónimo formado después de invertir el orden de
     * las sílabas.
     *
     * @param palabra La palabra de la que se quiere su antónimo.
     * @return el antónimo de la palabra en Solresol.
     * ************************************************************************************
     */
    public String daAntonimo(String palabra) {

        String antonimo = "";
        for (int i = palabra.length() - 1; i >= 0;) {
            String silaba = "";
            if (i - 2 >= 0 && esSilaba(palabra.substring(i - 2, i + 1))) {
                silaba = palabra.substring(i - 2, i + 1);
                i -= 3;
            } else if (i - 1 >= 0 && esSilaba(palabra.substring(i - 1, i + 1))) {
                silaba = palabra.substring(i - 1, i + 1);
                i -= 2;
            } else {
                return "";
            }
            antonimo += silaba;
        }
        return antonimo;
    }

    /**
     * ************************************************************************************
     * TERCER METODO
     * Devuelve la notación abreviada de una palabra en Solresol.
     *
     * @param palabra La palabra que se quiere abreviar.
     * @return la abreviación de la palabra en Solresol.
     * ************************************************************************************
     */
    public String daNotacionAbreviada(String palabra) {

        StringBuilder abreviacion = new StringBuilder();
        int i = 0;
        while (i < palabra.length()) {
            if (i < palabra.length() - 2 && palabra.substring(i, i + 2).equals("so")) {
                abreviacion.append("so");
                i += 3;
            } else {
                String letra = String.valueOf(palabra.charAt(i)).toLowerCase();
                for (String silaba : silabas) {
                    if (silaba.startsWith(letra)) {
                        abreviacion.append(silaba.substring(0, 1));
                        break;
                    }
                }
                i++;
            }
        }
        return abreviacion.toString();
    }

    /**
     * ************************************************************************************
     * CUARTO METODO
     * Devuelve la notación completa de una palabra en Solresol.
     *
     * @param abreviacion La apreviacion de una palabra.
     * @return la palabra escrita en notación completa.
     * ************************************************************************************
     */
    public String daNotacionCompleta(String abreviacion) {

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < abreviacion.length()) {
            char currentChar = abreviacion.charAt(i);
            if (currentChar == 's') {
                i++;
                if (i < abreviacion.length() && abreviacion.charAt(i) == 'o') {
                    result.append("sol");
                } else {
                    result.append("si");
                    i--;
                }
            } else {
                switch (currentChar) {
                    case 'd':
                        result.append("do");
                        break;
                    case 'r':
                        result.append("re");
                        break;
                    case 'm':
                        result.append("mi");
                        break;
                    case 'f':
                        result.append("fa");
                        break;
                    case 'l':
                        result.append("la");
                        break;
                }
            }
            i++;
        }
        return result.toString();
    }
}