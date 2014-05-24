package ua.com.qalight.java2.tasks;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class NamesCounter {


    @Test
    public void testCounter() {
        // given
        final List<String> repeatableNames = Arrays.asList(
                "Sasha", "Sasha", "Sasha",
                "Vadim", "Vadim",
                "Oleg",
                "Stepan"
        );

        // when
        Map<String, Integer> actualMap = countNames(repeatableNames);

        // then
        final Map<String, Integer> expectedMap = createExpectedMap();
        assertEquals("maps should be equal", expectedMap, actualMap);

        System.out.println("actual result: " + actualMap.toString());
    }

    private Map<String, Integer> createExpectedMap() {
        final Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("Sasha", 3);
        expectedMap.put("Vadim", 2);
        expectedMap.put("Oleg", 1);
        expectedMap.put("Stepan", 1);
        return expectedMap;
    }

    public Map<String, Integer> countNames(List<String> repeatableNames) {
        final Map<String, Integer> resultMap = new HashMap<String, Integer>();

        for (String eachName : repeatableNames){
            if (resultMap.get(eachName) != null) {
                resultMap.put(eachName, resultMap.get(eachName) + 1);
            } else {
                resultMap.put(eachName, 1);
            }
        }

        return resultMap;
    }


}
