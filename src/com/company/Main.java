package com.company;

public class Main {
    public static void main(String[] args)
    {
        Add first = new Add();
        Add second = new Add("All About Money", 200000, 5000000);
        Add third = new Add("Time", 350000, 750000, "London", 250);


        System.out.println("\n");
        System.out.println(first);
        System.out.println("\n");
        System.out.println(second);
        System.out.println("\n");
        System.out.println(third);
        System.out.println("\n");

        /*
    адреса
    сума коштів, якою оперує компанія
    кількість інвестованих коштів

     */

    }
}
