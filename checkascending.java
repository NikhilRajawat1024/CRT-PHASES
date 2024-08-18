public class checkascending{

    // check whether the given array is in ascending order or not
    public static void main(String[] args) {
        int flag = 0;
         int arr[] = new int[]{43,6,4,242,62};
         int sizeofarr = arr.length;
         for(int i = 0;i<sizeofarr-1;i++){
            if(arr[i]>arr[i+1]){
                flag = 1;
            }
            else{
                flag = 0;
            }

         }
         if(flag == 1){
            System.out.println(false);
         }else{
            System.out.println(true);
         }
    }
}