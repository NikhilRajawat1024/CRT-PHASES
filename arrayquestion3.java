public class arrayquestion3 {
    public static void main(String[] args) {
        // Write a program to check if a subarray with 0 sum exists or not
        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int n = arr.length;
        boolean found = false;
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0; 
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    start = i;
                    end = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            for (int k = start; k <= end; k++) {
                System.out.print(k + " ");
            }
        } else {
            System.out.println(false);
        }
    }
}
