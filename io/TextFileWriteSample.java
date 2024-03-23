import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWriteSample {
    public static void main(String[] args) throws IOException {
        //! Create a new FileOutputStream object with the file name "outputTestFile.txt"
        FileOutputStream fileOutput = new FileOutputStream("outputTestFile.txt");
        //! This allows us to write to the file that we created or are editing

        
        //INFO:   parameter so that the PrintWriter can write to the file
        //// Create a new PrintWriter object with the FileOutputStream object as a
        PrintWriter writer = new PrintWriter(fileOutput);
        

        // Method to separate FileOutputStream object creation and it's initialization
        // FileOutputStream fileOutput = null;
        // fileOutput = new FileOutputStream("outputTestFile.txt");


        // Use the "writer" PrintWriter object to write content to the file
        writer.println("----- This is a test file -----\n");
        writer.println("--------------------------------\n");
        for (int i = 0; i < 30; i++) {
            writer.println("This is line " + i);
        }


        // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        //INFO: Use the "systemOutPrinter" PrintWriter object to write content to the console
        PrintWriter systemOutPrinter = new PrintWriter(System.out);
        //INFO: This will print to the console, not the file so we don't need to use a fileOutput object
        systemOutPrinter.println("This is a test");

        // Flush the PrintWriter to ensure all content is written to the file
        systemOutPrinter.flush();

        // Close the PrintWriter and FileOutputStream objects to release resources
        writer.close();
        fileOutput.close();
    }
}
