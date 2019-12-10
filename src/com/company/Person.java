package com.company;

import java.util.function.Predicate;

public class Person {

    String name;
    int age;
    char sex;

    public Person(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public char getSex()
    {
        return sex;
    }

    public static Predicate<Person> dateAManPredicate = person -> person.getAge() > 18 && person.getAge() < 30 && person.getSex() == 'm';
    public static Predicate<Person> dateAWomanPredicate = person -> person.getAge() > 18 && person.getAge() < 30 && person.getSex() == 'f';


}
