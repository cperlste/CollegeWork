sharesPurchased = 2000
paidPerShare = 40.00
commissionPercentage = .03

payment = sharesPurchased * paidPerShare
commission1 = payment * commissionPercentage
totalPayment = payment + commission1


print("Paid for Stock:", format(payment, ',.2f')) 
print("Commision Paid:", format(commission1, ',.2f'))
print("Total Expenses:", format(totalPayment, ',.2f'))
print("                                        ")

sharesSold = 2000
soldPerShare = 42.75

earnings = sharesSold * soldPerShare
commission2 = commissionPercentage * earnings
totalEarning = earnings - commission2

print("Earned for Stock:", format(earnings, ',.2f'))
print("Commission Paid:", format(commission2, ',.2f'))
print("Total Earnings:", format(totalEarning, ',.2f'))
print("                                        ")

stockTransaction = totalEarning - totalPayment

print("Amount Earned in Stock Transaction:", format(stockTransaction, ',.2f'))
