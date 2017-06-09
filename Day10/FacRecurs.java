public class FacRecurs{
	
	public int fac(int num){
		if(num == 1){
			return 1;
		}
		else{
			int result = num * fac(num -1);
			return result;
		}
	}
	public static void main(String[] args){
		Recurs recu = new Recurs();
		System.out.println(recu.fac(8));
	}
}