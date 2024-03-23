package archive;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Decode {
    public static void main(String[] args) {
        String decodedMessage = decode("message.txt");
        System.out.println(decodedMessage);
    }

    public static String decode(String messageFile) {
        StringBuilder decodedMessage = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(messageFile))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int number = Integer.parseInt(parts[0]);
                String word = parts[1];

                if (number == lineNumber) {
                    decodedMessage.append(word).append(" ");
                    lineNumber++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return decodedMessage.toString().trim();
    }
}
