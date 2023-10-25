import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class WordCounter2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Choose an option (1 for text input, 2 for file input): ");
    int option = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character
    String inputText = "";
        if (option == 1) {
            System.out.print("Enter a text: ");
            inputText = scanner.nextLine();
        } else if (option == 2) {
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();
            try {
                inputText = readFromFile(filePath);
            } catch (IOException e) {
                System.err.println("An error occurred while reading the file.");
                return;
            }
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
            return;
        }
        String[] words = splitIntoWords(inputText);
        int wordCount = countWords(words);
        System.out.println("Word count: " + wordCount);
    }
    public static String[] splitIntoWords(String input) {
        return input.split("[\\s,;.!?\"]+");
    }
    public static int countWords(String[] words) {
        return words.length;
    }
    public static String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(" ");
        }
        reader.close();
        return content.toString();
}
}