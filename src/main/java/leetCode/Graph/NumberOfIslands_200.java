/**
 * Problem statement:
 * 
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 * 
 * Example 1:
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * 
 * Output: 3
 * 
*/

/**
 * Solutions 
 * Methods To Solve This Problem:
I'll be covering two different methods to solve this problem:

Depth-First Search (DFS)
Breadth-First Search (BFS)
1️⃣ Depth-First Search (DFS):
The DFS approach involves exploring each cell in the grid. When encountering a '1' (representing land), it signifies the start of a new island. The goal is to explore and mark all connected land cells (forming an island) using recursive DFS.

DFS Function: Define a recursive DFS function that takes the grid and the current cell coordinates (i, j) as parameters.

If the cell is out of the grid boundaries or not land ('1'), return.
Mark the current cell as visited by changing it from '1' to '0'.
Recursively call DFS for the neighboring cells (up, down, left, right) to explore and mark all connected land cells.
Main Function:

Iterate through each cell in the grid.
When encountering an unvisited '1', increment the island count and trigger DFS to explore and mark all connected land cells belonging to this island.
 * 
*/

package leetCode.Graph;
import java.util.*;

public class NumberOfIslands_200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return numIslands;
    }
    
    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0'; // mark as visited
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
