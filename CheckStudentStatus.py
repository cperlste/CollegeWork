#get number of credits earned
#display student status FRESHMAN SOPHOMORE JUNIOR SENIOR
# 0 -30 credits FRESHMAN
# 31- 60 credits SOPHOMORE
# 61 - 90 credits JUNIOR
# >90 SENIOR
numCredits = int(input("how many credits have you earned?"))
#examine the number of credits
if numCredits >=0 and numCredits <= 30:
    print("Welcome to Touro - wishing you hatzlochoh FRESHMAN")
elif numCredits >=31 and numCredits <= 60:
    print("You are now a SOPHOMORE!")
elif numCredits >=61 and numCredits <= 90:
    print("You are a JUNIOR --- getting there....")
elif numCredits >90:
    print("You are a SENIOR -hope you graduate")
print ('hatzlochoh in school')    
