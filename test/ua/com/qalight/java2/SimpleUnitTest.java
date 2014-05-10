package ua.com.qalight.java2;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SimpleUnitTest {
    private List list;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClasss(){
        System.out.println("this is after class");
    }

    @Before
    public void prepare() {
        list = new ArrayList();
        System.out.println("before method");
    }

    @After
    public void cleanUp(){
        System.out.println("after method");
    }


    @Test
    public void testList() {
        list.add(1);
        System.out.println(list);
    }

    @Test
    public void testListSecond() {
        list.add(2);
        System.out.println(list);
    }

    @Test(expected = NullPointerException.class)
    public void any() {
        insertNotNull(null);
    }

    @Test
    public void testEquals(){
        assertEquals("one", "one");
    }

    void insertNotNull(Object o){
        if (o ==null) throw new NullPointerException("object should not be null");
        // other logic
    }

}
