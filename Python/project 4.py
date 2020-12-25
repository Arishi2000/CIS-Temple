#project4

extra_time = 1.5
base_rate = 40
#input
hours = float(input("Enter hours worked"))
pay_rate = float(input("Enter the hourly pay rate"))


#process

if ( hours > base_rate):
    overtime_hours = hours - base_rate

    overtime_pay = overtime_hours * pay_rate * extra_time

    gross_pay = base_rate * pay_rate + overtime_pay
else:
    gross_pay = hours * pay_rate



#output
print("hours: ",hours)
print("gross pay: " ,gross_pay)
print("Hours Overtime",overtime_pay)

