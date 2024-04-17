package org.example;

public class Cat extends Animal implements Loud{


    public Cat(String s) {
        super(s);
    }

    @Override
    public void runAway() {
        System.out.println("Кот "+super.name+" убегает.");
    }

    @Override
    public void speak() {
        System.out.println("Кот "+super.name+" мур-р-р-р-р!");
    }
    @Override
    public void beScared(Loud a) {
        a.beLoudAndScare();
        speak();
        runAway();
    }
    @Override
    public void beLoudAndScare() {
        speak();
    }
}
