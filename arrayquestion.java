import java.util.*;
public class arrayquestion {

    // check whether the sum of given array (pair)  is 0 and print the number
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,-4,6,7};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
                for(int i = 0;i<n;i++){
                     for(int j = n;j<=0;j--){
                        int sum = arr[i]+arr[j];
                        if(sum>0){
                            j--;
                        }else{
                            i++;
                        }
                     }
                }
    }
}
