import java.util.*;

public class breakingrecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return List.of(0, 0);
        }

        int max_record = scores.get(0);
        int min_record = scores.get(0);
        int maxscorebreak = 0;
        int minscorebreak = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > max_record) {
                max_record = scores.get(i);
                maxscorebreak++;
            } else if (scores.get(i) < min_record) {
                min_record = scores.get(i);
                minscorebreak++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxscorebreak);
        result.add(minscorebreak);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> result = breakingRecords(scores);
        System.out.println(result); // Output should be [2, 4]
    }
}
