import java.util.ArrayList;

public class Print_All_Path_Directed {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }


    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }


    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path);
            return;
        }

        int curr = src;
        if (!vis[curr]) {
            vis[curr] = true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                printAllPath(graph, vis, e.dest, dest, path + e.dest);
            }
            vis[curr] = false;
        }
    }


    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        creategraph(graph);

        int src = 5;
        int dest = 1;
        System.out.println("All paths from " + src + " to " + dest + ":");
        printAllPath(graph, new boolean[v], src, dest, "5");
    }
}