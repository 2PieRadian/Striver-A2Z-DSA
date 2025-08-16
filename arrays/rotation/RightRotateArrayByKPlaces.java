package arrays.rotation;

import java.util.Arrays;

public class RightRotateArrayByKPlaces {
    public static int[] rightRotateArrayByKPlaces(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        int j = 0;
        for (int i = n - k; i < n; i++) {
            temp[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[j++] = arr[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(nums));
        int[] rotatedArray = rightRotateArrayByKPlaces(nums, 2);
        System.out.println(Arrays.toString(rotatedArray));
    }
}
