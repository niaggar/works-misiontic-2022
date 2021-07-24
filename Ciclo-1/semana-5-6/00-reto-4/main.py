import json


def main():
    products = json.loads(input())
    to_move = input().split()

    counter = {'total': 0, 'products': []}
    for key in to_move:
        if key in products:
            counter['total'] += products[key]
            counter['products'].append(key)

    print(counter['total'])
    print(' '.join(counter['products']))


if __name__ == '__main__':
    main()
