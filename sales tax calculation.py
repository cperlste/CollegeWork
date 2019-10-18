#get data
amountOfPurchase = float(input("How much did you pay for the purchse?"))
#compute data
percentStateTax = .05
percentCountyTax = .025

stateSalesTax = percentStateTax * amountOfPurchase
countySalesTax = percentCountyTax * amountOfPurchase

totalSalesTax = stateSalesTax + countySalesTax
totalSale = amountOfPurchase + totalSalesTax

#display results
print(' ')
print("You paid $", format(amountOfPurchase, ',.2f'), " for your purchase.", sep='')
print("You paid $", format(stateSalesTax, '.2f'), " for state sales tax.", sep='')
print("You paid $", format(countySalesTax, '.2f'), " for county sales tax.", sep='')
print("You paid a total of $", format(totalSalesTax, '.2f'), " in taxes.", sep='')
print("Therefore, you paid $", format(totalSale, '.2f'), " in total.", sep='')

