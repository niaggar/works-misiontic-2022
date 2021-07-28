package com.niaggar;


/*
Temario del dia:
    -> Cadenas de caracteres y codigo ASCII
    -> Arreglos y matrices
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola dia 4!");
        palidromo("ala");
        palidromo("adios");
        palidromo("Tenet");
    }

    public static void cadenas_ascii() {
        // Para crear cadenas se hace uso de la clase String
        // pudiendose crear simplemente indeicandolo o usando su 
        // constructor. Asi mismo se diferencia de los caracters ya 
        // que tienen que declararse con "".

        String cadena_1 = "Hola como estas!";
        String cadena_2 = new String("Hasta luego!");

        // Comparacion de cadenas. La forma correcta de comparar
        // cadenas es mediate el metodo equals(...) auque es posible
        // utilizar el ==.
        cadena_1.equals(cadena_2);
        cadena_1.equalsIgnoreCase(cadena_2);

        // Verificar la contenecia de una cadena en otra.
        cadena_1.contains(cadena_2);

        // Extraer un caracter de la cadena, se utiliza el metodo
        // charAt(i) indicando el indice del caracter (El inidice
        // inicia en cero).
        cadena_1.charAt(2);

        // Es posible extraer parte de una cadena utilizando el método
        // substring(inicio, fin) de la clase String.
        // El método retornará parte de la cadena que se encuentra entre 
        // inicio y fin.
        cadena_1.substring(0, 4);

        // Es posible dividir una cadena dado una subcadena (por la cual se desea
        // separar) utilizando split(str1) de la clase String. El método retorna
        // un arreglo de Strings.
        cadena_1.split(" ");
    }

    public static boolean palidromo(String cadena) {
        char[] c = cadena.toCharArray();

        for (int l = c.length - 1, i = 0; l > i; l--, i++) {
            char t = c[i];
            c[i] = c[l];
            c[l] = t;
        }

        boolean result = new String(c).equalsIgnoreCase(cadena);
        System.out.println(result);

        return result;
    }
}
