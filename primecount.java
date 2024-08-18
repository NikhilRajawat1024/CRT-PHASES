public class primecount{
    public static int primeCount(long n) {
        
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        long product = 1;
        int count = 0;

        
        for (int prime : primes) {
            if (product * prime > n) {
                break;
            }
            product *= prime;
            count++;
        }

        return count;

    
    }
    public static void main(String[] args) {
       long num = 500;
      long result =  primeCount(num);
      System.out.println(result);
    }
}