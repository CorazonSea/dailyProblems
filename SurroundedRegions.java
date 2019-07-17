class Solution {
    	public char[][] solve(char[][] grid) {
		if (grid == null || grid.length == 0){
			return null;
		}
		int num = 0;
		int rows = grid.length;		
		int cols = grid[0].length;
		//查找边缘点为‘o’
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if (i == 0 || i == rows-1 || j== 0 || j ==cols-1){
					 if (grid[i][j] == 'O'){
						 landToWater(grid, i, j, rows, cols);						 
					 }					
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if (grid[i][j] == 'O'){
					grid[i][j] = 'X';				 
				 }
				if (grid[i][j] == '#'){
					grid[i][j] = 'O';
				}
			}
		}
		return grid;
        
    }
	//dfs递归遍历
	public void landToWater(char[][] grid, int i, int j, int rows, int cols){
		if (i>=0 && i<rows && j>=0 && j<cols && grid[i][j] == 'O'){
			grid[i][j] = '#';
			landToWater(grid, i, j+1, rows, cols);//up
			landToWater(grid, i+1, j, rows, cols);//right
			landToWater(grid, i, j-1, rows, cols);//down
			landToWater(grid, i-1, j, rows, cols);//left
		}
	}
}
