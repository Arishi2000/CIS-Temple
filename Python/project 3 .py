
def involts():
    v = float(input("enter the volts"))
    return v
def incurrent():
    c = float(input("enter current"))
    return c
def inresistance():
    r = float(input("enter resistance"))
    return r


def calcvolts(cr,re):
    vo = cr * re
    return vo
def calccurrent(vo,re):
    cr = vo / re
    return cr
def calcresistance(vo,cr):
    re = vo / cr
    return re


def outvolts(vot):
    print("volts: ",vot)
def outcurrent(cr):
    print("current: ",cr)
def outresistance(re):
    print("resistance",re)



#main
loop = "x"
while (loop == "x"):
    print("1. calc volts")
    print("2. calc resistance")
    print("3. calc current")
    print("4. quit")
    ask = input("enter your menu choice")
    if(ask == "1"):
        print("Volts")
        x = incurrent()
        y = inresistance()
        z = calcvolts(x,y)
        outvolts(z)
    elif(ask == "2"):
        print("Resistance")
        x = incurrent()
        y = involts()
        z = calcresistance(x,y)
        outresistance(z)
    elif(ask == "3"):
        print("Current")
        x = involts()
        y = inresistance()
        z = calccurrent(x,y)
        outcurrent(z)
    elif(ask == "4"):
        loop = "A"
    else:
        print(ask,"is not a menu option")

print("End of programe")

#ohm's law menu
# 5/22/2019
# PROJECT 3


