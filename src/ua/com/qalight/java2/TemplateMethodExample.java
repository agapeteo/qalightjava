package ua.com.qalight.java2;

import org.junit.Test;

import java.util.*;


public class TemplateMethodExample {

    static class Person {
        public void doAllSteps(){
            doFirst();
            doSecond();
            doThird();
        }

        public void doFirst(){
            System.out.println("first step finished");
        }

        public void doSecond(){
            System.out.println("first second as template");
        };

        public void doThird(){
            System.out.println("third step finished");
        }
    }
    static class Employee extends Person{

        @Override
        public void doSecond() {
            System.out.println("I'm doing second step as employee");
        }
    }

    static class Child extends Person{
        @Override
        public void doSecond() {
            System.out.println("I'm doing second step as child");
        }
        void playAsChild(){

        }
    }

    class Animal{
        protected void eat(){
            System.out.println("eating");
        };
    }
    class Fish extends Animal{
        protected void swim() {
            System.out.println("I'm swiming");
        }
    }

    class Piranha extends Fish{
        protected void bite(){
            System.out.println("I can bite");
        }
    }

    class Bird extends Animal{
        protected void fly(){
            System.out.println("I can fly");
        }
    }
    class Duck extends Bird{
        protected void dive(){
            System.out.println("I can dive");
        }
    }

    @Test
    public void animalLife() {
        List<Animal> allZooAnimal = Arrays.asList(new Piranha(), new Duck(), new Duck());

        showZooLife(allZooAnimal);
    }

    private void showZooLife(Collection<Animal> allZooAnimal) {

        for (Animal eachAnimal : allZooAnimal) {
            System.out.println();
            System.out.println("next animal of type " + eachAnimal.toString());
            eachAnimal.eat();

            if (eachAnimal instanceof Fish) {
                ((Fish) eachAnimal).swim();
                if (eachAnimal instanceof Piranha) {
                    ((Piranha) eachAnimal).bite();
                }
            }

            if (eachAnimal instanceof Bird) {
                Bird bird = (Bird) eachAnimal;
                bird.fly();
                if (bird instanceof Duck) {
                    Duck duck = (Duck) bird;
                    duck.dive();
                }
            }
        }
    }

    static class OldPerson extends Person{

    }

    @Test
    public void testPerson() {
        Person employee = new Employee();
        Person child = new Child();
        Person oldPerson = new OldPerson();

        List list = new ArrayList();
        list.add(employee);
        list.add(child);
        list.add(oldPerson);

//        List<Person> persons = Arrays.asList(employee, child, oldPerson);

        doSomethingWithPersons(list);
    }

    void  doSomethingWithPersons(List<Person> persons){
        for (Person eachPerson : persons){
            eachPerson.doAllSteps();
            System.out.println("-------");
        }
    }
}
