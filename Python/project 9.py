#project 9

class Emppay():
    #constructor
    def __init__(self):
        self.name = 0
        self.pay = 0
        self.hours = 0
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
class Newemp(Emppay):
    def __init__(self):
        self.pay_rate = 100
        Emppay.__init__(self)
    def setpay_rate(self,x):
        self.pay_rate = x
    def getpay_rate(self):
        return self.pay_rate
    def calcself_pay(self):
        self.pay = self.hours * self.pay_rate
# main()
# create an instance of the class (copy)

N = Newemp()
#input
x = int(input("Enter hours worked"))
N.sethours(x)
#process
N.calcself_pay()
#output
print("the pay is",N.getpay())
