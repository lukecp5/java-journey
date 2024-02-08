import java.io.*;
import java.net.*;

public class BasicServer {
    public static void main(String[] args) throws IOException {
        int port = 8080; // Change this to the desired port number

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String request = in.readLine();
            System.out.println("Received request: " + request);

            if (request.startsWith("GET")) {
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html");
                out.println();

                // Read the HTML file and send it as the response
                File file = new File("./index.html");
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    out.println(line);
                }
                fileReader.close();
            } else {
                out.println("HTTP/1.1 400 Bad Request");
            }

            out.close();
            in.close();
            clientSocket.close();
        }
    }
}
