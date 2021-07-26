package com.niaggar;


public class Main {
    public static void main(String[] args) {
        System.out.println(cuadrado(2.45F));
        System.out.println(valor_absoluto(-4123));
        System.out.println(modulo_de_dos_numeros(13));
    }

    // Declaración de funciones:
    // Requiere especificar el tipo de acceso que se tendría de esta,
    // seguido de cuando se podría utilizar y el valor que devolverá.

    public static float cuadrado(float x) {
        return x * x;
    }

    public static int valor_absoluto(int x) {
        // Condicionales:
        // La estructura de los condicionales es practica mente idéntica a
        // la usada en javascript. Declarando la condición entre paréntesis
        // y el código a ejecutar entre corchetes.

        if ( x >= 0 ) {
            return x;
        } else {
            return -x;
        }

        // Asi mismo los signos para modificar el funcionamiento de los
        // condicionales es igual que en javascript:
        // -> o: ||
        // -> y: &&
        // -> no: !
    }

    public static String modulo_de_dos_numeros(int a) {
        // Operador Ternario:
        // Al igual que Javascript, Java tiene el operador ternario
        // que tiene una estructura similar.
        // (condición) ? (verdad) : (falso)

        return (a % 2 != 0) ? "Impar" : "Par";
    }

    public static float descuento_aplicar(String producto) {
        // Sentencia Switch:
        // Misma estructura que en Javascript
        switch (producto) {
            case "tecnología":
                return 12;
            case "estudio":
                return 24.9F;
            case "casa":
                return 20.5F;
            default:
                return 10;
        }
    }
}
