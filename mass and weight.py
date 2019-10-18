#get data
mass = float(input("What is the object's mass in kilograms?"))
#calculate weight
weight = mass * 9.8
#make a decision based on weight
if weight>500:
    print("The object weighs ", format(weight, '.2f'), " newtons. It is too heavy.", sep='')
else:
    if weight < 100:
        print("The object weighs ", format(weight, '.2f'), " newtons. It is too light.", sep='')
    else:
        print("The object weighs ", format(weight, '.2f'), " newtons.", sep='') 

  
