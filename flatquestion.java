public class flatquestion {
    
    // Time Conversion
public static String timeConversion(String s) {
    // Write your code here
        String a = s.substring(s.length() - 2);
        int hr = Integer.parseInt(s.substring(0,2));
        String m = s.substring(3,5);
        String ss = s.substring(6,8);
        if(a.equals("AM")){
            if(hr == 12){
                hr = 0;
            }
        }else{
            if(hr != 12){
                hr += 12;
            }
        }
        String b = String.format("%02d", hr);
        return b +":"+m+":"+ss;
    }
    public static void main(String[] args) {
        String str = "12:01:00";
        timeConversion(str);
    }
}
