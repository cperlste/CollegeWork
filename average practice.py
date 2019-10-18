def average(total, amount):
    return float(total)/float(amount)
def main():
    theList=[2,4,6,8,10]
    number= len(theList)
    sumAll=0
    for x in range(number):
        sumAll+=theList[x]
    print("sum all:", sumAll)
    print("numbers:", number)
    avg=average(sumAll, number)
    print("average: ", avg)
main()
