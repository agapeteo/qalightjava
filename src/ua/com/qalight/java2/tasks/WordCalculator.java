package ua.com.qalight.java2.tasks;

import org.junit.Test;
import ua.com.qalight.java2.zoo.Animal;

import java.util.*;

/**
 * Created by emix on 5/10/14.
 */
public class WordCalculator {
    public static final boolean ASC = true;
    public static final boolean DESC = false;
    WordFilter filter = new WordFilter();

    @Test
    public void testSplit() {
        final String text = "Васька Рыжик Мурзик Барсик";
        String[] names = text.split(" ");
        System.out.println(Arrays.toString(names));
    }

    @Test
    public void testSortAnimal() {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("zabra", 120));
        animals.add(new Animal("zabra", 50));
        animals.add(new Animal("cat", 5));
        animals.add(new Animal("cat", 15));
        animals.add(new Animal("cat", 7));

        Collections.sort(animals, new AnimalComarator(ASC));
        System.out.println(animals);

        Collections.sort(animals, new AnimalComarator(DESC));
        System.out.println(animals);
    }

    @Test
    public void testFilter() {

        Set<String> filtered = filter.filterWords(new ArrayList<String>(), new HashSet<String>());
    }



    public static class AnimalComarator implements Comparator<Animal> {

        private boolean isAscending;

        public AnimalComarator(boolean isAscending) {
            this.isAscending = isAscending;
        }

        @Override
        public int compare(Animal o1, Animal o2) {
            // check for null
            int nameEqual;
            if (isAscending) {
                nameEqual = o1.getName().compareTo(o2.getName());
            } else {
                nameEqual = o2.getName().compareTo(o1.getName());
            }
            if (nameEqual != 0) {
                return nameEqual;
            } else {
                if (isAscending) {
                    return Integer.valueOf(o1.getWeight()).compareTo(Integer.valueOf(o2.getWeight()));
                } else {
                    return Integer.valueOf(o2.getWeight()).compareTo(Integer.valueOf(o1.getWeight()));
                }
            }
        }
    }


}
