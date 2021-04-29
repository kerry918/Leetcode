class Solution {
public:
  // initialize the directions
  vector<int> direction{-1, 0, 1, 0, -1};

  int shortestBridge(vector<vector<int>>& grid) {
    // get the size of the grid
    int m = grid.size(), n = grid[0].size();
    // initializes a queue to store the points
    queue<pair<int, int>> points;

    bool flipped = false;
    // DFS: loop to find the first island and set the value of the island to 2
    for (int i = 0; i < m; ++i) {
      if (flipped) break;
      for (int j = 0; j < n; ++j) {
        if (grid[i][j] == 1) {
          // using dfs to find the whole island
          dfs(points, grid, m, n, i, j);
          flipped = true;
          break;
        }
      }
    }
    
    // using bfs to find the second island, and set the path that have gone through to 2 
    int x, y;
    int level = 0;
    while (!points.empty()){
      ++level;
      int n_points = points.size();
      while (n_points--) {
        auto [r, c] = points.front();
        points.pop();
        // loop through the four directions
        for (int k = 0; k < 4; ++k) {
          x = r + direction[k], y = c + direction[k+1];
          if (x >= 0 && y >= 0 && x < m && y < n) {
            if (grid[x][y] == 2) {
              continue;
            }
            if (grid[x][y] == 1) {
              return level;
            }
            points.push({x, y});
            grid[x][y] = 2;
          }
        }
      }
    }
    return 0;
  }

  //helper function
  void dfs(queue<pair<int, int>>& points, vector<vector<int>>& grid, int m, int n, int i, int j) {
    if (i < 0 || j < 0 || i == m || j == n || grid[i][j] == 2) {
      return;
    }
    if (grid[i][j] == 0) {
      points.push({i, j});
      return;
    }
    grid[i][j] = 2;
    dfs(points, grid, m, n, i - 1, j);
    dfs(points, grid, m, n, i + 1, j);
    dfs(points, grid, m, n, i, j - 1);
    dfs(points, grid, m, n, i, j + 1);
  }
};