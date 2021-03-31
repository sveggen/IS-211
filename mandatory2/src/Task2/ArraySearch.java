package Task2;


import java.util.ArrayList;

public class ArraySearch {

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

    // Task 2A
    private boolean checkIfArrayHasSumOfZero(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;

        }
        return sum == 0;
    }

    // Task 2B
    public void checkIfPairIsZero(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                int int1 = list.get(i);
                int int2 = list.get(j);
                if (int1 + int2 == 0) {
                    System.out.println(int1 + ", " + int2);
                }
            }
        }
    }

    // Task 2C
    public void findIndexOfSmallestNumber(ArrayList<Integer> list) {
        int smallestNumber = 0;
        int index = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallestNumber) {
                smallestNumber = list.get(i);
                index = i;
            }
        }
        System.out.println("Smallest number: " + smallestNumber + " Index: " + (index + 1));
    }

    // Task 2C
    public void findIndexOfLargestNumber(ArrayList<Integer> list) {
        int largestNumber = 0;
        int index = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > largestNumber) {
                largestNumber = list.get(i);
                index = i;
            }
        }
        System.out.println("Largest number: " + largestNumber + " Index: " + (index + 1));
    }
}
