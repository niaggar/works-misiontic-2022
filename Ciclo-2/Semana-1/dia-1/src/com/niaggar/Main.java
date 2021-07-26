package com.niaggar;

// Import la libraries para leer la consola
import java.util.Scanner;

// Clase principal del programa, es la que primero se ejecuta.
// trabaja por clases (También se usa para referirse
// a los archivos)
public class Main {
    // Dentro de la clase Main la función estática main es la
    // primera en ejecutarse

    // Por deducción se entiende que:
    // - public: especifica que cualquiera puede acceder a este método
    // - static: permite ejecutar el método sin inicializar la clase
    // - void: especifica que este método no retorna ninguno valor
    public static void main(String[] args) {
        // Forma de escribir "Hola mundo" en Java
        System.out.println("Hola mundo!");

        double result = gravitacion_universal(12, 3.22F, 5.2456F);
        System.out.println(result);
    }

    public static void tipos_de_datos() {
        // Java es de tipado estático, por lo que es requerido especificar
        // los tipos de datos que se van a utilizar.

        // DATOS PRIMITIVOS:
        // Datos definidos por el sistema (8 tipos)

        // 1. Tipos de enteros
        byte    i1 = 1;         // Un byte [-128, 127] || [0, 255]
        short   i2 = 10;        // Dos bytes
        int     i3 = 100;       // Cuatro bytes
        long    i4 = 1000L;     // Ocho bytes

        // 2. Tipos de punto flotante
        float   f1 = 1.23f;     // 32 bits de precision
        double  f2 = 2.3E5;     // 64 bits de precision

        // 3. Tipos booleanos
        boolean b1 = true;
        boolean b2 = false;

        // 4. Tipos de cadenas
        char    c1 = 'a';       // Un carácter (ASCII)
        String  c2 = "Hola";    // Cadena de texto
    }

    public static void lectura_de_datos() {
        // Para leer datos de consola se requiere de una librería
        // para posteriormente inicializarla.
        Scanner sc = new Scanner(System.in);

        /*
         Se puede también determinar el tipo de dato que va a ser leído
         String  cc = sc.nextLine();
         int     ic = sc.nextInt();
        */

        // EJEMPLO DE PROGRAMA SIMPLE
        System.out.println("Calculadora");

        int num_a       = sc.nextInt();
        int num_b       = sc.nextInt();
        int resultado   = num_a * num_b;

        System.out.println("Resultado " + resultado);
    }

    public static double gravitacion_universal(float r, float m1, float m2) {
        return 6.67384E-11 * ( (m1 * m2) / Math.pow(r, 2) );
    }

    public static void conversion() {
        // Al convertir de decimal a entero se omite por completo la
        // parte decimal del numero.

        double  n = 12.3213123;
        int     i = (int) n;

        System.out.println(i);
    }
}
