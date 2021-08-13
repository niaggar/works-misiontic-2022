/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niaggar.reto2;

import java.util.LinkedList;
import java.util.Scanner;

import oop.Persona;
import oop.Estudiante;
import oop.Profesor;
/**
 *
 * @author nicho
 */
public class Escuela {
    
    static String Nombre;
    static String Comunidad;
    static LinkedList<Persona> listaDePersonas = new LinkedList<Persona>();;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {      
        boolean state = true;
        while (state) {
            var lectura = leerConsola();
            state = manejadorDeEventos(lectura);
        }
    }
    
    public static boolean manejadorDeEventos(String[] datos) {
        System.out.println(Integer.parseInt(datos[0]));
        switch (Integer.parseInt(datos[0])) {
            case 1:
                crearPersona(datos);
                return true;
            case 2:
                listarPersonas();
                return true;
            case 3:
                return false;
            default:
                return true;
        }
    }
    
    public static String[] leerConsola() {
        String lecturaConsola = sc.nextLine();
        String[] dividido = lecturaConsola.split("-"); 
                
        return dividido;
    }
    
    public static void crearPersona(String[] datosPersona) {
        if (datosPersona[3].toLowerCase()
                .equals(Profesor.Tipo.toLowerCase()))
            listaDePersonas.add(new Profesor(
                    datosPersona[1], 
                    datosPersona[2], 
                    datosPersona[4])
            );
        
        else if (datosPersona[3].toLowerCase()
                .equals(Estudiante.Tipo.toLowerCase()))
            listaDePersonas.add(new Estudiante(
                    datosPersona[1], 
                    datosPersona[2], 
                    datosPersona[4])
            );
    }
    
    public static void listarPersonas() {
        System.out.println("***Lista de personas***");
        
        for (Persona persona : listaDePersonas)
            System.out.println(persona.toString());
    }
}
