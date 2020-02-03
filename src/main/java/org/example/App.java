package org.example;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of children");
        String name=sc.next();
        System.out.println("Enter the age of children");
        int age=sc.nextInt();
        Child child1=new Child(name,age);
        System.out.println("Enter the name of children");
        name=sc.next();
        System.out.println("Enter the age of children");
        age=sc.nextInt();
        Child child2=new Child(name,age);

        System.out.println("Enter the name of chocolate");
        String choconame=sc.next();
        System.out.println("Enter the weight of chocolate");
        int chocoweight=sc.nextInt();
        System.out.println("Enter the calories in chocolate");
        int chococal=sc.nextInt();
        System.out.println("Enter the price of chocolate");
        int chocoprice=sc.nextInt();
        Sweets chocolate1=new Choco(choconame,chocoweight,chococal,chocoprice);

        System.out.println("Enter the name of chocolate");
        choconame=sc.next();
        System.out.println("Enter the weight of chocolate");
        chocoweight=sc.nextInt();
        System.out.println("Enter the calories in chocolate");
        chococal=sc.nextInt();
        System.out.println("Enter the price of chocolate");
        chocoprice=sc.nextInt();
        Sweets chocolate2=new Choco(choconame,chocoweight,chococal,chocoprice);

        System.out.println("Enter the name of cake");
        String cakename=sc.next();
        System.out.println("Enter the weight of cake");
        int cakeweight=sc.nextInt();
        System.out.println("Enter the calories in cake");
        int cakecal=sc.nextInt();
        System.out.println("Enter the price of cake");
        int cakeprice=sc.nextInt();
        Sweets cake=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Enter the name of cake");
        cakename=sc.next();
        System.out.println("Enter the weight of cake");
        cakeweight=sc.nextInt();
        System.out.println("Enter the calories in cake");
        cakecal=sc.nextInt();
        System.out.println("Enter the price of cake");
        cakeprice=sc.nextInt();
        Sweets cake1=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Enter the name of candy");
        String candyname=sc.next();
        System.out.println("Enter the weight of candy");
        int candyweight=sc.nextInt();
        System.out.println("Enter the calories in candy");
        int candycal=sc.nextInt();
        System.out.println("Enter the price of candy");
        int candyprice=sc.nextInt();
        Sweets candy=new Candy(candyname,candyweight,candycal,candyprice);

        System.out.println("Enter the name of candy");
        candyname=sc.next();
        System.out.println("Enter the weight of candy");
        candyweight=sc.nextInt();
        System.out.println("Enter the calories in candy");
        candycal=sc.nextInt();
        System.out.println("Enter the price of candy");
        candyprice=sc.nextInt();
        Sweets candy1=new Candy(candyname,candyweight,candycal,candyprice);


        Vector<Sweets> a1=new Vector<Sweets>();
        a1.add(chocolate1);
        a1.add(cake);
        a1.add(candy);
        Vector<Sweets> a2=new Vector<Sweets>();
        a2.add(chocolate2);
        a2.add(cake1);
        a2.add(candy1);
        Gift gift1=new Gift(a1,"Happy New Year");
        Gift gift2=new Gift(a2,"lots of wishes");
        child1.give(gift1,child1);
        child2.give(gift2,child2);
        child1.show();
        child2.show();
    }
}
