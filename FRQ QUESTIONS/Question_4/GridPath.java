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

    if(grid[row+1][col] > grid[row][col+1]){
      return new Location(row +1, col);
    } else{
      return new Location(row, col+1);
    }
 }


  
  // PART B
public int sumPath (int row, int col) {
int total = grid[row][col];
int r = row;
int c = col;
  
  while (r!=grid.length-1 || c!=grid[0].length-1){
    Location next = getNextLoc(r, c);
    row = next.getRow();
    col = next.getCol();
    total += grid[r][c];
  }
  return total;
}

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
