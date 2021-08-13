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
public class Estudiante extends Persona {
    
    public String Curso;
    static public String Tipo = "Estudiante";

    public Estudiante(String nombre, String apellido, String curso) {
        super(nombre, apellido);
        this.Curso = curso;
    }
    
    @Override
    public String toString() {
        char s = '\n';
        var res = 
                "nombre: " + this.Nombre + s + 
                "apellido: " + this.Apellido + s + 
                "tipo: " + this.Tipo + s + 
                "curso: " + this.Curso; 

        return res;
    }
}
