public class Test01{
	void printNumbers(int n){ 
		if (n <= 0) {
			return; 
			}
		System.out.println(n); 
		printNumbers(n-2); 
		printNumbers(n-3); 
		System.out.println(n);
		}
	
	public static void main(String[] args){
		Test01 test = new Test01();
		test.printNumbers(6);
	}
}