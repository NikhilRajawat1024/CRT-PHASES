import java.util.Arrays;

public class superdigit {
    public static int superDigit(String n, int k) {

        if (n.length() == 1) {
            return Integer.parseInt(n);
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < k; i++) {
            str.append(n);
        }

        String res = str.toString();
        long sum = 0;
        for (int i = 0; i < res.length(); i++) {
            sum += Character.getNumericValue(res.charAt(i));
        }

        while (sum >= 10) {
            sum = digitSum(sum);
        }

        return (int) sum;
        
    

    }
    private static long digitSum(long num) {
        long newSum = 0;
        while (num > 0) {
            newSum += num % 10;
            num /= 10;
        }
        return newSum;
    }

    public static void main(String[] args) {

        String str = "148";
        int k = 3;
        int result = superDigit(str, 3);
        System.out.println(result);
    }
}
