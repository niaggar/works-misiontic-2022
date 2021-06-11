
def main():
    juan_letters = input().lower().strip()
    camila_letters = input().lower().strip()
    package_letters = input().lower().strip()

    result = ''
    count = [0, 0]

    for letter in package_letters:
        if letter in juan_letters:
            count[0] += 1
        if letter in camila_letters:
            count[1] += 1

        if count[0] == count[1]:
            result += 'e'
        elif count[0] > count[1]:
            result += 'j'
        else:
            result += 'c'

    print(result.upper())


if __name__ == '__main__':
    main()
