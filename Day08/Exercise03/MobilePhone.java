public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand){
		super(brand);
		
	}
	
	public void printLastNumbers(String[] numbers){
		int recentNumbers;
		if(numbers.length < 10){
			recentNumbers = numbers.length;
		}
		else{
			recentNumbers = 10;
			
		}
		System.out.println("Recent calls to: ");
		for(int n = 0; n < recentNumbers; n ++){
			System.out.println(numbers[n]);
		}
	}
	public String ringAlarm(){
		
		String sound = "BUZZ BUZZ BUZZ BUZZ BUZZ BUZZ BUZZ!";
		System.out.println("ALARM! " + sound);
		return sound;
	}
	
	public String playGame(){
		String game = "Loading game...LOADED!";
		System.out.println(game);
		return game;
	}
}