import java.util.*;

public class Topological_Sorting_DFS {
    
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }


    public static void Top_Sort_util(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> s) {  // O(V+E)
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                Top_Sort_util(graph, vis, e.dest, s);
            }
        }
        s.push(curr);
    }


    public static void Top_Sort(ArrayList<Edge> graph[], int v) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                Top_Sort_util(graph, vis, i, s);
            }
        }
        
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        Top_Sort(graph, v);
    }
}
