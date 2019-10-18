import sys
def temp():
    temp= float(input("Enter the current temperature:"))
    return temp
#given a degree in fahrenheit, convert it to celcius
def convertFtoC(temp):
    newTemp= (temp-32)*(5/9)
    return newTemp
#given a degree in celcius, convert it to fahrenheit
def convertCtoF(temp):
    newTemp = (temp*9/5+32)
    return newTemp
#display a set of choices and return the user choice
def option():
    print("A. convert Fahrenheit to Celcius")
    print("B. convert Celcius to Fahrenheit")
    print("C. Exit")
    choice= input("Enter Choice:")
    return choice
#closing message
def closingMessage():
    print("Thank you for using our app...exiting... Have a nice day!")
def main():
         #repeat loop until the user chooses to exit       
         while (True):
                #get user choice
                choice=option()
                if choice.upper() == 'A':
                                #get current temperature
                                temperature = temp()
                                #convert the temperature
                                newTemp = convertFtoC(temperature)
                                print ("Temperature: ",format(temperature,".2f"),chr(176),"F",
                                        "=",format(newTemp,".2f"),chr(176),"C",sep="")
                elif choice.upper() == 'B':
                                #get current temperature
                                temperature = temp()
                                #convert the temperature
                                newTemp = convertCtoF(temperature)
                                print ("Temperature: ",format(temperature,".2f"),chr(176),"C",
                                        "=",format(newTemp,".2f"),chr(176),"F",sep="")
                elif choice.upper() == 'C':
                                #display closing message
                                closingMessage()
                                sys.exit()
                else:                
                                print ("invalid user selection, please reenter")
#invoke main () to begin the processing
main()                                

                
