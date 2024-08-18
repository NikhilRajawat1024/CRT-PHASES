public class swaparr {
    public static void main(String[] args) {
        int arr[] = {2,5,3,7,16,9,10};

        for(int i = 1;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
