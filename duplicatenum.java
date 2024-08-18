import java.util.*;
public class duplicatenum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4};
        
        // Arrays.sort(arr);

        // for(int i = 0;i<arr.length-1;i++){
        //     if(arr[i] == arr[i+1]){
        //           System.out.println(arr[i]);
        //     }
        // }


        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        
    }
}
