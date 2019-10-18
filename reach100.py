import random
import sys
#name players
player1= str(input("What is player 1's name?"))
player2= str(input("What is player 2's name?"))
#welcome message and instructions
print("Welcome, ", player1, " and ", player2, "! Here's how to play. Each player will spin two dice. If the total of the two dice is 7, you must go back 7 spaces. If you are not up to position 7 yet, then you go back to position 1. Otherwise, you add the amount that you spun to your current position. The first player to reach 100 wins!", sep='')
begin = input("Ready to play?")
if begin.upper()=="YES":
    #starting positions
    player1position = 1
    player2position = 1
    winner = False
    turns = 0
    #play the game until someone wins
    while not winner:
        #add another turn to the count of the total
        turns=(turns+1)
        #player 1 spins:
        p1roll1 = random.randint(1,6)
        p1roll2 = random.randint(1,6)
        totalRoll = (p1roll1 +p1roll2)
        print(player1, "spun", totalRoll)
        if player1position>=100:
            print(player1, "has reached 100!")
            winner= True
            print(player1, "WINS!!")
            print("It took you", turns, "turns to win the game.")
        else:
            #if player spins a 7 and is further than position 7, they go back 7 spaces
            if totalRoll==7 and player1position>7:
                player1position = player1position - 7
                print(player1, "is now at position", player1position)
            #if player spins a 7 but isn't up to 7 yet, then they go back to square one
            elif totalRoll==7 and player1position<=7:
                player1position=1
                winner=False
                print(player1, "is now at position", player1position)
            #otherwise, they move forward based on the amount that they spun
            else:
                player1position= (totalRoll+player1position)
                print(player1, "is now at position", player1position)
        #player 2's turn- same rules
        p2roll1 = random.randint(1,6)
        p2roll2 = random.randint(1,6)
        totalRoll = (p2roll1 +p2roll2)
        print('\t', player2, "spun", totalRoll)
        if player2position>=100:
            winner=True
            print(player2, "has reached 100!")
            print(player2, "WINS!!")
            print("It took you", turns, "turns to win the game.")
            sys.exit()
        else:
            if totalRoll==7 and player2position>7:
                player2position = player2position - 7
                print('\t', player2, "is now at position", player2position)
            elif totalRoll==7 and player2position<=7:
                player2position=1
                winner=False
                print('\t', player2, "is now at position", player2position)
            elif totalRoll!=7:
                player2position= (totalRoll+player2position)
                print('\t', player2, "is now at position", player2position)
else:
    print("Sorry to hear that. Have a great day, and maybe you'll play next time.")
    sys.exit()


