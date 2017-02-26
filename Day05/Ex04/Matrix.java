public class Matrix{
	int matrix[][];

	public Matrix(int a,int b) {
		this.matrix = matrix;
		matrix = new int[a][b];
	}


	// Method created in order to avoid repetitions. 
	private int typeNumber(){
		String str = System.console().readLine("Please type a number: ");
		int num = Integer.parseInt(str);
		return num;
	}

	private String typeString(){
		String str = System.console().readLine();
		return str;
	}

	//
	private void setElement(Matrix aMatrix, int a, int b, int c) {
		System.out.println("Please choose a value for the rows");
		a = typeNumber();
		System.out.println("Please choose a value for the columns");
		b = typeNumber();

		if((aMatrix.matrix.length > a) && (aMatrix.matrix[0].length > b)) {
			System.out.println("Choose a new value for the point " + a + ", " + b);
			c = typeNumber();
			aMatrix.matrix[a][b] = c;
			System.out.println("New value set.");
	}
	else{
		System.out.println("ERROR! At least one of your values is out of range. Your input will be ignored!" + "\n");
		}
	}

	/* It sets the value of a whole row. The int defines the row
	and the String the new digits that will replace the old ones */

	private void setRow(Matrix aMatrix, int a, String str) {
		int count;
		int str_len = str.length();

		int matrix_len = aMatrix.matrix[0].length;
		if(matrix_len == str_len) {
			for(count = 0 ; count < aMatrix.matrix[0].length; count ++) {
				char the_character = str.charAt(count);
				String the_num = "" + the_character;
				int the_number = Integer.parseInt(the_num);
				aMatrix.matrix[a][count] = the_number;
			}
			System.out.print("\n");

		}
		else{
			System.out.println("ERROR! The number you typed is out of range!");
		}

	}
	
	private void setColumn(Matrix aMatrix, int a, String str) {
		int count;
		int str_len = str.length();

		int matrix_len = aMatrix.matrix.length;
		if(matrix_len == str_len) {
			for(count = 0 ; count < aMatrix.matrix.length; count ++) {
				char the_character = str.charAt(count);
				String the_num = "" + the_character;
				int the_number = Integer.parseInt(the_num);
				aMatrix.matrix[count][a] = the_number;
			}
			System.out.print("\n");

		}
		else{
			System.out.println("ERROR! The number you typed is out of range!");
		}

	}

	private String toString(Matrix aMatrix){
		int count;
		int y;
		String final_String = "\"[";
		for(count = 0; count < aMatrix.matrix.length; count ++) {
			for(y = 0; y < aMatrix.matrix[0].length; y ++){
				//System.out.print(final_String);
				final_String = final_String + aMatrix.matrix[count][y] + ",";
			}
			final_String = final_String.substring(0, final_String.length()-1) + ";";
		}
		final_String = final_String + "]\"";
		return final_String;

	}

	private void prettyPrint(Matrix aMatrix){
		int count;
		int y;
		for(count = 0; count < aMatrix.matrix.length; count ++) {
			for(y = 0; y < aMatrix.matrix[0].length; y ++){
				System.out.print("\t" + aMatrix.matrix[count][y] + " ");
			}
			//Simply remove this to print the matrix on one line! 
			System.out.println();

		}
		
	}
/*
	public static void main (String[] args){
		Matrix matrice = new Matrix(5, 10); 
		//System.out.println("Those are the rows of your Matrix: ");
		int counter;
		for (counter = 0; counter < matrice.matrix.length; counter ++) {
			System.out.println("Please, type " + matrice.matrix[0].length + " numbers for the row #" + (counter + 1));
			matrice.setRow(matrice, counter, matrice.typeString());
		}
		System.out.println("I will show your matrix as a string:");
		System.out.println(matrice.toString(matrice));

		System.out.println("Let's change one of the numbers!");
		matrice.setElement(matrice, 1, 1, 1);
		
		
		System.out.println("I'll also change the last column in order to have only 9s");
		matrice.setColumn(matrice, 9, "99999");

		System.out.println("Now I will pretty-print your Matrix.");
		matrice.prettyPrint(matrice);
			}

*/

}