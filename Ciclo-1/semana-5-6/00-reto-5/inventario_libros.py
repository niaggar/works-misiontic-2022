
def generos(lista_de_generos):
    r = []
    for x in lista_de_generos:
        if x not in r:
            r.append(x)

    return r


def filtrar_por_genero(indices, lista_de_generos, filtro):
    return [x for x in indices if lista_de_generos[x] == filtro]


def comparar_inventarios(sucursal_uno, sucursal_dos):
    return [x for x in sucursal_uno if x not in sucursal_dos]


def se_pueden_mover(sucursal_uno, sucursal_dos):
    u = sum([1 for x in sucursal_uno if x not in sucursal_dos])
    d = sum([1 for x in sucursal_dos if x not in sucursal_uno])

    return u if d >= u else d
