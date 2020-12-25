#project 4
#Abdullah Arishi
#30/5/2019

extra_time = 1.5
base_rate = 40
#input
hours = int(input("Enter the hours worked"))
#process
if hours <= base_rate:
    reg_pay = hours * base_rate
else:
    overtime_hour = hours - base_rate
    overtime_rate = base_rate * extra_time
    overtime_pay = overtime_hour * overtime_rate
    gross_pay = reg_pay + overtime_pay
#output
print("Regular pay : $",reg_pay)
print("Pay : $",overtime_pay)
print("Gross Pay : $",gross_pay)

    

