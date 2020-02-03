package org.example;

public abstract class Sweets implements Comparable<Sweets> {
    String name;
    int weight;
    int calories;
    int price;

    public Sweets(String name, int weight, int calories,  int price) {
        this.name = name;
        this.weight = weight;
        this.calories=calories;
        this.price = price;
    }


    public int compareTo(Sweets s1)
    {
        return this.calories-s1.calories;
    }
    public String toString()
    {
        return name;
    }
}
