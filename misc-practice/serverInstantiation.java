
// Import the Server class from the correct location
import Server;

public class serverInstantiation{
    public static void main(String[] args) {
        Server server = new Server(32, "Intel Xeon", 500);
        System.out.printf("Server RAM: %-16f\n", server.ram);
        System.out.printf("Server CPU: %-16s\n", server.cpu);
        System.out.printf("Server Storage: %-16f\n", server.storage);
    }
}
