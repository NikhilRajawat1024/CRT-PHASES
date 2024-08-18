class timeconversion{
public static String timeconversion(String s) {


    // Write your code here
        String a = s.substring(s.length() - 2);
        int hr = Integer.parseInt(s.substring(0,2));
        String m = s.substring(3,5);
        String ss = s.substring(6,8);
        if(a == "AM"){
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
        String time = "07:25:55AM";

      String result =   timeconversion(time);
      System.out.println(result);
    }

}