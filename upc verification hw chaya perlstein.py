import sys
def rounding(x):
    #find the next highest 10 and add it to the remainder of the number
    nearest10= (x%10)+(10-x%10)
    #find the previous 10 
    tenBelow= x-(x%10)
    #add the next highest 10 to the 10 below the discovered value
    return tenBelow+nearest10


def main():
    #initialize the loop
    go="YES"
    while go.upper()== "YES":
        #get user input
        UPC= input("Enter a 12 digit UPC code: ")
        #validate that the code has 12 digits
        if len(UPC)!=12:
            UPC= input("A UPC code must be 12 digits. Press enter to re-submit a valid UPC.")             
        else:
            #the last digit is the check digit
            checkDigit= int(UPC[11])
            #add up the numbers in the odd positions, starting with the first number
            sumOddDigits=0
            sumEvenDigits=0
            for x in range(0,len(UPC),2):
                sumOddDigits+= int(UPC[x])
            #multiple the sum of the odd digits by 3
            product= sumOddDigits * 3
            #add up the numbers in the even positions, starting with the second number
            for x in range(1,9,3):
                sumEvenDigits= int(UPC[x])
            #add the product from before and the sum of the even digits
            sumProductandEvens= product+sumEvenDigits
            #if this answer is a multiple of 10, then the check digit is 0 and the UPC is valid (check digit=0=difference)
            if sumProductandEvens%10==0:
                checkDigit=0
                print("This UPC is valid.") 
            else:
                #subtract the sum from the next highest 10
                difference= rounding(sumProductandEvens)-sumProductandEvens
                #if this answer equals the check digit, then the UPC is valid 
                if difference == checkDigit:
                    print("This UPC is valid.")
                #if not, it's invalid
                else:
                    print("This UPC is not valid")
                #ask if the user wants to test another code
            go= input("Do you wish to verify another UPC? Yes or no?")
                

main()
print("Thank you for joining us. Have a wonderful day.")

