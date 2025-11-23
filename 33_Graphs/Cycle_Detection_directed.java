import java.util.ArrayList;

public class Cycle_Detection_directed {

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

        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 0, 1));
    }


    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {  //cycle exist
                return true;
            } else if (!vis[e.dest]) {
                if (isCycle(graph, vis, e.dest, rec)) {
                    return true;
                } 
            }
        }
        rec[curr] = false;
        
        return false;
    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;
        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                boolean isCycle = isCycle(graph, vis, src, rec);
                if (isCycle) {
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
