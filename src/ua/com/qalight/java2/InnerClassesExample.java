package ua.com.qalight.java2;

import org.junit.Test;

import java.util.*;

/**
 * Created by emix on 5/17/14.
 */
public class InnerClassesExample {

    class InnerClass {

    }

    static void doSomething(){

    }

    @Test
    public void viewDiffNEstedClasses() {
        InnerClassesExample e = new InnerClassesExample();
//        e.doSomething(); // do not call static method on instance

        InnerClassesExample.doSomething();

        InnerClass innerClass;

        List list = Arrays.asList(" "); //static
        Set notModifiable = Collections.unmodifiableSet(new HashSet()); // static
        Set keySetFromMap = new HashMap().keySet(); // not-static. Adapter pattern

//        HashMap map = new HashMap().Entry; example of good implemented inner static class
        /*
        * imagine how it will waste space for each element if it was not static
        * */


        Collections.sort(list, new Comparator() {   // anonymous class -- function object. Strategy pattern
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        final String threadName = "cool thread";
        new Thread(new Runnable() {
            int i = 0;

            // static int x = 0; // will not compile because of "static" word
            @Override
            public void run() {
                System.out.println("I'm in new thread: " + giveString() + threadName); // threadName should declared final
            }
        }).start();
//        Local local = new Local(); // will not compile - should be after declaration

        class Local {
            public final Object obj = new Object(); // or effectively final
            //            static int x = 0; // will not compile because of "static" word (UNLIKE inner classes and LIKE anonymous)
            static final float PI = 2.13f; // but constants are OK

            public void doSomething() {
                System.out.println("doing something");
            }

        }

        Local local = new Local();
        System.out.println(local.obj);
        local.doSomething(); // valid in java 8
    }

    @Test
    public void testUnmodifiedList() {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> unmodified = Collections.unmodifiableList(list);

        readList(unmodified);

        System.out.println(list);
    }

    void readList(List<Integer> list) {

//        list.add(10); // will trow UnsupprtedOperationException

    }

    String giveString() {
        return "String";
    }
}
