package arrays.rotation;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void leftRotateArrayByOne(int[] arr) {
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));
        leftRotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
