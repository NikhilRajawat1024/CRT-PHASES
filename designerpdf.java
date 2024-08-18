import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class designerpdf {

    public static int designerPdfViewer(List<Integer> h, String word) {

        Map<Character, Integer> charHeightMap = new HashMap<>();
        for (int i = 0; i < h.size(); i++) {
            charHeightMap.put((char) ('a' + i), h.get(i));
        }
        System.out.println(charHeightMap);

        // Determine the maximum
        int maxHeight = 0;
        for (char c : word.toCharArray()) {
            int height = charHeightMap.get(c);
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        // The width of the text is the length of the string
        int width = word.length();

        // Calculate the area of the highlight
        int area = maxHeight * width;

        return area;

    }

    public static void main(String[] args) {
         List<Integer> heights = Arrays.asList(1,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5 ,5, 5, 5, 5, 5, 5, 5 );

      int result=  designerPdfViewer(heights, "torn");
      System.out.println(result);
        
    }
}
