package Extends;

public class Animal {
    String name;
    int age;

    Animal() {
        System.out.println(" - Animal - ");
    }

    void walk() {
        System.out.println("Andando");
    }

    void breathe() {
        System.out.println(this.name+" está respirando");
    }

}