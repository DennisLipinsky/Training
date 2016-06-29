package com.javarush.test.WorkTasks.TransportationCost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityTest{

    public static void main(String[] args) throws IOException
    {
        // Creating a list of Cities
        List<City> cities = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading positive number of tests not more than 10  and cities not more than 10000
        int test = -1;
        int number = -1;
        while (((test <= 0) || (test > 10)) && ((number <= 0) || (number > 10000)))
        {
            System.out.println("Set the number of tests.");
            test = Integer.parseInt(reader.readLine());
            System.out.println("Set the number of cities.");
            number = Integer.parseInt(reader.readLine());
        }

        // Filling list of Cities
        for (int index = 0; index < number; index++) {

            // Reading City name in lower case. The length of City name should be less than 10 or equal
            String name;
            while (true) {
                System.out.println("Enter the name of city.");
                name = reader.readLine().toLowerCase();
                if ((!name.isEmpty()) && (name.length() <= 10)) {
                    break;
                }
            }

            // Reading the number of neighbours for the City. It should be positive and less than 10 or equal
            int neighbours;
            while (true) {
                System.out.println("Set the numbers of neighbours.");
                neighbours = Integer.parseInt(reader.readLine());
                if ((neighbours > 0) && (neighbours <= 10)) {
                    break;
                }
            }

            int cityIndex = index + 1;
            // Creating a new City with known parameters
            City city = new City (name, cityIndex, neighbours);

            // Creating a HashMap of neighbour indexes and its costs presented as Integers.
            Map<Integer, Integer> cost = new HashMap<Integer, Integer>();

            for (int neighbour = 0; neighbour < neighbours; neighbour++) {
                int connectionIndex;
                int connectionCost;

                // Reading neighbour indexes and its costs and putting them into the Map
                while (true) {
                    System.out.println("Set the index of a connected city.");
                    connectionIndex = Integer.parseInt(reader.readLine());
                    System.out.println("Set the transportation cost to the connected city.");
                    connectionCost = Integer.parseInt(reader.readLine());
                    if((connectionIndex > 0) && (connectionCost > 0)) {
                        break;
                    }
                }
                cost.put(connectionIndex, connectionCost);
            }

            // Setting the filled Map into the City
            city.setCost(cost);
            System.out.println(city.toString());

            // Adding City to the list
            cities.add(city);
        }

        System.out.println("Enter the name of the source city.");
        String cityFrom = reader.readLine().toLowerCase();
        System.out.println("Enter the name of the destination city.");
        String cityTo = reader.readLine().toLowerCase();
        System.out.println("The minimum transportation cost from city " + cityFrom + " to " + cityTo + " is");
        System.out.println(minimumCost(cityFrom, cityTo, cities));

        System.out.println("Enter the name of the source city.");
        cityFrom = reader.readLine().toLowerCase();
        System.out.println("Enter the name of the destination city.");
        cityTo = reader.readLine().toLowerCase();
        System.out.println("The minimum transportation cost from city " + cityFrom + " to " + cityTo + " is");
        System.out.println(minimumCost(cityFrom, cityTo, cities));

        // Closing the Reader
        reader.close();
    }


    public static int minimumCost(String cityName1, String cityName2, List<City> cities) {

        // Getting source and destination cities
        City cityFrom = null;
        City cityTo = null;
        int minCost = 100000;
        int cost = 0;

        // Searching cities with the specified names in the list
        for (City city : cities) {
            if (cityName1.equals(city.getName())) {
                cityFrom = city;
            }
            if (cityName2.equals(city.getName())) {
                cityTo = city;
            }
        }

        // Creating an array of visited cities
        boolean visited[] = new boolean[cities.size()];

        for (int i = cityFrom.getIndex() - 1; i < cityTo.getIndex() - 1; i++) {
            Map<Integer, Integer> cityMap = cities.get(i).getCost();

            // Searchin the minimal cost from the city to its neighbours
            for (Map.Entry<Integer, Integer> pair : cityMap.entrySet()) {
                int conCity = pair.getKey();
                if(!visited[conCity - 1]) {
                    int conCost = pair.getValue();
                    if(conCost <= minCost) {
                        minCost = conCost;
                    }
                }
            }
            cost += minCost;
            // Marking this city as visited
            visited[i] = true;
        }
        return cost;
    }
}
