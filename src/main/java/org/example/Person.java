package org.example;

public class Person {
    private final String name;
    private final String surname;
    private int age = -1;
    private String address = null;
    public Person(String name, String surname, int age, String address){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public void happyBirthday(){
        if(hasAge()){
            age += 1;
        }
    }
    public boolean hasAge(){
        if(age < 0){
            return false;
        }else {
            return true;
        }
    }
    public boolean hasAddress(){
        if(address.equals(null)){
            return false;
        }else{
            return true;
        }
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public PersonBuilder newChildBuilder(){
        PersonBuilder child = new PersonBuilder();
        child.setAddress(address);
        child.setAge(6);
        child.setSurname(surname);
        return child;
    }
    public String toString(){
        if(!hasAge()){
            return "Name " + name + "\n" + "Surname " + surname + "\n" + "Address " + address;
        }if(!hasAddress()){
            return "Name " + name + "\n" + "Surname " + surname + "\n" + "age " + age;
        }if(!hasAge() & !hasAddress()){
            return "Name " + name + "\n" + "Surname " + surname;
        }else{
            return "Name " + name + "\n" + "Surname " + surname + "\n" + "age " + age + "\n" + "Address " + address;
        }
    }
}
