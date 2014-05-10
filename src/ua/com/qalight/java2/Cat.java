package ua.com.qalight.java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emix on 3/28/14.
 */
public class Cat extends Animal implements Swimable, Comparable {
    static{
        System.out.println("static init in Cat");
    }

    private final List list;


    public Cat(String name) {
        super(name, 0);
        list = new ArrayList();
    }

    public Cat() {
        super();
        System.out.println("constructor in cat begin");

        list = new ArrayList();

        System.out.println("constructor in cat end");
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
