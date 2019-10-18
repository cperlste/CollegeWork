#import math
#def roundup(x):
    #return int(math.ceil(x / 10.0)) * 10
def rounding(x):
    nearest10= (x%10)+(10-x%10)
    tenBelow= x-(x%10)
    return tenBelow+nearest10


def main():
    go="YES"
    while go.upper()== "YES":
        #get user input
        UPC= input("Enter a 12 digit UPC code")
        checkDigit= int(UPC[11])
        print("step 1:", checkDigit)
        sumOddDigits= int(UPC[0])+int(UPC[2])+int(UPC[4])+int(UPC[6])+int(UPC[8])+int(UPC[10])
        print("step 2", sumOddDigits)
        product= sumOddDigits * 3
        print("step 3:", product)
        sumEvenDigits= int(UPC[1])+int(UPC[3])+int(UPC[5])+int(UPC[7])+int(UPC[9])
        print("step 4:", sumEvenDigits)
        sumProductandEvens= product+sumEvenDigits
        print("step 5:", sumProductandEvens)
        if sumProductandEvens%10==0:
            checkDigit=0
            print("check digit:", checkDigit)
            print("This UPC is not valid")
        else:
            difference= rounding(sumProductandEvens)-sumProductandEvens
            print("difference", difference)
            if difference == checkDigit:
                print("This UPC is valid.")
            else:
                print("This UPC is not valid")
        go= input("Do you wish to verify another UPC? Yes or no?")
    print("Thank you for joining us. Have a wonderful day.")
main()

#difference= (sumProductandEvens%10)+(sumProductandEvens-10)
