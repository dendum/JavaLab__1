package com.company;

public class Main {
    public static void main(String[] args)
    {
        Add one = new Add();
        Add two = new Add("Pashka", 50, 20);
        Add three = new Add("Differential", 20, 10, "Oksana", 6);


        System.out.println("\n \n");
        System.out.println(one);
        System.out.println("\n \n");
        System.out.println(two);
        System.out.println("\n \n");
        System.out.println(three);
        System.out.println("\n \n");

    }
}
