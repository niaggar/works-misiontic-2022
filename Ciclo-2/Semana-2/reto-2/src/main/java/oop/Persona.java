/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author nicho
 */
public class Persona {

    public String Nombre;
    public String Apellido;
    static public String Tipo = "Persona";
    
    public Persona(String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apellido = apellido;
    }
    
    @Override
    public String toString() {
        char s = '\n';
        var res = 
                "nombre: " + this.Nombre + s + 
                "apellido: " + this.Apellido + s + 
                "tipo: " + this.Tipo;

        return res;
    }
}
