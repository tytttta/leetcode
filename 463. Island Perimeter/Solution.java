public class Solution {
    public int islandPerimeter(int[][] grid) {
        int total=0;
        int overlap=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    total++;
                    if(i+1<grid.length  && grid[i+1][j]==1 )
                        overlap++;
                    if(j+1< grid[0].length && grid[i][j+1]==1)
                        overlap++;
                }
            }
            return total*4-overlap*2;
        
    }
}