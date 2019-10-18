# get the day of the week
# based on the day of the week display some type of message

DayOfWeek = input ("Enter the day of the week")
DayOfWeek = DayOfWeek.upper()
if DayOfWeek == 'SUNDAY' or DayOfWeek == 'YOM RISHON':
    print('hope you have a good week')
elif DayOfWeek == 'MONDAY' or DayOfWeek == 'YOM SHAINI':
    print ("Back to work")
elif DayOfWeek == 'TUESDAY' or DayOfWeek ==  'YOM SHLISHI':
    print ("back to touro")
elif DayOfWeek == 'WEDNESDAY' or  DayOfWeek == 'YOM RIVII':
    print ('men\'s night at Touro')
elif DayOfWeek == 'THURSDAY' or DayOfWeek =='YOM CHAMISHI':
    print ('another night of Touro')
elif DayOfWeek == 'FRIDAY' or DayOfWeek ==  'YOM SHISHI':
    print ('prepare for Shabbos')
else:
    print ("don't recognize your data , check spelling")
print ("Thank you for using our application...exiting....")    
    

