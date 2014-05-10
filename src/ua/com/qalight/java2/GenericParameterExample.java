package ua.com.qalight.java2;

import java.util.*;

/**
 * Created by emix on 5/10/14.
 */
public class GenericParameterExample {
    public static void main(String[] args) {
        GenericParameter<String, Integer> genericParameter1 = new GenericParameter<String, Integer>("first", 1);

        // this will not compile
//        GenericParameter<String, Integer> genericParameter1a = new GenericParameter<String, Integer>(1, "first");

        GenericParameter<? extends Number, ? extends Number> genericParameter2 = new GenericParameter<Integer, Integer>(1, 1);

        // will not compile
//        GenericParameter<Number, Number> genericParameter2a = new GenericParameter<Integer, Integer>(1, 1);

        // works fine
        GenericParameter<Number, Number> genericParameter3 = new GenericParameter<Number, Number>(1, 1);

        System.out.println(genericParameter1);
        System.out.println(genericParameter2);

//        List<?> listOfSomething = new List<?>();
        List<Number> listOfSomething = new ArrayList<Number>();

//        listOfSomething.add(new Object());
        listOfSomething.add(1);
        giveMeListWithSomething(listOfSomething);

        // will not compile
//        giveMeListWithAnyObject(listOfSomething);
//        giveMeListWithAnyObject(new ArrayList<Number>());
        giveMeListWithAnyObject(new ArrayList<Object>());

        giveMeListWithAnyNumberOrSubtype(new ArrayList<Integer>());

        List listNoGenerics = new ArrayList();
        giveMeListWithAnyObject(listNoGenerics);
        giveMeListWithSomething(listNoGenerics);

        // this will compile but you will get runtime exception
        // so prefer list with generic to help avoid ClassCastException(s)
//        giveMeListWithAnyNumberOrSubtype(listNoGenerics);


        List listObjects = new ArrayList(); // or new ArrayList<Object>()
        giveMeListWithAnyObject(listObjects);
        giveMeListWithSomething(listObjects);
        // this will compile but you will get runtime exception
        // so prefer list with generic to help avoid ClassCastException(s)
//        giveMeListWithAnyNumberOrSubtype(listObjects);

        List<Object> listOfDeclaredObjects = new ArrayList<Object>();
        // but List<Object >unlike with List will not compile the same previous method/ And this is good.
        //giveMeListWithAnyNumberOrSubtype(listOfDeclaredObjects);

        List listNumbers = new ArrayList<Number>();
        giveMeListWithAnyNumberOrSubtype(listNumbers);
        giveMeListWithAnyObject(listNumbers);
        giveMeListWithSomething(listNumbers);

        System.out.println(new ArrayList<Integer>().getClass() == new ArrayList<String>().getClass());  // will return true

        // look into the source of sort method inside:
        // public static <T> void sort(List<T> list, Comparator<? super T> c) {
        Collections.sort(new ArrayList<Comparable>(), new Comparator<Comparable>() {
            @Override
            public int compare(Comparable o1, Comparable o2) {
                return 0;
            }
        });
        // firts is must
        // http://www.ibm.com/developerworks/java/library/j-jtp04298/index.html
        // http://www.ibm.com/developerworks/library/j-jtp07018/

        // further reading
        // http://www.ibm.com/developerworks/java/library/j-jtp01255/index.html
        // http://www.angelikalanger.com/GenericsFAQ/JavaGenericsFAQ.html

    }

    static void giveMeListWithSomething(List<?> list) {
        // will not compile
//        list.add(new Object());
        // list.add(1);

        // will not compile
//        for (Number each : list){ }

        for (Object each : list){
            System.out.println(each);
        }
    }

    static void giveMeListWithAnyObject(List<Object> list) {
        // will not compile
        list.add(new Object());
        list.add(1);

        // will not compile
//        for (Number each : list){ }

        for (Object each : list){
            System.out.println(each);
        }
    }

    static void giveMeListWithAnyNumberOrSubtype(List<? extends Number> list) {
//        will not compile
//        list.add(new Object());
//        list.add(Integer.valueOf(1));
//        list.add(new Integer(3));

//        will not compile
        for (Number each : list){
            System.out.println(each);
        }

        // will not compile
//        for (Integer each : list){
//            System.out.println(each);
//        }

        for (Object each : list){
            System.out.println(each);
        }
    }
}
