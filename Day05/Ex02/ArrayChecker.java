public class ArrayChecker {
	public boolean isSymetrical(int[] anArray) { // boolean beacause it has to return either TRUE or FALSE
		int size = anArray.length;
		for(int i = 0; i < size / 2; i ++) {
			if (anArray[i] != anArray[size - i - 1]) {
				return false;
			}
		}
		return true;
	}
	public int[] Reverse(int[] anArray){
		int size = anArray.length;
		int[] newArray = new int[size];
		for(int i = 0; i < size; i ++) {
			newArray[size - i - 1] = anArray[i];
		}
		return newArray;
	}
}