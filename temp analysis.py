#get data
tempFahr = float(input("What is the temperature in Fahrenheit?"))

#display data
print("The temperature is ", format(tempFahr, '.2f'), chr(176), ".", sep='') 
#apply specifications
if tempFahr > 100:
    print("It is very hot.")
elif tempFahr >= 88:
    print("It is hot.")
elif tempFahr >= 80:
    print("It is warm.")
elif tempFahr >= 60:
    print("It is pleasant.")
elif tempFahr >= 50:
    print("It is cold.")
elif tempFahr >= 32:
    print("It is very cold.")
elif tempFahr < 32:
    print("It is freezing.")
