package labChallenge;

import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

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

        return 0.0;
    }

}
