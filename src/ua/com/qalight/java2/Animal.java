package ua.com.qalight.java2;

/**
 * Created by emix on 3/28/14.
 */
public class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void voice(){
        System.out.println("this is my voice");
    }
}


