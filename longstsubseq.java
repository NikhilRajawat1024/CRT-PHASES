public class longstsubseq {
    public static int longestCommonSubsequence(String text1, String text2) {
        return rlcs( text1, text2,text1.length(),text2.length());

    }
    public static int rlcs(String text1, String text2,int m,int n){
        if(m == 0|| n == 0){
            return 0;
        }
        if(text1.charAt(m-1) == text2.charAt(n-1)){
                return 1+rlcs(text1, text2, m-1, n-1);
        }else{
            return Math.max(rlcs(text1, text2, m, n-1),rlcs(text1, text2, m-1, n));
        }
    }

    public static void main(String[] args) {
      int result =   longestCommonSubsequence("abc", "abc");
      System.out.println(result);
    }
}
