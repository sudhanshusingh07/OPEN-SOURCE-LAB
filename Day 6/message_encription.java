public class message_encription {
    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Encrypt uppercase letters
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) ((ch + shift - 'A') % 26 + 'A');
                encryptedMessage.append(encryptedChar);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) ((ch + shift - 'a') % 26 + 'a');
                encryptedMessage.append(encryptedChar);
            }
            // Preserve non-alphabetic characters
            else {
                encryptedMessage.append(ch);
            }
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String encryptedMessage, int shift) {
        // Decryption is simply encryption with negative shift
        return encrypt(encryptedMessage, -shift);
    }

    public static void main(String[] args) {
        String message = "Hello, World!";
        int shift = 3;

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
