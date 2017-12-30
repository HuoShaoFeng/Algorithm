package Problem12;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class PathInMatrix {

	public static void main(String[] args) {
		char[][] matrix = {{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
		String pathStr = "jdeh";
		System.out.println(hasPath(matrix,pathStr));
	}

	public static boolean hasPath(char[][] matrix, String pathStr) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		//定义一个二维矩阵，表示每个格子是否访问过
		boolean[][] visited = { {false,false,false,false},
								{false,false,false,false},
								{false,false,false,false}};
		int pathLength = 0;
		//可以从矩阵中的任意一个格子开始
		for(int i=0;i<row;++i) {
			for (int j = 0; j < col; j++) {
				if(hasPathCore(matrix,i,j,pathLength,pathStr,visited)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasPathCore(char[][] matrix, int i, int j, int pathLength, String pathStr,
			boolean[][] visited) {

		boolean haspath = false;
		
		if(pathLength==pathStr.length())
			return true;
		
		if(i>=0&&i<=matrix.length && j>=0&&j<=matrix[0].length &&
				matrix[i][j]==pathStr.charAt(pathLength) && visited[i][j]==false) {
			++pathLength;
			visited[i][j]=true;
			
			haspath = hasPathCore(matrix, i, j-1, pathLength, pathStr, visited) ||
					  hasPathCore(matrix, i-1, j, pathLength, pathStr, visited) ||
					  hasPathCore(matrix, i, j+1, pathLength, pathStr, visited) ||
					  hasPathCore(matrix, i+1, j, pathLength, pathStr, visited);
			
			if(haspath==false) {
				--pathLength;
				visited[i][j]=false;
			}
		}
		return haspath;
	}

}
