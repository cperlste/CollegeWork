#get input from the customer
custName = input("Welcome to our store - what is your name?")
itemName = input ("what item would you like ?  pizza or ice cream?")
qty = int(input("how many do you want to buy?"))

#process the input
if itemName.upper() == 'PIZZA':
                price = 2.00
elif itemName.upper() == 'ICE CREAM':
                price = 1.50
#calculate the total
total = qty * price
#display output
print (custName , "you owe")
print ('$',format(total,".2f")," ",itemName,' Qty ',qty,' UnitPrice ',format(price,".2f"),sep="")
print ('%.2f %s %s %d %s %.2f' % (total, itemName,'QTY', qty, 'UnitPrice',price))
print ("Have a good day!")

                
