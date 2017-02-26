public class Matrix {
	private int[][] matrix;
	private int columns;
	private int rows;

	public Matrix(int a, int b) {
		this.columns = a;
		this.rows = b;
		this.matrix = new int[columns][rows];
		for(int i = 0; i < columns; i ++){
			for(int j=0; j < rows; j ++) {
				this.matrix[i][j] = 1;
			}
		}
	}

	public void setElement(int a, int b, int c) {
		matrix[columns][rows] = c;
	}
	
}