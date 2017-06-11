public class Launcher{
	public static void main(String[] args){
		Launcher launchie = new Launcher();
		launchie.execute();
	}
	public void execute(){
		int a = 5;
		int b = 3;
		Power powie = new Power();
		int c = powie.pow(a,b);
		System.out.println(a +"^" + b + " = " + c);
	}
}