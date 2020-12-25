#project 7


def valid(a,b,c,d):
    if ( length == 1) and ( upper == 1) and ( lower == 1) and (digit == 1):
        print("password is valid")
    else:
        print("password is not valid")

length = 0
upper = 0
lower = 0
digit = 0
password = input(("Enter a password"))

if len (password) > 6:
    length = 1

    for ch in password:
        if ch.isupper():
           upper = 1
        if ch.islower():
            lower = 1
        if ch.isdigit():
            digit = 1

if not length:
    print("password must be at least 6 characters")
if not upper:
    print("password must have an uppercase character")
if not lower:
    print("password must have a lowercase character")
if not digit:
    print("password must have a digit character")


#main
valid(length,upper,lower,digit)
            

#Abdullah Arishi
#6/12
