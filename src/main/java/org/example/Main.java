package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().setAddress("Vietnam")
                .setAge(34)
                .setSurname("Zodchenko")
                .setName("Evgenii")
                .build();
        Person child = person.newChildBuilder()
                .setName("Olesya")
                .build();
        System.out.println(person);
        System.out.println(child);
        Person person1 = new PersonBuilder()
                .setAddress("Madagascar")
                .setName("Moto")
                .setSurname("Moto")
                .setAge(24)
                .build();
        person1.happyBirthday();
        System.out.println(person1);
    }
}