package org.example;

public class Main {
    public static void main(String[] args) {

        example1();

    }
    public static void example1(){
        Cat c = new Cat("Мурка");
        Dog d = new Dog("Бобик");
        Mouse m = new Mouse("Джерри");

        m.beScared(c);

        d.beScared(() -> System.out.println("Топ-топ!"));


    }

}