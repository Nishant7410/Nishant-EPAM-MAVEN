package org.example;

import java.util.*;

public class Child {
    String name;
    int age;
    Vector<Gift> gifts=new Vector<Gift>();

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void give(Gift gift,Child child)
    {
        child.take(gift);
    }
    public void take(Gift gift)
    {
        gifts.add(gift);
    }
    public void show()
    {
        System.out.print(this.name+": ");
        for(Gift gift:gifts)
        {
            System.out.println(gift.sl+" Total Weight="+gift.totalWeight()+"g Message="+gift.message);
        }
    }
}
