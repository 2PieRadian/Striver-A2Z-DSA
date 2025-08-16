package arrays.rotation;

import java.util.Arrays;

public class LeftRotateArrayByKPlaces {
    public static int[] leftRotateArrayByKPlaces(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];

        for (int i = k; i < n; i++) {
            temp[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            temp[n - k + i] = arr[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(nums));
        int[] rotatedArray = leftRotateArrayByKPlaces(nums, 10);
        System.out.println(Arrays.toString(rotatedArray));
    }
}
