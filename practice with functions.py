def totalBalance(currentBalance, interestRate, numYears):
    for years in range(numYears):
        interest = (interestRate*currentBalance)
        currentBalance=currentBalance+interest
    return currentBalance
def getBalance():
    accountBalance= -1
    while accountBalance<0:
        accountBalance=float(input("What is the current balance?"))
    return accountBalance
def getRate():
    rate= .36
    while rate<0 or rate>=.10:
        rate= float(input("What is the interest rate?"))
    return rate
    
currentBalance= getBalance()
interestRate = getRate()
numYears = int(input("for how many years do you plan to invest the money?"))
total= totalBalance(currentBalance, interestRate, numYears)
print("Original Balance:", currentBalance)
print("Years Invested:", numYears)
print("Rate:", interestRate)
print("Ending Balance", total)
