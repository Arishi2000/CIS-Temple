#project 6

days = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]

temp = [42,45,86,75,43,73,29]

total = sum(temp) / 7

index = 0

while index < len(days):
    print(days[index],temp[index])
    index += 1
print("the low is",min(temp))
print("the high is",max(temp))
print("the average is",format(total,'.2f'))

