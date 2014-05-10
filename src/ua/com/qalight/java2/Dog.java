package ua.com.qalight.java2;


/**
 * Created by emix on 3/28/14.
 */
public class Dog extends Animal implements Swimable {

    public static int dogsCount = 0;

    public Dog(String name) {
        super(name, 0);
    }

    public Dog() {
        dogsCount++;
    }

    @Override
    protected void voice(){
        System.out.println("Bark! ");
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swim");
    }
}
