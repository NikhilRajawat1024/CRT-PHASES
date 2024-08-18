
import java.util.Arrays;
public class sortbinaryarray {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 1, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
       // st approach

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr[p++] = arr[i];
            }

        }
        for (int k = p; k < arr.length; k++) {
            arr[k] = 1;
        }
        System.out.println(Arrays.toString(arr));

        //2nd approach

    }
}
