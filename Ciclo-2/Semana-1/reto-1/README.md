# Reto 1: Grupo P35_C2

## Empacadora de paquetes de papas

Una máquina empacadora automática necesita determinar el tamaño de la bolsa en la que debe empaquetar el grupo de pasabocas que sigue en la banda, para esto necesita determinar el número de cada tipo de pasabocas. Sin embargo, por restricciones tecnológicas la máquina solo puede contar uno de los tipos de pasabocas, las papas.

En este punto lo contratan a ud para escribir un programa que le ayude a la máquina a decidir el tipo de bolsa que usará dado el número de papas del grupo. La compañía le informa que los grupos están compuestos de 3 tipos de pasabocas (plátanos, papas y tocinetas), luego le explican que los plátanos de un grupo son 2 veces el número de papas con 4 adicionales y las tocinetas son un quinto de la suma del número de los plátanos y las papas (usando solo la parte entera del resultado de la división).

La máquina dispone de 4 tamaños de paquetes. La compañía mide la capacidad de los paquetes en tocinetas por grupo y los empaca en un paquete de tamaño “uno” si hay entre 0 y 20 tocinetas, tamaño “dos” si hay entre 21 y 30, tamaño “tres” si hay entre 31 y 50 tocinetas y tamaño “cuatro” sí hay más de 50 tocinetas.

Las últimas especificaciones dicen que su programa debe recibir el número de papas del grupo y realizar los cálculos correspondientes para imprimir el número de papas, plátanos y tocinetas en una línea, además del tamaño del paquete en la línea siguiente en texto.

### Ejemplo

En el ejemplo la máquina detectó 25 papas con el sensor

| Entrada | Salida   |
|---------|----------|
|25       | 25 54 15 |
|         | uno      |