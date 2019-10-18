#get user information
def welcome():
    name= input("Welcome- what is your name?")
    return name
def getChoice(user):
    #initialize the data
    choice= 0 
    #validate the choice
    while choice>4 or choice<1:
        #display choices to the user
        print(user, ", your choices include:")
        print("1.Bagel- $2.00")
        print("2.Donut- $1.50")
        print("3.Iced Coffee- $1.85")
        print("4.Salad- $4.00")
        choice= int(input("Enter the number of the item that you wish to buy")) 
        if choice>4 or choice<1:
            print("We don't carry this choice. Please re-enter.")
    return choice
#prompt the user to enter an amount to order
def getQuantity():
    qty=int(input("How many would you like to buy?"))
    return qty
#caculate the cost for this selection depending on the item and amount
def calculateTotal(selection, amount):
    if selection==1:
        price=2.00
    elif selection==2:
        price=1.50
    elif selection==3:
        price=1.85
    elif selection==4:
        price=4.00
    totalCost= price*amount
    return totalCost
#display the results of this selection  
def displayResults(selection, amount, cost):
    if selection==1:
        print("\tBagel, Quantity ", amount, " Subtotal: $", format(cost, '.2f'), sep='')
    elif selection==2:
        print("\tDonut, Quantity ", amount, " Subtotal: $", format(cost, '.2f'), sep='')
    elif selection==3:
        print("\tIced Coffee, Quantity ", amount, " Subtotal: $", format(cost, '.2f'), sep='')
    elif selection==4:
        print("\tSalad, Quantity ", amount, " Subtotal: ", format(cost, '.2f'), sep='')
#if the order is more than $20, the user is eligible for a 10% discount
def discount(cost):
    if cost>20:
        #notify the user that the discount has been applied
        print("You are eligible for a 10% discount which has been applied")
        cost= cost-(.1*cost)
        return cost
    else:
        return cost
#calculate the average of the customers' purchases by dividing the day's total by the quantity of customers
def averageReceipt(todaysTotal, customers):
    average= (todaysTotal/customers)
    return average
    
def main():
    #initialize the loop
    storeOpen= "YES"
    #initialize the totals
    yourTotal=0
    daysTotal=0
    visitors=0
    while storeOpen.upper()== "YES":
        #welcome the user
        userName=welcome()
        #add 1 to the day's tally of customers
        visitors+=1
        #initialize the loop
        moreToOrder="YES"
        while moreToOrder.upper()=="YES":
            #save the function input as variables
            order= getChoice(userName)
            quantity= getQuantity()
            total= calculateTotal(order,quantity)
            displayResults(order, quantity, total)
            #add the total of this selection to the total cost of the order
            yourTotal+=total
            #allow the user to place another order
            moreToOrder= input("Do you have more to order?")
        #apply the discount to the total cost of the order, if necessary
        discountApplied=discount(yourTotal)
        #display the total
        print(userName, ", you owe: $", format(discountApplied, '.2f'), sep='')
        #add this customer's total to the store's daily total
        daysTotal+=discountApplied
        #ask the user if the store is still open
        storeOpen= input("Is the store still open?")
    #when the store closes, calculate the average of the day's earnings based on the day's total and the amount of customers
    avg= averageReceipt(daysTotal, visitors)
    #display the day's total
    print("The total for today is $", format(daysTotal, '.2f'), sep='') 
    #display the average
    print("Average customer sale: $", format(avg, '.2f'), sep='')
    #sign out
    print("Have a great day.... closing")
#invoke the main 
main()
    
