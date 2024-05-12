package OOP;

import java.util.Scanner;
import java.util.ArrayList;

public class SmallTowns {
    private ArrayList<City> cityList = new ArrayList<City>();

    public void inputCities(Scanner scnr) {
        City currCity;
        String currName;
        int currPopulation;
        int cityCount;
        int i;

        cityCount = scnr.nextInt();
        for (i = 0; i < cityCount; ++i) {
            currName = scnr.next();
            currPopulation = scnr.nextInt();
            currCity = new City();
            currCity.setNameAndPopulation(currName, currPopulation);
            cityList.add(currCity);
        }
    }

    public int findMaximumCityPopulation() {
        int maxPopulation;
        int maxPopulationIndex;
        int i;

        maxPopulation = cityList.get(0).getPopulation();
        maxPopulationIndex = 0;
        for (i = 1; i < cityList.size(); ++i) {
            if (cityList.get(i).getPopulation() > maxPopulation) {
                maxPopulation = cityList.get(i).getPopulation();
                maxPopulationIndex = i;
            }
        }
        return maxPopulation;
    };

}