package com.example.rex.demo.entity;

public class Person{
    String name;
    String age;
    String surname;
    
    // constructor
    public Person(String name, String age, String surname){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // getter
    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }
    public String getSurname(){
        return this.surname;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

}