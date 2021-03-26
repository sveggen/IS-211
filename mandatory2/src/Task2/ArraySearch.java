package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        ArraySearch arraySearch = new ArraySearch();

        int listLength = 23;
        int[] startingNumbers = new int[]{4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        //task2.findAllCombinations(listLength, startingNumbers);
    }

    private ArrayList<Integer> combinations;

    public void findAllCombinationsWithSumOfZero() {


    }

    public void findAllCombinations(Integer a, int[] list) {
        if (a == 1) {
            System.out.println(Arrays.toString(list));
        } else {

            for (int i = 0; i < a; i += 1){
                findAllCombinations(a - 1, list);
                if (a % 2 == 1) {
                    swapNumbers(list, 0, a-1);

                } else {
                    swapNumbers(list, i, a-1);
                }
            }
        }

    }

    private static void swapNumbers(int[] list, int a, int b) {
        int tempNumber = list[a];
        list[a] = list[b];
        list[b] = tempNumber;
    }


}
