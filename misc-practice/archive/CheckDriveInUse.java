import java.io.File;
import java.io.IOException;

public class CheckDriveInUse {

    public static void main(String[] args) throws IOException {

        // Get the list of all drives on the system
        File[] drives = File.listRoots();
        // System.out.println("drives: " + drives[0]);
        if (drives != null && drives.length > 0) {
            for (File aDrive : drives) {
                System.out.println(aDrive);
            }

            if (drives != null && drives.length > 0) {
                for (File aDrive : drives) {
                    System.out.println("Drive Letter: " + aDrive);
                    System.out.println("\tTotal space: " + aDrive.getTotalSpace());
                    System.out.println("\tFree space: " + aDrive.getFreeSpace());
                    System.out.println(aDrive.getPath());
                }
            }
        }
        // Iterate over the drives and check if they are in use
        for (File drive : drives) {
            if (drive.exists()) {
                // Get the list of all open files on the drive
                File[] files = drive.listFiles();

                // If there are any open files, the drive is in use
                if (files != null && files.length > 0) {
                    System.out.println(drive.getName() + " is in use.");
                } else {
                    System.out.println(drive.getName() + " is not in use.");
                }
            }
        }
    }
}