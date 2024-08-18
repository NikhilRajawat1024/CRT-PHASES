
import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
import java.util.List;

public class matchpair {
    public static int sockMerchant(int n, List<Integer> ar) {


        Map<Integer,Integer> sockcnt = new HashMap<>();

        for (int i = 0; i < ar.size(); i++) {
           int sock = ar.get(i);
           sockcnt.put(sock,sockcnt.getOrDefault(sock, 0)+1 );

        }
        int pairs = 0;
        for(int count:sockcnt.values()){
            pairs+=count/2;

        }
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 2, 1, 3);

        int result = sockMerchant(6, l1);
        System.out.println(result);

    }
}
