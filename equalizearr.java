import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class equalizearr {
   static int count = 0;
    public static int equalizeArray(List<Integer> arr) {
    
                Map<Integer,Integer> mp = new HashMap<>();

                for(int num:arr){
                    mp.put(num, mp.getOrDefault(num,0)+1);
                }
                int max = 0;
                for(int frequency:mp.values()){
                    if(frequency>max){
                        max = frequency;
                    }
                }
                return arr.size()-max;
    }
    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();

        arr1.add(3);
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);
        arr1.add(4);
       int ans =  equalizeArray(arr1);
       System.out.println(ans);
    }
}
