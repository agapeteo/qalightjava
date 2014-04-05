package ua.com.qalight.java2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by emix on 3/28/14.
 */
public class Executor {

    public static void main(String[] args) {
        Executor executor = new Executor();
        Swimable dog = new Dog();
        Swimable cat = new Cat();
        Swimable fish = new Fish();

        List<Swimable> list = Arrays.asList(dog, cat, fish);

        for (Swimable each : list) {
            executor.swim(each);
        }

    }

    private void swim(Swimable swimable) {
        swimable.swim();
    }
    private void giveVoice(Animal animal){
        animal.voice();
    }

    private void printPersonName(Person person){
        System.out.println("Привет, меня зовут "
                + person.getFirstName() + " " + person.getLastName());
        System.out.println("мне "+ person.getAge() + " лет");
        System.out.println("Мой вес " + person.getWeight());
    }
}
