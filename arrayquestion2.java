public class arrayquestion2 {
    public static void main(String[] args) {
        // Write a program to check if a subarray with 0 sum exists or not
        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int sum = 0;  // Reset sum for each starting point of subarray
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
