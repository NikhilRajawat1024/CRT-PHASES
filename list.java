import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(34);
        l1.add(54);
        l1.add(14);
        l1.add(74);
        l1.add(32);
        System.out.println(l1);

        Iterator<Integer> it = l1.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
