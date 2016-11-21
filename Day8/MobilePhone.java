public class MobilePhone extends OldPhone {
	public void ringAlarm(String alarm) {
		System.out.println(alarm);
	}
	public void playGame(String games) {
		System.out.println(games);
	}
	public void printLastNumbers(int[] aList) {
		System.out.println("LIST OF RECENT NUMBERS");
		int list_len = aList.length;
		for(int n = 0; n < list_len; n ++) {
			System.out.println(aList[n]);
		}
	}
	
}