public class PhoneLauncher {
public static void main(String[] args) {
PhoneLauncher launcher = new PhoneLauncher();
launcher.launch();
}
public void launch() {
	int[] numbersArray = {327739, 327731, 00327232, 327811, 321993, 3332121, 3362214,211174,321049,3288819};
	String site = "www.google.co.uk";
	String tetris = "Tetris";
	String numberToCall = "992 2122041";
	String second_number = "00 9912 332182";
	SmartPhone MegaPhone = new SmartPhone();
	MegaPhone.printLastNumbers(numbersArray);
	MegaPhone.browseWeb(site);  
	MegaPhone.findPosition(); // from SmartPhone class
	MegaPhone.playGame(tetris);   // from MobilePhone
	MegaPhone.call(numberToCall); // from OldPhone
	MegaPhone.call(second_number); // from OldPhone
}
}