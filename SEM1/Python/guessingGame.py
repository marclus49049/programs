# A program where the user has to guess the random number that is generated
# Mansi
import random

print("Welcome to my game, here you will have to guess the number between 0 - 99")
print("If you are right you will get an appropriate message")
print("You only have 3 tries to guess the number and dont worry")
print("I have placed hints to help you find the number")

number_to_guess = random.randint(0, 99)
# this will generate a random number between 0-99
chances = 0
win_condition = False
while(chances < 3):
    user_guess = int(input("Guess the number between 0 - 99 \n>>> "))
    # take the input from the user
    guess_diffrence = abs(user_guess - number_to_guess)
    # this will calculate the difference and will get the absolute value
    # i.e if we get a negetive value it will be converted to positive, positive
    # will remain same

    if user_guess == number_to_guess:
        win_condition = True
        break
        # we are breaking the loop cause there is no need to continue
        # if we already won
    # this if condition will just check if you guessed the number and
    # will set the win condtion to true

    if user_guess < number_to_guess:
        print("\nGuess Higher")
    elif user_guess > number_to_guess:
        print("\nGuess Lower")
    # this if condtion will just let you know if you are above or below
    # the number to guess

    if guess_diffrence < 10:
        print("Extremely Close")
    elif guess_diffrence < 20:
        print ("Very Close")
    elif guess_diffrence < 30:
        print ("Close")
    elif guess_diffrence < 50:
        print("Half way there")
    else:
        print("Quite Far")
    # this if condtion will just let you know how far are you from
    # the number to guess

    chances += 1
    # Increase the value of chance by 1

if win_condition:
    print("You guessed the write number")
else:
    print("Better Luck next time :)")
    print("The number was", number_to_guess)
