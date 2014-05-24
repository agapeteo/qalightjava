package ua.com.qalight.java2.zoo;


import java.util.ArrayList;
import java.util.List;

public class CollectionsAndArraysExample {


    public static void main(String[] args) {



        Animal dog = new Dog();
        Animal cat = new Cat();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);

        for (int i = 0; i < 10; i++) {
            animals.add(new Dog());
        }

        for (Animal animal : animals) {
            animal.voice();
        }


    }
}
