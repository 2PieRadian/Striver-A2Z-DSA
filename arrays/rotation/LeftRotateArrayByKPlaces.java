package arrays.rotation;

import java.util.Arrays;

public class LeftRotateArrayByKPlaces {

    // Optimal Method
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotateArrayByKPlaces(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Reverse the end k elements
        reverse(nums, n - k, n - 1);

        // Reverse the starting (n - k) elements
        reverse(nums, 0, n - k - 1);

        // Reverse the full array
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(nums));
        leftRotateArrayByKPlaces(nums, 10);
        System.out.println(Arrays.toString(nums));
    }

//    public static int[] leftRotateArrayByKPlaces(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        int[] temp = new int[n];
//
//        for (int i = k; i < n; i++) {
//            temp[i - k] = arr[i];
//        }
//
//        for (int i = 0; i < k; i++) {
//            temp[n - k + i] = arr[i];
//        }
//
//        return temp;
//    }
}
