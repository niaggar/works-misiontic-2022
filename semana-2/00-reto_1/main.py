'''
Tres tipos de de pasabocas:
    - Platanos -> 2(papas) + 4 platanos 
    - Papas -> int
    - Tocinetas -> (platamos + papas) / 5

Tamaños de paquetes:
    - uno -> 0 - 20 tocinetas
    - dos -> 21 - 30 tocinetas
    - tres -> 31 - 50 tocinentas
    - cuatro -> +50 tocinetas

Trabajo: 
    Recibir el numero de papas y calcular el numero de papas,
    platanos y tocinetas ademas del tamaño del paquete.
'''

import math


def packSize(tocinetas):
    if tocinetas < 0:
        return 'error'
    elif tocinetas < 20:
        return 'uno'
    elif tocinetas < 30:
        return 'dos'
    elif tocinetas < 50:
        return 'tres'
    elif tocinetas > 50:
        return 'cuatro'


def main():
    # Calcula la cantidad de pasabocas
    papas = int(input())
    platanos = math.floor((2 * papas) + 4)
    tocinetas = math.floor((papas + platanos) / 5)
    # Imprime la cantidad de pasabocas
    print(papas, platanos, tocinetas)

    # Determina el tamaño del paquete
    paquete = packSize(tocinetas)
    # Imprime el tamaño del paquete
    print(paquete)


if __name__ == '__main__':
    main()
