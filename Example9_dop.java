import java.util.Scanner;
public class Example9_dop {
    public static void main(String[] args) {
        String alphabet = "AZSXDCFVGBHNJMKQWPOERIUTYLazsxdcfvgbhnjmklqwpoeriuty";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String inputText = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(inputText, key, alphabet);
        System.out.println("Текст после преобразования: " + encryptedText);

        String decryptedText = decrypt(encryptedText, key, alphabet);


        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    public static String encrypt(String text, int shift, String alphabet) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (alphabet.indexOf(currentChar) == -1) {
                result.append(currentChar);
                continue;
            }

            int shiftedIndex = (alphabet.indexOf(currentChar) + shift) % alphabet.length();
            result.append(alphabet.charAt(shiftedIndex));
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift, String alphabet) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (alphabet.indexOf(currentChar) == -1) {
                result.append(currentChar);
                continue;
            }

            int shiftedIndex = (alphabet.indexOf(currentChar) - shift + alphabet.length()) % alphabet.length();
            result.append(alphabet.charAt(shiftedIndex));
        }

        return result.toString();
    }
}
