public class peekelm {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 6, 5, 3 };

        int result = findPeakElement(arr);
        System.out.println(result);

    }

    public static int findPeakElement(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = 0;
        int peak = 0;

        while (start <= end) {
            if (start == end) {
                peak = nums[start];
                break;
            }
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
