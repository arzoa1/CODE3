import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    if (row >= grid.length -1) {
      return new Location(row, col);
    } 
    else if (col >= grid[row].length -1){
      return new Location(row +1, col);
    }
    


  
  // PART B
public int sumPath(int row, int col) {
int total = grid[row][col];
  while (row < grid.length && col < grid[row].length){
    Location next = getNextLoc(row, col);
    total += grid[next.getRow()][next.getCol()];
    row = next.getRow();
    col = next.getCol();
  }
  return total;
}

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
