package org.example;

public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private int age = -1;
    private String address = null;
    private boolean incorrectAge = false;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if(age <= 0){
            incorrectAge = true;
            return this;
        }else{
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build(){
        if(incorrectAge) {
                throw new IllegalArgumentException("Некорректный возраст");
        }
        if(name.equals(null) | surname.equals(null)){
            throw new IllegalStateException("Недостаточно данных");
        }
        return new Person(name, surname, age, address);
    }
}
