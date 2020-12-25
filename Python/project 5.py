#project 5

filename = input('Enter file name: ')
try:
    with open(filename, 'r') as f:
        count = 1
        for line in f:
            print(str(count) + ": " + line.strip())
            count += 1

except FileNotFoundError:
    print(filename + " does not exists!")
