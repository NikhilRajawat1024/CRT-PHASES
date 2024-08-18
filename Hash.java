import java.util.*;

public class Hash {
    public static void main(String[] args) {
        int arr[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println("All subarrays found are: ");
        findZeroSumSubarrays(arr);
    }

    public static void findZeroSumSubarrays(int[] arr) {
        // HashMap to store the cumulative sum and corresponding list of indices
        Map<Integer, List<Integer>> cumulativeSumMap = new hashMmap<>();

        // Initialize the map with sum 0 at index -1
        cumulativeSumMap.put(0, new ArrayList<>());
        cumulativeSumMap.get(0).add(-1);

        int sum = 0;

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // Update the cumulative sum
            sum += arr[i];

            // If the cumulative sum is seen before, it means there are zero-sum subarrays
            if (cumulativeSumMap.containsKey(sum)) {
                // Get the list of indices where this cumulative sum was seen before
                List<Integer> indices = cumulativeSumMap.get(sum);

                // Print all subarrays ending at the current index with zero sum
                for (int j : indices) {
                    System.out.println("(" + (j + 1) + ", " + i + ")");
                }
            }

            // If the cumulative sum is not present in the map, add it
            cumulativeSumMap.putIfAbsent(sum, new ArrayList<>());

            // Add the current index to the list of indices for this cumulative sum
            cumulativeSumMap.get(sum).add(i);
        }
    }
}
