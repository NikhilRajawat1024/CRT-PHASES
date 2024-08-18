public class kangaroorace{

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            return (x1 == x2) ? "YES" : "NO";
        }

        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
            return "YES";
        } else {
            return "NO";
        }

    }
    public static void main(String[] args) {
       String result = kangaroo(0, 3, 4 ,2);
       System.out.println(result);
    }
}