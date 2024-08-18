import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class arraymanipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n + 1];
    
        
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
    
            array[a] += k;
            if (b + 1 <= n) {
                array[b + 1] = array[b+1]-k;
            }
        }
    
        
        long max = 0;
        long current = 0;
        for (int i = 1; i <= n; i++) {
            current += array[i];
            if (current > max) {
                max = current;
            }
        }
    
        return max;
    }

   public static void main(String[] args) {
    int n = 10;
    List<List<Integer>> queries = new ArrayList<>();
    queries.add(Arrays.asList(1, 5, 3));
    queries.add(Arrays.asList(4, 8, 7));
    queries.add(Arrays.asList(6, 9, 1));

    System.out.println(arrayManipulation(n, queries));
   }
    
}
