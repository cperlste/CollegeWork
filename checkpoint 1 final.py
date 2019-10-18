#get data
#how many customers the company currently has
qtyOfCustomers = 12467
#percent of customers who purchase energy drinks
percentEnergyDrinks = .14
#percent of energy drink customers who prefer citrus flavor
percentCitrus = .64

#calculate qty of customers who prefer citrus energy drinks
qtyOfEnergyCustomers = qtyOfCustomers * percentEnergyDrinks
qtyOfCitrusCustomers = qtyOfEnergyCustomers  * percentCitrus



                                                                   
#display results
print ("Quantity of Customers:" , format(qtyOfCustomers,',d'))
print ("Quantity of Customers Who Purchase Energy Drinks:", format(qtyOfEnergyCustomers,',.2f'))
print ("Quantity of Energy Drink Customers who prefer citrus flavor:", format(qtyOfCitrusCustomers,',.2f'))
#calculate qty of customers who purchase energy drinks

