public class pageturns {
    public static int pageCount(int n, int p) {
        
        int startTurns = p / 2;

        int endTurns = 9;

        if(n%2 == 0){
            endTurns =  n+1;
        }else{
            endTurns =  n-p;
        }
        
        endTurns /= 2;
        
        
        return Math.min(startTurns, endTurns);
    
        }

        public static void main(String[] args) {
            int result = pageCount(5, 5);
            System.out.println(result);
        }
    
    }
    

