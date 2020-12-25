#project 7

password = input(("Enter a password"))
"""
upper_case = 0
lower_case = 0
number = 0

for i in password:
    if i.isupper():
        upper_case = 1
    elif i.islower():
        lower_case = 1
    elif i.isdigit():
        number = 1

if len (password) <= 6:
    print("password must be at least 6 chararcters")
elif not password.isdigit():
    print("Make sure your password has a number in it")
elif not password.isupper(): 
    print("Make sure your password has a uppercase in it")
elif not password.islower():
    print("Make sure your password has a lowercase in it")

else:
    print("Your password seems fine")
"""
if len (password) < 6:
    print("password must be at least 6 chararcters")        
if not password.isdigit():
    print("password must have a digit")
if not password.isupper():
    print("password must have at least one uppercase character")

if not password.islower():
    print("password must have at least one lowercase character ")
else:
    print(" password is fine")
    
