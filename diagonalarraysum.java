import java.util.List;

public class diagonalarraysum {
     public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i); // Sum of primary diagonal
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i); // Sum of secondary diagonal
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        // Example usage
        List<List<Integer>> matrix = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(9, 8, 9)
        );

        int result = diagonalDifference(matrix);
        System.out.println(result); // Output: 2
    }
}
