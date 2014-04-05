package ua.com.qalight.java2;

/**
 * Created by emix on 3/28/14.
 */
public class Dog extends Animal implements Swimable {

    @Override
    protected void voice(){
        System.out.println("Bark! ");
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swim");
    }
}
