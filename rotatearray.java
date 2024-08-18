import java.util.ArrayList;
import java.util.List;

public class rotatearray {
     public static List<Integer> rotateLeft(int d, List<Integer> arr) {
     
        int n = arr.size();

        int[] Array = new int[n];

        for(int i = 0;i<n;i++){
            int first = Array[0];
            int j;
            for(j = 0;j<Array.length-1;j++){
                Array[i] = Array[i+1];
            }
            Array[Array.length-1] = first;
        }
        List<Integer> rotatedList = new ArrayList<>(n);
        for (int value : Array) {
            rotatedList.add(value);
        }
    return rotatedList;


    }

    public static void main(String[] args) {
        List<Integer> n1 = new ArrayList();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);
        n1.add(5);

        List<Integer> result =  rotateLeft(4, n1);

        System.out.println(result);



    }

    }
