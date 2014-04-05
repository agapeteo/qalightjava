package ua.com.qalight.java2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emix on 3/28/14.
 */
public class Executor {

    public static void main(String[] args) {
        Executor e = new Executor();
        Animal dog = new Dog();
        Animal cat = new Cat();
        e.printMe(dog);
        e.printMe(cat);
    }

      void printMe(){
        System.out.println("this is void method");
    }

     void printMe(Animal i){
         if (i instanceof Cat){
             System.out.println("wow, this is cat!! ");
         }
        System.out.println("this is animal " + i);
    }

     void printMe(Cat s){
        System.out.println("this is cat " + s);
    }

     void printMe(Dog o){
        System.out.println("this is dog " + o);
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
