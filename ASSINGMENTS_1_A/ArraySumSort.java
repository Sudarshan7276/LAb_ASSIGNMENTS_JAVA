package ASSINGMENTS_1_A;

import java.util.*;

public class ArraySumSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 12, 7};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        Arrays.sort(arr);

        System.out.println("Array in Ascending Order: " + Arrays.toString(arr));
        System.out.println("Sum of Array Elements: " + sum);
    }
}