package ua.com.qalight.java2.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by emix on 5/10/14.
 */
public class WordFilter {
    Set<String> filterWords(List<String> unfilteredWords, Set<String> filters) {
        Set<String> result = new HashSet<String>(unfilteredWords.size());

        for (String eachWord: unfilteredWords){
            for (String eachFilter : filters){
                if (! eachWord.equals(eachFilter)){
                    result.add(eachWord);
                }
            }
        }

        return result;
    }
}
