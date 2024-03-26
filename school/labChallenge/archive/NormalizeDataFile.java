import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> data = loadData("labChallenge\\data2.dat");
        normalize(data);
        saveData(data);

    }

    /*
     * Will return (as a double) the average of all the values in the Arraylist.
     */
    public static double getAverage(ArrayList<Double> data) {
        double sum = 0;
        for (double val : data) {
            sum += val;
        }

        return sum / data.size();
    }

    /*
     * return (as a double) the minimum of all the values in the Arraylist. Remember
     * that to find the minimum
     * of a list of values, you will need to search through the list and keep track
     * of the smallest value you have
     * seen so far.
     */
    public static double getMin(ArrayList<Double> data) {
        double min = data.get(0);
        for (double num : data)
            min = Math.min(num, min);

        return min;
    }

    // return (as a double) the maximum of all the values in the Arraylist.
    public static double getMax(ArrayList<Double> data) {
        double max = data.get(0);
        for (double num : data)
            max = Math.max(num, max);

        return max;
    }

    public static void center(ArrayList<Double> data) {
        double avg = getAverage(data);

        // Use avg and current values of data to center data
        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i) - avg);
        }
    }

    public static void scale(ArrayList<Double> data, double newRange) {
        double min = getMin(data);
        double max = getMax(data);
        double range = max - min;
        double scaleFactor = newRange / range;

        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i) * scaleFactor);
        }
    }

    public static void normalize(ArrayList<Double> data) {
        center(data);
        scale(data, 100.00);
    }

    public static ArrayList<Double> loadData(String fileName) throws IOException {
        ArrayList<Double> data = new ArrayList<Double>();

        FileInputStream fis = new FileInputStream(fileName);
        Scanner in = new Scanner(fis);

        while (in.hasNextDouble()) {
            double val = in.nextDouble();
            data.add(val);
        }

        return data;
    }

    public static void saveData(ArrayList<Double> data) throws IOException {
        FileOutputStream fos = new FileOutputStream("labChallenge\\normal.dat");
        PrintWriter wrt = new PrintWriter(fos);

        for (int i = 0; i < data.size(); i++) {
            wrt.printf("%.2f\n", data.get(i));
            System.out.println(data.get(i));
        }
        // wrt.flush();
        // fos.close();
        wrt.close();
    }
}
