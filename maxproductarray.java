import java.util.*;

public class maxproductarray {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 2, 4, 1, 8 };
        int n = arr.length;
        Arrays.sort(arr);
    

        int product = arr[n - 1] * arr[n - 2];d

        System.out.println(product);

    }
}
