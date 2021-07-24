# Reto 5: Grupo P35

Número máximo de ficheros: 1
Tipo de trabajo: Individual

## Administrando sucursales

Laura acaba de convertirse en la directora de la cadena de librerías de mi libro favorito. Como ella estudió programación rápidamente se da cuenta de que puede automatizar varias tareas para facilitar sus funciones. Así es como decide que necesita un módulo o librería en Python que se llame inventario_libros (la creación del módulo importable vale un punto).

El módulo debe contener 4 funciones (cada una vale un punto) como se definen a continuación:

1. **Géneros:** una función que reciba la lista de géneros literarios de todos los libros de una sucursal y retorne una lista de los géneros sin repeticiones. 
   
   *Ejemplo:*
    `generos([“ciencia ficción”,”drama”,”suspenso”,”drama”,”ciencia ficción”])`
   
   *retorna*
    `[“ciencia ficción”,”drama”,”suspenso”]`


2. **filtrar_por_genero:** una función que recibe una lista de índices(representan libros) a consultar, una lista con los géneros de todos los libros, y un género por el cual filtrar la lista de índices. 
   *Ejemplo:*
    `filtrar_por_genero( [0,2,4], [“ciencia ficción”,”drama”,”suspenso”,”drama”,”terror”], suspenso )`
   
   *retorna* la lista `[2]`, porque solo el libro en la posición 2 es de suspenso.


3. **comparar_inventarios:** en ocasiones se requiere comparar los libros que se tienen entre sucursales esta función debe recibir la lista de libros que tienen dos sucursales y devolver los libros que están en la primera y no en la segunda. Los libros se identifican con un código numérico.
   
   *Ejemplo:*
   `comparar_inventario([12,35,54,18,25,12,23],[45,12,25,18,35])`
   
   *retorna* la lista `[54,23]`.


4. **se_pueden_mover:**  la última operación requerida es calcular cuántos libros se pueden mover entre sucursales, para esto la función recibirá las listas de libros duplicados en ambas sucursales y retorna un entero indicando la cantidad de libros que se pueden enviar se una sucursal a otra recibiendo un libro diferente del cual no se tengan duplicados registrados en el momento.
   
   *Ejemplo:*
   `se_pueden_mover([2,3,5,8,15,23],[2,5,7,9,23,40,53])`
   
   *retorna* `3`. Dado que de la primera sucursal se pueden enviar los libros `[3, 8, 15]` y recibir cualquier 3 de la siguiente lista `[7, 9, 40, 53]`. La segunda sucursal no envía los 4 libros por qué se quiere mantener el conteo de los inventarios intacto.

 

### Consideraciones adicionales: 

Para la evaluación de este reto no necesitan recibir entrada ni imprimir nada en pantalla. Se deben definir las funciones correctamente (respetando los nombres del enunciado) en un archivo llamado inventario_libros.py. Deben asegurarse de que este es el nombre de su archivo en la plataforma de moodle.