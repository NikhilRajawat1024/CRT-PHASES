import java.util.*;
public class sortedarray {
    public static void main(String[] args) {
        int A[] = {1,5,7,8};
        int m = A.length;
        int B[] = {3,6,9,12,15};
        int n = B.length;
        int i,j,k;

        int C[] = new int[n+m];

        // for(int i = 0;i<A.length;i++){
        //     for(int j = 0;j<B.length;j++){
                
        //     }
        // }

        for(i = j = k = 0;i<n && j<m;k++){
            if(A[i]<B[j]){
                C[k] = A[i++];
            } 
            else{
                C[k] = B[j++];
            }
        }

        while(i<n){
            C[k] = A[i];
            i++;
            k++;
        }
        while(j<n){
            C[k] = B[j];
            j++;
            k++;

        }

        for(int nums: C){
            System.out.print(nums+" ");
        }



    }
}
