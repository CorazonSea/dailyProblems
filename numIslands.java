class Solution {
    	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0){
			return 0;
		}
		int num = 0;
		int rows = grid.length;		
		int cols = grid[0].length;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if (grid[i][j] == '1'){
					num ++;
					landToWater(grid, i, j, rows, cols);
				}
			}
		}		
		return num;
        
    }
	// 找连通区域
	public void landToWater(char[][] grid, int i, int j, int rows, int cols){
		if (i>=0 && i<rows && j>=0 && j<cols && grid[i][j] == '1'){
			grid[i][j] = '0';
			landToWater(grid, i, j+1, rows, cols);//up
			landToWater(grid, i+1, j, rows, cols);//right
			landToWater(grid, i, j-1, rows, cols);//down
			landToWater(grid, i-1, j, rows, cols);//left
		}
	}
}
