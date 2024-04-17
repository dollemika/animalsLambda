package org.example;

public class Dog extends Animal implements Loud{

    public Dog(String s) {
        super(s);
    }

    @Override
    public void runAway() {
        System.out.println("Собака "+super.name+" убегает.");
    }

    @Override
    public void speak() {
        System.out.println("Собака "+super.name+" говорит гав-гав!");
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
