package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

    public static void main(String[] args)
    {

        // Binary search using arrays class
        // Scenario: element found
        int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        int idx = Arrays.binarySearch(arr1, 5);
        System.out.println("index: " + idx);
        // output- index: 4

        // Scenario- element not found
        arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        idx = Arrays.binarySearch(arr1, 8);
        System.out.println("index: " + idx);
        // output- index: -8. New element should be inserted at return value + 1 (-8 + 1=-7) 7th index.

        // Scenario- element not found
        arr1 = new int[] {1, 2, 3, 5, 6, 7};
        idx = Arrays.binarySearch(arr1, 4);
        System.out.println("index: " + idx);
        // output- index: -4. New element should be inserted at (return value + 1) * -1 index
        // i.e (-4 + 1=-3) 3rd index.


        /**
         * Comparing arrays for equality
         */

        arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        boolean arrEquals = Arrays.equals(arr1, arr2);
        System.out.println(arrEquals);
        // output: true

        arr1 = new int[] {1, 2, 3, 4, 5};
        arr2 = new int[] {1, 2, 3, 5, 4};
        arrEquals = Arrays.equals(arr1, arr2);
        System.out.println(arrEquals);
        // output: false (position of elements is NOT the same in both arrays. Although same content


        /**
         * Filling an array
         */
        arr1 = new int[10];
        Arrays.fill(arr1, 1);
        System.out.println(Arrays.toString(arr1));
        // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

        /**
         * Sorting an array
         */

        // sort in ascending order
        arr1 = new int[] {1,5,4,3,2,6,9,8,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // parallel sort in ascending order
        arr1 = new int[] {1,5,4,3,2,6,9,8,7};
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }


}
