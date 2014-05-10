package ua.com.qalight.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by emix on 5/10/14.
 */
public class GenericsListTest {

    @Test
    public void testList() {
        List<Animal> list = new ArrayList();
        list.add(new Animal("boo", 34));
        list.add(new Dog("boo"));
        list.add(new Cat("boo"));
//        list.add(1);

        sayVoice(list);
    }

    @Test
    public void testSameArrayList() {
        assertEquals("classes should be equal", new ArrayList<Animal>().getClass(), new ArrayList<Integer>().getClass()) ;
    }

    @Test
    public void testBoxInteger() {
        Box<Integer> box = new Box<Integer>();
        box.setValue(0);
        // will not compile
//        box.setValue(new Object());

        Integer result = box.getValue();
        assertEquals(result, Integer.valueOf(0));
    }

    @Test
    public void testBoxString() {
        Box<String> box = new Box<String>();
        box.setValue("string");
        // will not compile
//        box.setValue(new Object());

        String result = box.getValue();
        assertEquals(result, "string");
    }

    @Test
    public void testBoxNumber() {
        Box<Number> box = new Box();
        box.setValue(Long.valueOf(1000L));
//        box.setValue(3);

        // will not compile
//        box.setValue(new Object());

        Number result = box.getValue();
        assertEquals(result, 1000L);
    }

    @Test
    public void testSetNumberBox() {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setValue(2);

        setNumber(integerBox);
    }

    void setNumber(Box<? extends Number> numberBox){
//        numberBox.setValue(5.5d);
        System.out.println(numberBox.getValue());
    }

    void sayVoice(List<Animal> animals){
        for (Animal eachAnimal : animals) {
            eachAnimal.voice();
        }
    }

    class Box<T> {
        T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

    }
}
