public class summingseries {
    public static int summingSeries(long n) {
        long MOD = 1000000007;
        

        long series = (2 * n - 1) % MOD;

        if (series < 0) {
            series += MOD;
        }

        return (int)series;

    }
    public static void main(String[] args) {
        long num  = 2;
       int result =  summingSeries(num);
       System.out.println(result);
    }
}
