import java.util.*;
public class sortarray012 {

    // SORT THE ARRAY OF 0'S,1'S AND 2'S
    public static void main(String[] args) {
        int arr[] = {0,2,1,0,1,2,0};

        int n = arr.length;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
