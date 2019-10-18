#given account number, password, and current balance
accountNum = "111"
password = "t0ur0"
currentBalance = 1000.00

#ask user to enter account number and password
userNum = input("What is the account number?")
#if the correct account number was entered, proceed to check the password
if userNum == accountNum:
    #only ask for the password if the account number is verified    
    userPass = input("Please enter the password:")
    if userPass == password:
        #both account number and password are correct
        #find out what type of transaction the user wants
        transType = input("Enter W for withdrawal or D for deposit:")
        transAmt = float(input("Enter dollar amount:"))
        if transType.upper() == 'W':
            newBalance = currentBalance - transAmt
            if transAmt <= currentBalance:
                print("You have enough money. Processing withdrawal of ", format(transAmt, ',.2f'), ". Your remaining balance is $", format(newBalance, ',.2f'), sep='')
            else:
                print("sorry, insufficient funds.")
        elif transType.upper() == "D":
            #process the deposit
            newBalance = currentBalance + transAmt
            print("Processing your deposit of ", format(transAmt, '.2f'), ". Your new balance is $", format(newBalance, ',.2f'), sep='')
    #password is incorrect
    else:
        print ("password is incorrect. please re-enter.")
#wrong account number
else:
    print("incorrect account number")
    
