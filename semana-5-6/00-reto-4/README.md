# Reto 4: Grupo P35

Pedro está moviendo toda la mercancía de su ferretería de una bodega a otra, la mercancía se encuentra empacada en cajas. Pedro quiere mover todas las cajas de cada producto juntas. Pedro tiene la información de cuántas cajas hay de cada producto, pero necesita calcular la cantidad de cajas a mover si quiere mover una lista de productos. Para esto necesita su ayuda. 

Pedro tiene la información de cuántas cajas hay por cada producto en un diccionario en formato JSON. Le pide a ud. que cree un programa que lea esta información y la lista de productos que quiere mover. Luego, como salida imprima la cantidad de cajas a mover y los productos que hay en estas cajas.

> ### Nota: 
> a Pedro se le puede olvidar qué productos ha movido e incluir productos que no están en la bodega en su lista de mudanza.

## Entrada

Una línea que describe el diccionario en formato JSON y una segunda línea con los productos que se quieren mover.

## Salida

Dos líneas; la suma de las cajas de los productos de la lista que están en la bodega en la primera y la lista de productos en la segunda línea.


| Entrada                                             | Salida             |
| --------------------------------------------------- | ------------------ |
| {"mangueras": 39, "arandelas": 94, "puntillas": 44} | 83                 |
| tuercas metros serruchos mangueras puntillas        | mangueras puntillas|
