package poo;

import org.jetbrains.annotations.NotNull;

/* Clases:
Representacion abstracta de cosas de la realidad. Se puede
pensar como una platilla que permite modelar algo en específico.

Las clases están compuestas de atributos y métodos.
    Atributos: Características del modelo se almacenan como variables.
    Métodos: Comportamiento propio de la clase.
*/
public class Persona {
    /* Niveles de acceso:
    public      - Cualquier objeto o clase.
    protected   - Misma clase, subclase o paquete.
    private     - Objetos de la misma clase.
    */

    // Atributos
    public String nombre;
    public int edad;
    public int peso;
    public int altura;
    protected char genero;

    // Constructor
    public Persona(String nombre, int edad, int peso, int altura, char genero) {
        /* Constructor:
        Funcion especial que permite inicializar los atributos con un valor
        en específico. Esta se ejecuta cada que sé instancia un nuevo objeto.
        */
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    // Métodos
    public void presentarse() {
        System.out.println("Mi nombre es " + this.nombre);
    }

    public String determinarQuienEsMayor(Persona persona) {
        if (this.edad > persona.edad) return this.nombre;
        else if (this.edad < persona.edad) return persona.nombre;
        else return "equals";
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}

