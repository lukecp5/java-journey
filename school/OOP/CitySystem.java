package OOP;

import java.util.Scanner;
import java.util.ArrayList;

public class CitySystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SmallTowns smallTowns = new SmallTowns();

        smallTowns.inputCities(scnr);
        System.out.println("Maximum city population: " + smallTowns.findMaximumCityPopulation());
    }
}