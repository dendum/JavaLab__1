package com.company;

record Add(String name, int speed, int mass, String species, int age)
{

    public Add(String name, int speed, int mass)
    {
        this(name, speed, mass, "black", 4);
    }
    public Add()
    {
        this("andrew", 10, 20, "Sea", 5);
    }

    @Override
    public String toString()
    {
        return "name:"+name+"\nspeed:"+speed+"\nprice:"+mass+"\nspecies:"+species+"\nage:"+age;
    }

}
