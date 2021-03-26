package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySearch {

    private ArrayList<int[]> combinations;
    ArrayList<Integer>startingNumbers = new ArrayList<>();
    List<int[]> list = new int[]{4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};

    public ArraySearch() {

        this.startingNumbers = [];
    }

    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        arraySearch.findAllCombinationsWithSumOfZero();
    }

    public void findAllCombinationsWithSumOfZero() {
        // find all subarrays that add up to 0 by calculating each subarray
        ArraySearch arraySearch = new ArraySearch();
        arraySearch.findAllConsecutiveArrays(0, startingNumbers);


    }

    private boolean checkIfArrayHasSumOfZero(int[] list){
         return IntStream.of(list).sum() == 0;
    }

    public void findAllConsecutiveArrays(int index, ArrayList<Integer> list) {
        if (index == list.size()) {
            return;
        }

        ArrayList<Integer> subArray = new ArrayList<>();

        for (int i = index; i < list.size(); i++) {
            subArray.add(list.get(i));
            System.out.println(subArray);

        }
        findAllConsecutiveArrays(index+1, list);
    }


}
