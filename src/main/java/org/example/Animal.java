package org.example;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    };
    public void runAway(){};
    public void speak(){};
    public void beScared(Loud animal){};
}
