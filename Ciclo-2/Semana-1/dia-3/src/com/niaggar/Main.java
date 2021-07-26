package com.niaggar;

import java.util.Scanner; 


/*
Temario del dia:
    -> Manejo de ciclos en Java (For, While, Do While)
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola dia 3!");

        Scanner sc = new Scanner(System.in);

        // listado_numeros();
        // suma_de_numeros(sc);
        // numeros_pares(sc);
        poblacion_anual();
    }

    // Desarrollar un programa que lea números enteros y los sume hasta 
    // que lea un cero.
    public static void suma_de_numeros(Scanner sc) {    
        int resultado = 0;
        
        while (true) {
            int numero = sc.nextInt();
            if (numero == 0) break;
            resultado += numero;
        }
        
        System.out.println(resultado);
    }
    
    // Imprimir un listado con los números del 1 al 100 cada uno con su
    // respectivo cuadrado.
    public static void listado_numeros() {
        for (int x = 0; x <= 100; x++) {
            System.out.println(x + " => " + Math.pow(x, 2));
        }
    }

    // Imprimir los números pares en forma descendente hasta 2 que son
    // menores o iguales a un número natural n ≥ 2 dado.
    public static void numeros_pares(Scanner sc) {
        int n = sc.nextInt();

        do {    
            if (n % 2 == 0)
                System.out.println(n);
            n -= 1;
        } while (n >= 2);
    }

    // En 2022 el paı́s A tendrá una población de 25 millones de habitantes
    // y el paı́s B de 18.9 millones. Las tasas de crecimiento anual de la
    // población serán de 2% y 3% respectivamente. Desarrollar un
    // algoritmo para informar en qué año la población del paı́s B superará a
    // la de A.
    public static void poblacion_anual() {
        int year = 2022;

        float pais_1 = 25E6F;
        float pais_2 = 18.9E6F;

        int crecimiento_pais_1 = 2;
        int crecimiento_pais_2 = 3;

        while (pais_1 > pais_2) {
            pais_1 += pais_1 * crecimiento_pais_1 / 100;
            pais_2 += pais_2 * crecimiento_pais_2 / 100;
            year += 1;   
        }

        System.out.println(year);
    }
}
