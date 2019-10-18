def getValues():
    #set up an empty list
    theList=[]
    more= "YES"
    #user enters as many values as he wishes
    while more.upper()=="YES":
        value=input("enter a value to be added to the list")
        #add the values to the empty list
        theList.append(value)
        more= input("more data? type YES or NO")
    return theList
#receive a list of values
def isIdentical(aList):
    #loop through the list to see if the values are the same
    for x in range(len(aList)):
        if aList[0] != aList[x]:
            #if not, return false
            return False
def reverse(aList):
    #set up an empty list
    listB=[]
    for x in range(len(aList)):
        #loop through the list and change the position of the item in the list
        changed=aList[len(aList)-x-1]
        #add the changed value to the empty list
        listB.append(changed)
    return listB
def computePayroll(salaries, netPay, taxWithheld):
    #calculate 10% of the salary value and add it to the tax withheld list
    for x in range(len(salaries)):
        #convert string to float in order to calculate
        amount= float(salaries[x])
        tenPercent= amount*.1
        taxWithheld.append(tenPercent)
    #take 10% off the salary and add it to the net pay list
    for x in range(len(salaries)):
        #convert string to float in order to calculate
        amount=float(salaries[x])
        tenLess= amount-(amount*.1)
        netPay.append(tenLess)
def main():
    #prompt the user to set up a list
    myList= getValues()
    #check if this list is identical
    identicalResults= isIdentical(myList)
    #display results
    if identicalResults==False:
        print("the values in this list are not the same")
    else:
        print("this is a list of indentical values")
    print("enter a list to be reversed")
    #get new values for the reversed list
    newList= getValues()
    reversedList= reverse(newList)
    #display results
    print("the list ", newList, "has been reversed: " , reversedList)
    #get new list of salaries
    print("enter salary amounts for the month")
    salaryValues= getValues()
    #set up two empty lists for the total pay and the taxes
    totalPay=[]
    withheldTax=[]
    #call the payroll function
    computePayroll(salaryValues, totalPay, withheldTax)
    #display results
    print("Salary", end='  ')
    print("Net Pay", end='  ')
    print("Taxes:")
    for x in range(len(salaryValues)):
        print(salaryValues[x], end='    ')
        print(totalPay[x], end='    ')
        print(withheldTax[x])
    print("=====  =======  =======")
    #initialize data for the totals, calculate, and display
    totalSalaries=0
    for x in range(len(salaryValues)):
        totalSalaries+= float(salaryValues[x])
    print(totalSalaries, end='   ')
    totalTax=0
    for x in range(len(withheldTax)):
        totalTax+= float(withheldTax[x])
    print(totalTax, end=' ')
    payment=0
    for x in range(len(totalPay)):
        payment+= float(totalPay[x])
    print(payment, end='   ')
#invoke the main
main()
    
