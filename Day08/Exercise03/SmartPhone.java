public class SmartPhone extends MobilePhone {
	void browseWeb(String site) {
		System.out.println(site);
	}
	void findPosition() {
		System.out.println("Your position is: 27.14, 91.102");
	}
	@Override
	public void call(String number){
		//super.call(number);
		int strlen = number.length();
		char a = number.charAt(0);
		char b = number.charAt(1);
		if (a == '0' && b == '0') {
			System.out.println("Calling " + number +" through the internet to save money");
		}
		else{
			super.call(number);
			//System.out.println(number);
		}
	}
	
}