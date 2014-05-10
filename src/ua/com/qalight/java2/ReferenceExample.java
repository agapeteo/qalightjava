package ua.com.qalight.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emix on 5/3/14.
 */
public class ReferenceExample {

    @Test
    public void testIntReference() {
        int x = 5;
        int z = multiplyBy2(x);
        System.out.println("x = " + x);
        System.out.println("result = " + z);
    }

    private int multiplyBy2(int x) {
        x = 0;
        return x * 2;
    }


    private String appendString(String s) {
        return s + " -- ";
    }

    @Test
    public void testObjectTypeReference() {
        int x = 0;
        int y = x;
        x = 1;
        System.out.println(y);

//        List originalList = new ArrayList();
//        originalList.add("0");
//
//        List resultList = appendToList(originalList);
//
//        System.out.println("original list " + Arrays.toString(originalList.toArray()));
//        System.out.println(originalList.hashCode());
//
//        System.out.println("result list " + Arrays.toString(resultList.toArray()));
//        System.out.println(resultList.hashCode());
    }

    private List appendToList(List list) {
        List result = new ArrayList();
        result.add("1");
        return result;
    }




}
