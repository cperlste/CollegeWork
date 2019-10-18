from datetime import date
#define a function to calculate the amount of money a customer must pay for parking in the garage
def payment(hours):
    if hours <=3:
        charge = 2
    elif hours >= 24:
        charge = 10
    else:
        charge=2+(.5*(hours-3))
    return charge
#get user input
def userName():
    name=input("Welcome-What is your name?")
    return name
def hoursParked():
    hours=float(input("How many hours will your car be parked?"))
    if hours > 24:
        print("The maximum amount of hours is 24. Please move your car before 24 hours is up.")
    elif hours <=1:
        print("You will be charged the minimum amount- up to three hours.")
    return hours

#define a function to display a payment receipt
def receipt(name,hours,totalCharges):
    print("Receipt Printed for ", name)
    print("Date:",str(date.today()))
    print("Hours Parked:", hours)
    print("Total Charge:", format(totalCharges, '.2f'))


#main function
def main():
    #initialize data
    garageOpen="YES"
    todaysEarnings=0
    #run program when garage is open    
    while garageOpen.upper()=="YES":
        name=userName()
        hours= hoursParked()
        totalCharges= payment(hours)
        if hours>24:
            hours=24
        elif hours<1:
            hours=1
        receipt(name, hours, totalCharges)
        print()
        garageOpen= input("Is the garage still open?")
        todaysEarnings= todaysEarnings+totalCharges
    #when the day is over, calculate the total earnings
    print("Today's Earnings:", format(todaysEarnings,'.2f'))
    print("Have a great day! Thank you for parking with us!")
         
main()

    
