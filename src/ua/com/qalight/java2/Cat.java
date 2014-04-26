package ua.com.qalight.java2;

/**
 * Created by emix on 3/28/14.
 */
public class Cat extends Animal implements Swimable, Comparable {

    public Cat() {
        this("no name");
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected void voice(){
        System.out.println("May! ");
    }

    @Override
    public void swim() {
        System.out.println("Cats can also swim");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return 1;
    }


    @Override
    public int compareTo(Object o) {
        Cat cat = (Cat) o;
        return cat.name.compareTo(this.name);
    }
}
