import java.util.*;

public class hashMmap {

    public static boolean hasZeroSumSubarray(int[] arr) {
        HashMap<Integer, Integer> cumSumMap = new HashMap();
        int cumSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumSum += arr[i];

            if (cumSum == 0 || cumSumMap.containsKey(cumSum)) {
                return true;
            }

            cumSumMap.put(cumSum, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, 5};
        if (hasZeroSumSubarray(arr)) {
            System.out.println("Found a subarray with 0 sum");
        } else {
            System.out.println("No subarray with 0 sum found");
        }
    }
}
