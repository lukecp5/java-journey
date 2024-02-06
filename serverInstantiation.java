// Import the Server class from the correct location
import Server;

public class serverInstantiation {
    public static void main(String[] args) {
        Server server = new Server(32, "Intel Xeon", 500);
        System.out.println("Server RAM: " + server.ram);
        System.out.println("Server CPU: " + server.cpu);
        System.out.println("Server Storage: " + server.storage);
        
        System.out.println("server object: " + server);
        System.out.println("Server import: " + Server.class.toGenericString());
    }
}
