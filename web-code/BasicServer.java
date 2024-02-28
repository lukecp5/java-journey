/**
 * A basic HTTP server that listens for incoming requests and sends back an HTML file as the response.
 */
import java.io.*;
import java.net.*;

public class BasicServer {
    public static void main(String[] args) throws IOException {
        int port = 8080; //!Change this to the desired port number

        ServerSocket serverSocket = new ServerSocket(port); //!Create a server socket to listen for incoming connections
        System.out.println("Server started on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept(); //!Accept a client connection

            //!Read the request from the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 

            //!Send the response to the client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            //!  Read the first line of the request
            String request = in.readLine(); 
            System.out.println("Received request: " + request);

            //!Check if the request is a GET request
            if (request.startsWith("GET")) { 
                //! Send the HTTP response status code
                out.println("HTTP/1.1 200 OK"); 
                //! Send the content type header
                out.println("Content-Type: text/html"); 
                out.println();

                //! Read the HTML file and send it as the response
                //! Specify the path to the HTML file
                File file = new File("./index.html"); 
                
                //! Read the HTML file
                BufferedReader fileReader = new BufferedReader(new FileReader(file)); 
                String line;
                while ((line = fileReader.readLine()) != null) { //! Read each line of the HTML file
                    out.println(line); //! Send the line as part of the response
                }
                fileReader.close(); //!Close the file reader
            } else {
                out.println("HTTP/1.1 400 Bad Request"); //!Send a 400 Bad Request response for non-GET requests
            }

            out.close(); //!Close the output stream
            in.close(); //!Close the input stream
            clientSocket.close(); //!Close the client socket
        }
    }
}
