import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Orange {

    class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int ans = 0;
        int freshCount = 0;

        // Step 1: Add all initially rotten oranges to queue
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If no fresh oranges, return 0
        if (freshCount == 0)
            return 0;

        // Step 2: BFS to rot adjacent fresh oranges
        while (!q.isEmpty()) {
            Pair curr = q.poll();

            int i = curr.row;
            int j = curr.col;
            int time = curr.time;

            ans = Math.max(ans, time);

            if (grid[i][j] == 1) {
                freshCount--;
                grid[i][j] = 2;
            }

            // Check all 4 directions
            // Up
            if (i - 1 >= 0 && !vis[i - 1][j] && grid[i - 1][j] == 1) {
                q.add(new Pair(i - 1, j, time + 1));
                vis[i - 1][j] = true;
            }

            // Right
            if (j + 1 < m && !vis[i][j + 1] && grid[i][j + 1] == 1) {
                q.add(new Pair(i, j + 1, time + 1));
                vis[i][j + 1] = true;
            }

            // Down
            if (i + 1 < n && !vis[i + 1][j] && grid[i + 1][j] == 1) {
                q.add(new Pair(i + 1, j, time + 1));
                vis[i + 1][j] = true;
            }

            // Left
            if (j - 1 >= 0 && !vis[i][j - 1] && grid[i][j - 1] == 1) {
                q.add(new Pair(i, j - 1, time + 1));
                vis[i][j - 1] = true;
            }
        }

        // Step 3: Return result
        return freshCount == 0 ? ans : -1;
    }

    public static void main(String[] args) {
        Rotten_Orange solution = new Rotten_Orange();
        int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
        
        int result = solution.orangesRotting(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}