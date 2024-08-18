public class minheighttriangle {
    public static int lowestTriangle(int trianglebase, int area) {

        return (int)Math.ceil((2.0 *area)/trianglebase);
        
    
        }
        public static void main(String[] args) {
           int result =  lowestTriangle(17, 100);
           System.out.println(result);
        }
}
