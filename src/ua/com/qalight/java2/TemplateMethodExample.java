package ua.com.qalight.java2;

import org.junit.Test;

import java.util.*;


public class TemplateMethodExample {

    class Animal{
        protected void life() {
            eat();
        }

        protected void eat(){
            System.out.println("eating");
        }

    }
    class Fish extends Animal{
        @Override
        protected void life(){
            super.life();
            swim();
        }
        protected void swim() {
            System.out.println("I'm swiming");
        }
    }

    class Piranha extends Fish{
        @Override
        protected void life(){
            super.life();
            bite();
        }
        protected void bite(){
            System.out.println("I can bite");
        }
    }

    class Bird extends Animal {
        protected void fly() {
            System.out.println("I can fly");
        }

        @Override
        protected void life() {
            super.life();
            fly();
        }
    }

    class Duck extends Bird{
        @Override
        protected void life(){
            super.life();
            dive();
        }
        protected void dive(){
            System.out.println("I can dive");
        }
    }

    class Mammal extends Animal{
        protected void feedMilk(){
            System.out.println("I can feed milk");
        }

        @Override
        protected void life(){
            super.life();
            feedMilk();
        }
    }

    class Cow extends Mammal{
        protected void giveMilk(){
            System.out.println("I can also give a milk to people");
        }

        @Override
        public void life(){
            super.life();
            giveMilk();
        }

    }

    @Test
    public void animalLife() {
        List<Animal> allZooAnimal = Arrays.asList(new Piranha(), new Duck(), new Duck(), new Cow());

        showZooLife(allZooAnimal);
    }

    private void showZooLife(Collection<Animal> allZooAnimal) {
        for (Animal eachAnimal : allZooAnimal) {
            System.out.println("next animal is " + eachAnimal.toString());
            eachAnimal.life();
        }
    }


}
