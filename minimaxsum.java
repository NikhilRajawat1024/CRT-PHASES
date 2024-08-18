import java.util.Arrays;
import java.util.List;

public class minimaxsum {
    public static void miniMaxSum(List<Integer> arr) {
       
        Integer[] array = arr.toArray(new Integer[arr.size()]);

        Arrays.sort(array);

        long minsum = 0;
        for(int i = 0;i<4;i++){
            minsum+=array[i];
        }

        long maxsum = 0;
        for (int i = 1; i < 5; i++) {
            maxsum += array[i];
        }

        System.out.println(minsum + " " + maxsum);
        
        

    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);
        miniMaxSum(arr); // Output should be: 16 24
    }
}
