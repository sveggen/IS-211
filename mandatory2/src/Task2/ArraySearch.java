package Task2;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySearch {

    static ArrayList<Integer> startingNumbers = new ArrayList<>();

    public ArraySearch() {
        Collections.addAll(startingNumbers, 4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11,
                20, 1, 2, 3);
    }


    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();

        // Task 2A
        // arraySearch.findAllConsecutiveSubArrays(0, startingNumbers);

        // Task 2B
        // arraySearch.checkIfPairIsZero(startingNumbers);

        // Task 2C
        arraySearch.findIndexOfSmallestNumber(startingNumbers);
        arraySearch.findIndexOfBiggestNumber(startingNumbers);

    }

    // Task 2A
    private boolean checkIfArrayHasSumOfZero(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;

        }
        return sum == 0;
    }

    // Task 2A
    public void findAllConsecutiveSubArrays(int index, ArrayList<Integer> list) {
        if (index == list.size()) {
            return;
        }

        ArrayList<Integer> subArray = new ArrayList<>();

        for (int i = index; i < list.size(); i++) {
            subArray.add(list.get(i));
            if (checkIfArrayHasSumOfZero(subArray)) {
                System.out.println(subArray);
            }
        }
        findAllConsecutiveSubArrays(index + 1, list);
    }

    // Task 2B
    public void checkIfPairIsZero(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                int int1 = list.get(i);
                int int2 = list.get(j);
                if (int1 + int2 == 0) {
                    System.out.println(int1 + " " + int2);
                }
            }
        }

    }

    // Task 2B
    public void printPair(int a, int b) {
        System.out.println(a + " " + b);
    }

    // Task 2C
    public void findIndexOfSmallestNumber(ArrayList<Integer> list) {
        int smallestNumber = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallestNumber) {
                smallestNumber = list.get(i);
                index = i;
            }
        }
        printNumberAndIndex(smallestNumber, index);
    }

    // Task 2C
    public void findIndexOfBiggestNumber(ArrayList<Integer> list) {
        int biggestNumber = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > biggestNumber) {
                biggestNumber = list.get(i);
                index = i;
            }
        }
        printNumberAndIndex(biggestNumber, index);
    }

    private void printNumberAndIndex(int number, int index){
        System.out.println("Number:" + number + " Index:" + (index + 1));
    }

}
