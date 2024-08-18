public class saveprisoner {
    public static int saveThePrisoner(int noofprisoner, int candy, int startfrom) {

        int arr[] = new int[noofprisoner];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[startfrom]++;
        }
    }

    public static void main(String[] args) {
        int result = saveThePrisoner(3, 7, 3);
        System.out.println(result);
    }
}
