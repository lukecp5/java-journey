import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MessageDecoder {
    public static String decode(String messageFile) {
        StringBuilder decodedMessage = new StringBuilder();
        Map<Integer, String> map = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(messageFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split(" ");
                int number = Integer.parseInt(parts[0]);
                String word = parts[1];
                map.put(number, word);
            }
            int row = 1;
            int position = 1;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (row * (row + 1) / 2 == position) {
                    decodedMessage.append(entry.getValue()).append(" ");
                    row++;
                }
                position++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return decodedMessage.toString().trim();
    }

    public static void main(String[] args) {
        String decodedMessage = decode("coding_qual_input.txt");
        System.out.println(decodedMessage);
    }
}
