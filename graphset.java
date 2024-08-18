import java.util.ArrayList;
import java.util.List;

public class graphset {
    public static void main(String[] args) {

        List<Integer>[] adj = new ArrayList[4];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }

        List<List<Integer>> graph = new ArrayList<>();

        graph.add(List.of(0, 1));
        graph.add(List.of(0, 2));
        graph.add(List.of(1, 0));
        graph.add(List.of(1, 3));
        graph.add(List.of(2, 0));     
        graph.add(List.of(2, 3));
        graph.add(List.of(3, 1));
        graph.add(List.of(3, 2));

        for (List<Integer> i : graph) {

            adj[i.get(0)].add(i.get(1));

        }
        for (int i = 0; i < adj.length; i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (Integer vertex : adj[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }
}
