import java.util.ArrayList;
import java.util.List;

public class classPractice {
    public static void main(String[] args) {
        // Create an instance of the DataOrganizer class
        DataOrganizer dataOrganizer = new DataOrganizer();

        // Add some data to the organizer
        dataOrganizer.addData("Data 1");
        dataOrganizer.addData("Data 2");
        dataOrganizer.addData("Data 3");

        // Print the data stored in the organizer
        dataOrganizer.printData();

        System.out.println("Capacity: " + dataOrganizer.getCapacity());
        System.out.println("Updated Capacity: " + dataOrganizer.updateCapacity(1024000));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Count: " + dataOrganizer.count());
        System.out.println("Count: " + dataOrganizer.count());
        System.out.println("Count: " + dataOrganizer.count());
        System.out.println("Count: " + dataOrganizer.count());
        System.out.println("Count: " + dataOrganizer.count());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("dataOrganizer.capacity: " + dataOrganizer.getCapacity());
    }
}

class DataOrganizer {
    private List<String> data;
    private int capacity;
    public int count = 0;

    public DataOrganizer() {
        // Initialize the data list
        data = new ArrayList<>();
        capacity = 512000;
    }

    public int count() {
        // count++;
        return ++count;
    }

    public void addData(String newData) {
        // Add the new data to the list
        data.add(newData);
    }

    public List<String> getData() {
        // Return the data list
        return data;
    }

    public int getCapacity() {
        // Return the capacity of the data list
        return capacity;
    }

    public int updateCapacity(int newCapacity) {
        // Update the capacity of the data list
        capacity = newCapacity;
        return capacity;
    }

    public void printData() {
        // Print each data item in the list
        for (String item : data) {
            System.out.println(item);
        }
    }
}