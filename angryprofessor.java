import java.util.ArrayList;
import java.util.List;

public class angryprofessor {

    public static String angryProfessor(int k, List<Integer> a) {

        String yes = "yes";
        String no = "no";

        int sizelist = a.size();

        int ontimecount = 0;

        for (int i = 0; i < sizelist; i++) {
            if (a.get(i) <= 0) {
                ontimecount++;

            }
        }

        if (ontimecount >= k) {
            return no;

        } else {
            return yes;
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(0);
        list.add(-1);
        list.add(2);
        list.add(1);

        String ans = angryProfessor(2, list);
        System.out.println(ans);

    }
}
