package ua.com.qalight.java2;

/**
 * Created by emix on 3/28/14.
 */
public class Cat extends Animal implements Swimable{

    @Override
    protected void voice(){
        System.out.println("May! ");
    }

    @Override
    public void swim() {
        System.out.println("Cats can also swim");
    }
}
