public class catandmouse {
   public static String catAndMouse(int x, int y, int z) {

    int diffy = Math.abs(z - y);
    int diffx = Math.abs(z - x);

         if(diffx == diffy){
            return "Mouse C";

         }else if(diffx>diffy){

            return "Cat B";
                 
         }
         else{
            return "Cat A";
         }
    }
    public static void main(String[] args) {
      String ans=  catAndMouse(1, 3, 2);
      System.out.println(ans);
    }
}
