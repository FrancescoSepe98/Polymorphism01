package it.develhope.polymorphism01;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------Start----------------------------");
        Animal lyon = new Animal("Leo");
        System.out.println(lyon.animalSound());
        System.out.println("-------------------------------------------------------------");
        System.out.println(lyon.animalSound(100));//High intensity roar test
        System.out.println("-------------------------------------------------------------");
        System.out.println(lyon.animalSound(23));//Low intensity roar test
        System.out.println("-------------------------------------------------------------");
        System.out.println(lyon.animalSound(-100000000));//invaluable intensity
        System.out.println("----------------------------End------------------------------");
    }
}