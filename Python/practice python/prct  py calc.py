print("1.addition")
print("2.subtraction")
print("3.multiplication")
print("4.division")
print("5.Exit")
choice = int(input(" enter your choice: "))
if( choice >= 1 and choice <= 4):
             print(" Enter two number: ")
             num1 = int(input)
             num2 = int(input)
if (choice == 1):
             res = num1 + num2
             print(" result = ", res)
elif (choice == 2):
             res = num1 - num2
             print(" result = ", res)
elif (choice == 3):
             res = num1 * num2
             print(" result = ",res )
elif (choice == 4):
             res = num1 / num2
             print(" result =", res)
else:
            print(" Wrong Input")
            print(" HAVE A NICE DAY **")
             
