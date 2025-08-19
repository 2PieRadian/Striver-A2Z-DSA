package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * n = 5,m = 5.
 * arr1[] = {1,2,3,4,5}
 * arr2[] = {2,3,4,4,5}
 * Output:
 *  {1,2,3,4,5}
 */

public class UnionOfTwoSortedArrays {
    public static List<Integer> unionOfTwoSortedArrays(int[] a, int[] b, int n, int m) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // For first array
        for (int i = 0; i < n; i++) {
            freqMap.put(a[i], freqMap.getOrDefault(freqMap.get(a[i]), 0) + 1);
        }

        // For second array
        for (int i = 0; i < m; i++) {
            freqMap.put(b[i], freqMap.getOrDefault(freqMap.get(b[i]), 0) + 1);
        }

        return new ArrayList<>(freqMap.keySet());
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};

        List<Integer> mergedList = unionOfTwoSortedArrays(a, b, a.length, b.length);

        System.out.println(mergedList.toString());
    }
}
