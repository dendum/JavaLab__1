package com.company;

record Add(String name, int money, int allMoney, String address, int workers)
{

    public Add(String name, int money, int allMoney)
    {
        this(name, money, allMoney, "New York", 150);
    }
    public Add()
    {
        this("Private Company", 100000, 1000000, "Seattle", 100);
    }

    @Override
    public String toString()
    {
        return "Name: "+ name +"\nOperated money: "+ money +"$\nAll invested money: "+ allMoney +"$\nAddress: "+ address +"\nWorkers: "+ workers;
    }
}
