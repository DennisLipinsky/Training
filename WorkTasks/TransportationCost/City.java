package com.javarush.test.WorkTasks.TransportationCost;

/*
 * Class City. Contains a name of the city, an index, a number of its neighbours, a HashMap of neighbour indexes
 * and its costs presented as Integers.
 */
import java.util.HashMap;
import java.util.Map;

public class City {

    private String name;
    private int index;
    private int neighbours;
    private Map<Integer, Integer> cost = new HashMap<Integer, Integer>();

    public City(String name, int index, int neighbours)
    {
        this.name = name;
        this.index = index;
        this.neighbours = neighbours;
    }


    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public Map<Integer, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Integer, Integer> cost) {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", neighbours=" + neighbours +
                ", cost=" + cost +
                '}';
    }
}
