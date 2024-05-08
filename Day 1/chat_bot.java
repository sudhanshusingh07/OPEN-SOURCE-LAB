import java.util.Scanner;

public class chat_bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a simple chatbot. What's your name?");
        String userName = scanner.nextLine();
        System.out.println("Nice to meet you, " + userName + "!");

        // Chat loop
        while (true) {
            System.out.print(userName + ": ");
            String userInput = scanner.nextLine();
            String response = getResponse(userInput);
            System.out.println("ChatBot: " + response);

            // Exit the loop if the user inputs "bye"
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ChatBot: Goodbye, " + userName + "!");
                break;
            }
        }

        scanner.close();
    }

    // Simple echo function, you can replace it with more sophisticated logic
    private static String getResponse(String userInput) {
        return userInput;
    }
}
