def get_response(user_input):
    return user_input

def main():
    print("Hello! I'm a simple chatbot. What's your name?")
    user_name = input()
    print("Nice to meet you, " + user_name + "!")

    # Chat loop
    while True:
        print(user_name + ": ", end="")
        user_input = input()
        response = get_response(user_input)
        print("ChatBot: " + response)

        # Exit the loop if the user inputs "bye"
        if user_input.lower() == "bye":
            print("ChatBot: Goodbye, " + user_name + "!")
            break

if __name__ == "__main__":
    main()
