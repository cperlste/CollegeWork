#get data
day = int(input("What day of the month is it?"))
month = int(input("What number month is it?"))
year = int(input("Enter the last two digits of the year:"))
#validate data
if day > 31:
        print ("The day that you entered is invalid.")
else: 
    if month > 12:
            print ("The month that you entered is invalid.")
    else:
        if year > 99:
            print("The year that you entered is invalid.")
#compute valid data to display results
        else:
            if day * month == year:
                print("The day ", month, "/", day, "/", year, " is magic!", sep='')
            else:
                print("The day ", month, "/", day, "/", year, " is not magic.", sep='')
    
