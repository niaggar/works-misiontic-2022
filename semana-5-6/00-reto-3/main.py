def solve_two():
    # No tiene en cuenta el orden, por lo que no funciona como una
    # solución completa al problema

    input_data = input().split()

    count = {}
    for letter in input_data:
        if letter in count:
            count[letter] += 1
        else:
            count[letter] = 1

    print(' '.join(count.keys()))
    print(' '.join(str(n) for n in count.values()))


def solve_one():
    # Primera solución y única que cumple realmente con el
    # problema planteado

    input_data = input().split()

    count = {
        'letters': [],
        'number': [],
    }

    for letter in input_data:
        if not len(count['letters']):
            count['letters'].append(letter)
            count['number'].append(1)

        elif count['letters'][len(count['letters']) - 1] == letter:
            count['number'][len(count['number']) - 1] += 1

        else:
            count['letters'].append(letter)
            count['number'].append(1)

    print(' '.join(count['letters']))
    print(' '.join(str(number) for number in count['number']))


if __name__ == '__main__':
    # solve_one()
    solve_two()
