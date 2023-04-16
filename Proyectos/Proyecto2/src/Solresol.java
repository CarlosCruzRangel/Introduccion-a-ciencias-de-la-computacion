public class Solresol implements Idioma {

    private static final String[] silabas = {"do", "re", "mi", "fa", "sol", "la", "si"};

    /**
     * Verifica que una cadena sea sintácticamente correcta en Solresol
     *
     * @param cadena La cadena a verificar.
     * @return true si es válida, false en otro caso.
     */
    public boolean esSolresol(String cadena) {
        // Verificar longitud de la cadena
        if (cadena.length() > 16 || cadena.length() < 2) {
            return false;
        }
        // Verificar que solo contiene silabas válidas
        for (int i = 0; i < cadena.length(); i += 2) {
            String silaba = cadena.substring(i, i + 2);
            if (!esSilaba(silaba)) {
                return false;
            }
        }
        // Verificar que no se repiten más de dos veces consecutivas la misma silaba
        for (int i = 0; i < cadena.length() - 4; i += 2) {
            String silaba1 = cadena.substring(i, i + 2);
            String silaba2 = cadena.substring(i + 2, i + 4);
            String silaba3 = cadena.substring(i + 4, i + 6);
            if (silaba1.equals(silaba2) && silaba2.equals(silaba3)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si una silaba es válida en Solresol.
     *
     * @param silaba La silaba a verificar.
     * @return true si es válida, false en otro caso.
     */
    private boolean esSilaba(String silaba) {
        for (String s : silabas) {
            if (s.equals(silaba)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String daAntonimo(String palabra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'daAntonimo'");
    }

    @Override
    public String daNotacionAbreviada(String palabra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'daNotacionAbreviada'");
    }

    @Override
    public String daNotacionCompleta(String abreviacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'daNotacionCompleta'");
    }
}
