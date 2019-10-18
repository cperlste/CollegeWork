#get criteria from user
vegetarians = input("Are any members of your party vegetarian?")
vegans = input("Are any members of your party vegan?")
glutenFree = input("Are any members of your party gluten-free?")
members =  int(input("How many people do you plan to host?"))

print("Based on the information that you entered, your restaurant options include:")
#display results based on input
if vegetarians.upper()=="NO" and vegans.upper()== "NO" and glutenFree.upper()== "NO" and members<= 50:
    print("Joe's Gourmet Burgers")
if vegetarians.upper()=="YES" and vegans.upper()=="NO" and glutenFree.upper()=="YES" and members<=75:
    print("Main Street Pizza Company")
if vegetarians.upper()=="YES" and vegans.upper()=="YES" and glutenFree.upper()=="YES" and members<=60:
    print("Corner Cafe")
if vegetarians.upper()=="YES" and vegans.upper()== "NO" and glutenFree.upper()=="NO" and members<=50:
    print("Mama's Fine Italian")
if vegetarians.upper()=="YES" and vegans.upper()=="YES" and glutenFree.upper()=="YES" and members<=80:
    print("The Chef's Kitchen")
else:
    print("Sorry, there are no restaurants that meet your exact requirements.")
