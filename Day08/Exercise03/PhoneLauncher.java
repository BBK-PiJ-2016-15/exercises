public class PhoneLauncher {
	public static void main(String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.execute();
	}
	public void execute(){
		SmartPhone samsong = new SmartPhone("SamSong Galaxy S");
		System.out.println(samsong.getBrand());
		
		String[] numbersArray = {"232 9090872", "212 000048", "232 9010747", "600 0809212", "232 0080801"};
		String site = "https://de.hotels.com/";
		samsong.printLastNumbers(numbersArray);
		
		samsong.browseWeb(site);
		
		samsong.playGame();
		
		samsong.ringAlarm();
		
		samsong.call(numbersArray[0]);		
	}
}
