package org.example;

public class Mouse extends Animal{

    Loud scaredBy;
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void runAway() {
        System.out.println("Мышь "+super.name+" убегает.");
    }

    @Override
    public void speak() {
        System.out.println("Мышь "+super.name+" говорит а-а-а!");
    }
    @Override
    public void beScared(Loud a){
        a.beLoudAndScare();
        speak();
        runAway();
    };
}
