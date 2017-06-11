public class Power{
	
	public int pow(int one, int two){
		int result = one;
		// base case
		if(two == 1){
			return result;
		}
		else{
			//recursive solution
			result = (one * pow(one,two-1));		
		}
	return result;
	}
}