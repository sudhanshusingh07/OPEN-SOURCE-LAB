import random

def guessing_number_game():
    number = random.randint(1, 100)  # Generate a random number between 1 and 100
    K = 5  # Number of trials

    print("sudhanshu: A number is chosen between 1 to 100.")
    print("Guess the number within 5 trials.")

    for i in range(K):
        guess = int(input("Guess the number: "))

        if number == guess:
            print("Congratulations! You guessed the number.")
            break
        elif number > guess and i != K - 1:
            print("The number is greater than", guess)
        elif number < guess and i != K - 1:
            print("The number is less than", guess)

    if i == K - 1:
        print("You have exhausted", K, "trials.")
        print("The number was", number)

def main():
    guessing_number_game()

if __name__ == "__main__":
    main()
