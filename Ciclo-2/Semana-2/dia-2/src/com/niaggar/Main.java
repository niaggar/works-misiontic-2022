package com.niaggar;


/* Temario del dia:
 *  → Programación orientada a objetos
 * */

import poo.Contrasena;
import poo.Persona;


public class Main {

    public static void main(String[] args) {
        /* POO:
        básicamente define una serie de conceptos y tecnicas de programación
        para representar acciones o cosas de la vida real basada en objetos.
        Estos objetos se usan como instancias de clases y sus interacciones
        para diseñar aplicaciones y programas.

        Se tienen dos grandes elementos dentro de la POO, las Clases y los objetos.
            [Clase ver poo.Persona]
            [Objeto ver persona]
        */

        // Se crea una instancia/objeto de la clase Persona
        Persona persona1 = new Persona("Juan Carlos", 28, 40, 182, 'H');
        Persona persona2 = new Persona("Andrea Giraldo", 32, 43, 174, 'M');
        // Ejecuta un método de la instancia persona
        persona1.presentarse();
        persona2.presentarse();

        // Interacción entre instancias de clase
        String mayor = persona1.determinarQuienEsMayor(persona2);
        System.out.println(mayor + " es el mayor");


        System.out.println("CONTRASENA");

        Contrasena contrasena = new Contrasena();
        System.out.println(contrasena.getContrasena());
        contrasena.generarContrasena();
        System.out.println(contrasena.getContrasena());
        contrasena.generarContrasena();
        System.out.println(contrasena.getContrasena());
        contrasena.generarContrasena();
        System.out.println(contrasena.getContrasena());
    }
}
