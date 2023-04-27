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
            System.out.println("La longitud fallo");
            return false;
        }
        // Verificar que solo contiene silabas válidas
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
                System.out.println("NO paso la verificacion de silabas validas");
                return false;
            }
        }
        // Verificar que no se repiten tres o más veces consecutivas la misma silaba
        int repeticionesConsecutivas = 1;
        String ultimaSilaba = "";
        for (i = 0; i < cadena.length(); i += ultimaSilaba.length()) {
            String silaba = "";
            if (i + 2 < cadena.length() && esSilaba(cadena.substring(i, i + 3))) {
                silaba = cadena.substring(i, i + 3);
            } else if (i + 1 < cadena.length() && esSilaba(cadena.substring(i, i + 2))) {
                silaba = cadena.substring(i, i + 2);
            } else {
                System.out.println("NO pasó la verificación de silabas validas");
                return false;
            }
            if (silaba.equals(ultimaSilaba)) {
                repeticionesConsecutivas++;
                if (repeticionesConsecutivas >= 3) {
                    System.out.println("NO pasó la verificación de repeticion");
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
     * Verifica si una silaba es válida en Solresol.
     *
     * @param silaba La silaba a verificar.
     * @return true si es válida, false en otro caso.
     */
    private boolean esSilaba(String silaba) {
        for (String s : silabas) {
            if (s.equals(silaba)) {
                System.out.println(silaba + " : esSilaba() SI la reconoció como silaba");
                return true;
            }
        }
        System.out.println(silaba + " : esSilaba() NO la reconoce como silaba");
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
