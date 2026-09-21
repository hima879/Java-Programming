
public class MultiSourceFloodExample {
    
    // Grid represents elevation of houses
    // 0 = lowest, 5 = highest
    public static void explainMultiSourceDFS(String[] args) {
        int[][] elevation = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("🏠 Elevation Grid:");
        printGrid(elevation);
        
        // Suppose water sources at:
        // - Top border (source A)
        // - Bottom border (source B)
        
        boolean[][] visitedFromTop = new boolean[3][3];
        boolean[][] visitedFromBottom = new boolean[3][3];
        
        // Start DFS from ALL top border cells
        for (int col = 0; col < 3; col++) {
            dfs(elevation, visitedFromTop, 0, col, Integer.MIN_VALUE);
        }
        
        // Start DFS from ALL bottom border cells
        for (int col = 0; col < 3; col++) {
            dfs(elevation, visitedFromBottom, 2, col, Integer.MIN_VALUE);
        }
        
        System.out.println("\n🌊 Cells reachable from TOP border:");
        printVisited(visitedFromTop);
        
        System.out.println("\n🌊 Cells reachable from BOTTOM border:");
        printVisited(visitedFromBottom);
        
        System.out.println("\n✅ Cells reachable from BOTH sides (intersection):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (visitedFromTop[i][j] && visitedFromBottom[i][j]) {
                    System.out.print("█ ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    
    private static void dfs(int[][] grid, boolean[][] visited, int row, int col, int prevHeight) {
        // Out of bounds or already visited or cannot flow (going uphill)
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || 
            visited[row][col] || grid[row][col] < prevHeight) {
            return;
        }
        
        // Mark as reachable
        visited[row][col] = true;
        int currentHeight = grid[row][col];
        
        // Explore 4 directions
        dfs(grid, visited, row - 1, col, currentHeight);
        dfs(grid, visited, row + 1, col, currentHeight);
        dfs(grid, visited, row, col - 1, currentHeight);
        dfs(grid, visited, row, col + 1, currentHeight);
    }
    
    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    private static void printVisited(boolean[][] visited) {
        for (boolean[] row : visited) {
            for (boolean val : row) {
                System.out.print(val ? "✓ " : ". ");
            }
            System.out.println();
        }
    }
}