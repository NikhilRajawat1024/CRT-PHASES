import java.util.*;
public class climbleadership {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
            
        int n; // the players on the leaderboard

        // Collections.sort(ranked,Collections.reverseOrder());

        int maxelminrnked = ranked.get(0);

        List<Integer> resultantlist = new ArrayList<>();

        for(int i= 0;i<player.size();i++){
            if(player.get(i)>=maxelminrnked){
                    resultantlist;
            }
            else if()
        }


        return ranked;

    }

    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100); 
        ranked.add(90); 
        ranked.add(60); 
        ranked.add(80); 

        List<Integer> player1 = new ArrayList<>();
        player1.add(70);
        player1.add(80);
        player1.add(105);

        List<Integer> result = new ArrayList<>();

        result = climbingLeaderboard(ranked, player1);
        System.out.println(result);

         climbingLeaderboard(ranked, player1);
        



        
    }
}
