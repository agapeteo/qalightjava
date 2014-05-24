package ua.com.qalight.java2.zoo;

import org.junit.Test;
import ua.com.qalight.java2.company.Person;

import java.util.*;

import static junit.framework.Assert.assertTrue;

/**
 * Created by emix on 3/28/14.
 */
public class Executor {






    List<String> removeInvalidNames(List<String> names) {
        String[] exceptions = {"-", "," };
        List<String> result = new ArrayList<String>(names);

        for (String str : names) {
            for (String exception : exceptions){
                if (str.contains(exception)) {
                    result.remove(str);
                }
            }
        }

        return result;
    }


    @Test
    public void testRemoveInvalidNames() {
        // given
        List<String> example = Arrays.asList("Саша", "Са---ша", "Миша,");
        List<String> expected = Arrays.asList("Саша");

        // when
        List<String> actual = removeInvalidNames(example);
        System.out.println("actual = " + Arrays.toString(actual.toArray()));

        // then
        assertTrue(Arrays.equals(actual.toArray(), expected.toArray()));
    }

    @Test
    public void testNamesCounter() {
        printNamesCounter(
                Arrays.asList("Вася", "Коля", "Петя", "Вася", "Петя", "Вася",
                        "Коля", "Вася", "Петя", "Коля", "Вася" ));
    }

    @Test(expected = NumberFormatException.class)
    public void testParsingWrongIntDouble() {
        // this example how Integer can be created (not related to method name)
        Integer number = new Integer(0);
        Integer number2 = Integer.valueOf(0);
        Integer number3 = 0;
        Integer number4 = Integer.parseInt("0");
        Integer number5 = new Integer("0");
        int number6 = 0;

        Integer i = Integer.parseInt("345.45");
        System.out.println(i);
    }

    void printNamesCounter(List<String> names){
        Map<String, Integer> counter = new HashMap<String, Integer>();

        for (String eachName : names) {
            Integer foundValue = counter.get(eachName);
            if (foundValue == null) {
                counter.put(eachName, 1);
            } else {
                counter.put(eachName, ++foundValue);
            }
        }

        System.out.println(counter);

    }

    public Map<String, String> getPhoneNumberByName(String name) {
        Map<String, String> result = new HashMap<String, String>();

        // todo: implement
        return result;
    }




    void printAnimalName(Animal animal) {
        System.out.println("animal's name is " + animal.getName());
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
