package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {

        Person person1 = new Person("Agnieszka", 41, 'f');
        Person person2 = new Person("Dawid", 24, 'm');
        Person person3 = new Person("Karol", 13, 'm');
        Person person4 = new Person("Marta", 28, 'f');
        Person person5 = new Person("Kamil", 25, 'm');
        Person person6 = new Person("Weronika", 18, 'f');
        Person person7 = new Person("Igor", 30, 'm');
        Person person8 = new Person("Ewa", 19, 'f');

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8};

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8);

        List<Person> manThatCanBeDated = personList
                .stream()
                .filter(Person.dateAManPredicate)
                .collect(Collectors.toList());

        List<Person> womanThatCanBeDated = personList
                .stream()
                .filter(Person.dateAWomanPredicate)
                .collect(Collectors.toList());

        System.out.println("These are all men that you can date:");
        manThatCanBeDated.forEach(person -> System.out.println(person.name));

        System.out.println();
        System.out.println("These are all women that you can date");
        womanThatCanBeDated.forEach(person -> System.out.println(person.name));

        System.out.println();
        System.out.println("DATE APP: ");

        for (Person temp : people)
        {
            date(temp);
        }
    }

    public static void date(Person person) {
        if (person.dateAWomanPredicate.test(person)) {
            System.out.println("You are dating a woman: " + person.getName());
        } else if (person.dateAManPredicate.test(person)) {
            System.out.println("You are dating a man: " + person.getName());
        } else {
            System.out.println("Sorry! " + person.getName() + " doesn't match your requirements");
        }
    }
}
