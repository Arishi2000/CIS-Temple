#project 8

class Emppay():
    #constructor
    def __init__(self):
        name = 0
        pay = 0
        hours = 0
        pay_rate = 80
    # member method
    # accessor methods

    #set    

    def setname(self,n):
        self.name = n
    def setpay(self,p):
        self.pay = p
    def sethours(self,h):
        self.hours = h
    
    #get
    def getname(self):
        return self.name
    def getpay(self):
        return self.pay
    def gethours(self):
        return self.hours
    # mutator method
    def calcpay(self):
        self.pay = self.hours * 80
# main()
# create an instance of the class (copy)

T = Emppay()

#input
x = int(input("Enter hours worked"))
T.sethours(x)
            
#process
T.calcpay()

#output
print("the pay is",T.getpay())


