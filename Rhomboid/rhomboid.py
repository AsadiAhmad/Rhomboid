if __name__ == '__main__':
    x = int(input())
    for counter in range(-x + 1, x):
        print(" " * abs(counter) + "*" * ((x-abs(counter)) * 2 - 1))
