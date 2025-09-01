package arrays;

import java.util.*;

/**
 * n = 5,m = 5.
 * arr1[] = {1,2,3,4,5}
 * arr2[] = {2,3,4,4,5}
 * Output:
 *  {1,2,3,4,5}
 */

public class UnionOfTwoSortedArrays {
    // Two Pointer Approach
    public static List<Integer> unionOfTwoSortedArrays(int[] a, int[] b, int n, int m) {
        int x = 0, y = 0;
        List<Integer> union = new ArrayList<>();

        while (x < n && y < m) {
            if (a[x] <= b[y]) {
                // If the current element was just inserted before
                if (union.isEmpty() || a[x] != union.getLast()) {
                    union.add(a[x]);
                }
                x++;
            } else {
                // If the current element was just inserted before
                if (union.isEmpty() || b[y] != union.getLast()) {
                    union.add(b[y]);
                }
                y++;
            }
        }

        while(x < n) {
            if (union.isEmpty() || a[x] != union.getLast()) {
                union.add(a[x]);
            }
            x++;
        }

        while (y < m) {
            if (union.isEmpty() || union.getLast() != b[y]) {
                union.add(b[y]);
            }
            y++;
        }

        return union;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};

        List<Integer> mergedList = unionOfTwoSortedArrays(a, b, a.length, b.length);

        System.out.println(mergedList.toString());
    }

//        Using Set
//        public static List<Integer> unionOfTwoSortedArrays(int[] a, int[] b, int n, int m) {
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int it : a) {
//            set.add(it);
//        }
//        for (int it : b) {
//            set.add(it);
//        }
//
//        return new ArrayList<>(set);
//    }


//    Using Map
//   public static List<Integer> unionOfTwoSortedArrays(int[] a, int[] b, int n, int m) {
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
//        // For first array
//        for (int i = 0; i < n; i++) {
//            freqMap.put(a[i], freqMap.getOrDefault(freqMap.get(a[i]), 0) + 1);
//        }
//
//        // For second array
//        for (int i = 0; i < m; i++) {
//            freqMap.put(b[i], freqMap.getOrDefault(freqMap.get(b[i]), 0) + 1);
//        }
//
//        return new ArrayList<>(freqMap.keySet());
//    }
}
