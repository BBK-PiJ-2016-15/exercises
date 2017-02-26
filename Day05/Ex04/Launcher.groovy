Matrix matrixOne = new Matrix(5, 10); 
//System.out.println("Those are the rows of your Matrix: ");
int counter;
for (counter = 0; counter < matrixOne.matrix.length; counter ++) {
	System.out.println("Please, type " + matrixOne.matrix[0].length + " numbers for the row #" + (counter + 1));
	matrixOne.setRow(matrixOne, counter, matrixOne.typeString());
}
println("I will show your matrix as a string:");
println(matrixOne.toString(matrixOne));

println("Let's change one of the numbers!");
matrixOne.setElement(matrixOne, 1, 1, 1);


println("I'll also change the last column in order to have only 9s");
matrixOne.setColumn(matrixOne, 9, "99999");

println("Now I will pretty-print your Matrix.");
matrixOne.prettyPrint(matrixOne);