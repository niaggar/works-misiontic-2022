
def create_product():
    # Toma los datos del usuario del producto
    product_name = input()
    unit_cost = float(input())
    sale_price = float(input())
    units_aviable = int(input())
    profit = sale_price * units_aviable

    # Retorna el roducto en forma de diccionario
    return {
        'name': product_name,
        'unit_cost': unit_cost,
        'sale_price': sale_price,
        'units_aviable': units_aviable,
        'profit': profit
    }


def main():
    # Crea el producto
    product = create_product()

    # Imprime los datos del producto
    print(f"Producto: {product['name']}")
    print(f"CU: ${product['unit_cost']}")
    print(f"PVP: ${product['sale_price']}")
    print(f"Unidades Disponibles: {product['units_aviable']}")
    print(f"Ganancia: ${product['profit']}")


if __name__ == '__main__':
    main()
