package Task2;

import java.util.ArrayList;
import java.util.Collections;

public class Task2Client {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,
                4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5,
                -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3);

        ArraySearch arraySearch = new ArraySearch();

        System.out.println("-----TASK 2A-----");
        arraySearch.findAllConsecutiveSubArrays(0, numbers);

        System.out.println("-----TASK 2B-----");
        arraySearch.checkIfPairIsZero(numbers);

        System.out.println("-----TASK 2C-----");
        arraySearch.findIndexOfSmallestNumber(numbers);
        arraySearch.findIndexOfBiggestNumber(numbers);

    }
}
