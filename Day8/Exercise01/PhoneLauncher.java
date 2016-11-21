public class PhoneLauncher {
public static void main(String[] args) {
PhoneLauncher launcher = new PhoneLauncher();
launcher.launch();
}
public void launch() {
	int[] numbersArray = {327739, 327731, 327232, 327811, 321993, 3332121, 3362214,211174,321049,3288819};
	String site = "www.google.co.uk";
	String tetris = "Tetris";
	String numberToCall = "992 2122041";
	SmartPhone MegaPhone = new SmartPhone();
	MegaPhone.printLastNumbers(numbersArray);
	MegaPhone.browseWeb(site);  
	MegaPhone.findPosition(); // from SmartPhone class
	MegaPhone.playGame(tetris);   // from MobilePhone
	MegaPhone.call(numberToCall); // from OldPhone
}
}