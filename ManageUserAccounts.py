#given account number, password and current balance
accountNum = "111"
password = "t0ur0"
currentBalance = 1000.00

#ask user to enter account number, password
#verify that account number and password match what is "on file"

userAcctNum = input("enter account number")


#if user entered correct account number
if userAcctNum == accountNum:
    #now check if password is correct
    userPin  = input("enter your password")
    if userPin == password:
        #both account number and password are correct
        #find out what type of transaction customer wants deposit or withdrawal
        transType = input("Enter w for withdrawal , d for deposit")
        transAmount = float(input ("enter dollar amount"))
        if transType.upper() == 'W':
            if transAmount <= currentBalance:
                #calculate remaining balance
                newBalance = currentBalance - transAmount
                #have enough money in the account
                print ('processing withdrawal of ', format(transAmount,",.2f"),
                       " from Account ", accountNum, " Balance: ",
                       format(newBalance,",.2f"))
           else:
               print ("sorry, insufficient funds")
        elif transType.upper() == 'D':
            #process the deposit
            newBalance = currentBalance + transAmount
            print ("Processed deposit of " , format (transAmount,",.2f"),
                   " from Account ", accountNum, " Balance: ",
                   format(newBalance,",.2f"))
        else:
            print ("invalid transaction type please reenter")
    #password is incorrect
    else:
        print ("password is incorrect , please reenter")
#account number was entered incorrectly
else:
    print("incorrect account number")
        
    
