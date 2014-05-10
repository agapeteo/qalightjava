package ua.com.qalight.java2;

/**
 * Created by emix on 3/28/14.
 */
public class Animal {
    static {
        System.out.println("static init in Animal");
    }
    {
        System.out.println("non static init in Animal");
    }

    public Animal(){
        System.out.println("constructor start in Animal");
        // some logic

        System.out.println("constructor end in Animal");
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    protected String name;
    protected int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected void voice(){
        System.out.println("this is my voice");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


