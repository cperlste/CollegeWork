#Joe’s Gourmet Burgers—Vegetarian: No, Vegan: No, Gluten-Free: No Capacity - 50 seats
#Main Street Pizza Company—Vegetarian: Yes, Vegan: No, Gluten-Free: Yes 75 seats
#Corner Café—Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes 60 seats
#Mama’s Fine Italian—Vegetarian: Yes, Vegan: No, Gluten-Free: No 50 seats
#The Chef’s Kitchen—Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes 80 seats

#Write a program that asks whether any members of your party are vegetarian, vegan, or gluten-free.
#In addition it asks how many are planning to participate in the event. It should then display only the restaurants to which you may take the group. 


#ask if any members are vegetarian, vegan, or gluten free
vegetarian=input("Are any members vegetarian?")
vegan=input("Are any members vegan?")
glutenFree=input("Are any members gluten free?")
amount=int(input("How many people are participating in this event?"))
if vegetarian.upper() == "YES":
    if vegan.upper()=="YES":
        if glutenFree.upper()=="YES":
            if amount <= 60:
                print("You may eat in Corner Cafe")
            elif amount <= 80:
                print("You may eat in Corner Cafe of  The Chef's Kitchen")
            else:
                print("None of these options are available")
        else:
            if amount <= 50:
                print("You
    else:
        if glutenFree.upper()=="YES":
            if amount <=60:
                print("You may eat at Corner Cafe")
            elif amount<=75:
                print("Y0u may eat at Main Street Pizza Company, and Corner Cafe")
            elif amount <= 80:
                print("You may eat at Main Street Pizza Company,Corner Cafe, and The Chef's Kitchen")
            else:
                print("None of these options are available")
    
