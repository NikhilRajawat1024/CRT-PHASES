public class UtopianTree {
    
    public static int utopianTree(int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n % 2 == 1) {
            return 2 * utopianTree(n - 1);
        } else {
            return utopianTree(n - 1) + 1;
        }
    }

    public static void main(String[] args) {
        int result = utopianTree(4);
        System.out.println(result);  
    }
}
