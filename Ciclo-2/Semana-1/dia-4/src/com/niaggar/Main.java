package com.niaggar;

import java.util.Scanner;


/*
Temario del dia:
    → Cadenas de caracteres y código ASCII
    → Arreglos y matrices
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola dia 4!");

        Scanner sc = new Scanner(System.in);

        arreglos(sc);

        // palidromo("ala");
        // palidromo("adios");
        // palidromo("Tenet");
    }

    // UTILIZACIÓN DE CADENAS:
    public static void cadenas_ascii() {
        // Para crear cadenas se hace uso de la clase String
        // pudiéndose crear simplemente indicándolo o usando su
        // constructor. Asi mismo se diferencia de los caracteres, ya
        // que tienen que declararse con "".
        String cadena_1 = "Hola como estas!";
        String cadena_2 = new String("Hasta luego!");

        // Comparación de cadenas. La forma correcta de comparar
        // cadenas es médiate el método equals(...) aunque es posible
        // utilizar el ==.
        cadena_1.equals(cadena_2);
        cadena_1.equalsIgnoreCase(cadena_2);

        // Verificar la contenencia de una cadena en otra.
        cadena_1.contains(cadena_2);

        // Extraer un carácter de la cadena, se utiliza el método
        // charAt(i) indicando el índice del carácter (El índice
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

    // UTILIZACIÓN DE ARREGLOS
    public static void arreglos(Scanner sc) {
        // Un Arreglo/Vector es una secuencia de n elementos del mismo tipo.
        // n debe ser definido al crear el arreglo.

        // Representación de un arreglo de tipo int en java:
        int n = 3;
        int[] arreglo_enteros = new int[n];

        // Representacion de una matriz de char en java:
        int x = 10, y = 15;
        char[][] matriz = new char[x][y];

        // Ejemplo de uso de arreglos
        int[] res = crear_arreglo_int(sc);
        imprimir_arreglo_int(res);
    }

    public static int[] crear_arreglo_int(Scanner sc) {
        System.out.println("Longitud del arreglo:");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Valor de la posición " + x + ':');
            arreglo[x] = sc.nextInt();
        }

        return  arreglo;
    }

    public static void imprimir_arreglo_int(int[] arreglo) {
        // StringBuilder: Objeto usado si la cadena de caracteres
        // va a cambiar.
        StringBuilder res = new StringBuilder("|");

        for (int x = 0; x < arreglo.length; x++) {
            res.append(" " + x + ": " + arreglo[x] + " |");
        }

        System.out.println(res);
    }
}
