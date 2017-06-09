public class FacIterat{
	
	public int fac(int num){
		int result = num;
		while(num > 1){
			num = num - 1; 	
			result = (num) * result;
		}
		return result;
	}
	public static void main(String[] args){
		Iterat it = new Iterat();
		System.out.println(it.fac(8));
	}
}