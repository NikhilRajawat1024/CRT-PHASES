import java.util.ArrayList;
import java.util.List;

public class migratingbirds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] birdCounts = new int[6]; 

        for (int bird : arr) {
            birdCounts[bird]++;
        }

        int maxCount = 0;
        int maxBirdType = 0;

        // Find the bird type with the highest count
        for (int i = 0; i < birdCounts.length; i++) {
            if (birdCounts[i] > maxCount) {
                maxCount = birdCounts[i];
                maxBirdType = i;
            } else if (birdCounts[i] == maxCount && i < maxBirdType) {
                maxBirdType = i;
            }
        }

        return maxBirdType;
    }

    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(4);
        ll.add(4);
        ll.add(4);
        
        ll.add(5);
        ll.add(3);

        int result = migratoryBirds(ll);
        System.out.println(result);
    }
}
