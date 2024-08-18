public class handshake {

    // Instance variable to accumulate the sum
    public static  int sum = 0;

    // Recursive method to calculate the sum of integers from n to 1
    public static int handshake(int n) {
        // if (n <= 1) {
        //     // sum += n;
        //     return sum;
        // }
        // n-=1;
        // sum += n;
        // return handshake(n);
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        // handshake handshake = new handshake(); // Create an instance of Handshake
        int result = handshake(5);   // Call the instance method to calculate the sum
        System.out.println( result); // Print the result
    }
}
