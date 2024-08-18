


public class maxlensubarray {

    public static void main(String[] args) {

        // find the maximum length subarray having a given sum
        int arr[] = {5, 6, -11, 3, 5, 3, -2, 2};
        int n = arr.length;
        int k = 11;
        
        // int max = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == k) {
        //            int diff = j-i+1;
        //             if (diff > max) {
        //                 max = diff;
        //             }
        //         }
        //     }
        // }
        // System.out.println(max);


        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum+=arr[j];
                if(sum == k){
                    System.out.println("["+i+", "+ j+"]");
                }
            }
        }

    }
}
