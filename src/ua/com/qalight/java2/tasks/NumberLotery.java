package ua.com.qalight.java2.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class NumberLotery {
    public static final int MIN = 0;
    public static final int MAX = 10;
    Set<Integer> uniqueNumbers = new HashSet<Integer>();


    public static void main(String[] args) {
        NumberLotery lotery = new NumberLotery();
        Set<Integer> uniqueNumbers = lotery.generateUniqueNumbers();
        System.out.println(Arrays.toString(uniqueNumbers.toArray()));

        int myTestNumber = 3;
        boolean amIWinner = lotery.checkWin(myTestNumber);
        if (amIWinner) {
            System.out.println("WOW, I'm winner");
        } else {
            System.out.println("Try once again...");
        }
    }

    private boolean checkWin(int myTestNumber) {
        if (myTestNumber < 0 || myTestNumber > 10) {
            throw new IllegalArgumentException("your number is not in range 1-10: " + myTestNumber);
        }
        return uniqueNumbers.contains(myTestNumber);
    }

    private Set<Integer> generateUniqueNumbers() {
        while (uniqueNumbers.size()< 5){
            Random random = new Random();
            int randomNum = random.nextInt((MAX - MIN) + 1) + MIN;
            uniqueNumbers.add(randomNum);
        }
        return uniqueNumbers;
    }

}
