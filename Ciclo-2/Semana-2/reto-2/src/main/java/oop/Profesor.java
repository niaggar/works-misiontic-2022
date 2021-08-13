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
public class Profesor extends Persona {
    
    public float Salario = 0F;
    static public String Tipo = "Profesor";
    
    public Profesor(String nombre, String apellido, String salario) {
        super(nombre, apellido);
        this.Salario = Float.parseFloat(salario);
    }
    
    @Override
    public String toString() {
        char s = '\n';
        var res = 
                "nombre: " + this.Nombre + s + 
                "apellido: " + this.Apellido + s + 
                "tipo: " + this.Tipo + s + 
                "salario: " + this.Salario; 

        return res;
    }
}
