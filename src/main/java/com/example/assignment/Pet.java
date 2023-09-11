package com.example.assignment;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Pet implements Serializable {
    String type,name;
    int age;

    public Pet() {
    }

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise(){
        if(this.type.contains("cat"))
        System.out.println(this.name + "cat says meow");}
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
