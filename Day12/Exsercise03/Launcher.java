package fullName;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fullName pietro = new fullName("Pietro Mariani  Genuardi");
		
		System.out.println("The name with double spaces is: "+ pietro.fullName);
		System.out.println(pietro.getInitials(pietro.fullName));
		
		fullName sandra = new fullName("Sandra Copper Davies");
		System.out.println("The name with single spaces is: "+ sandra.fullName);
		System.out.println(sandra.getInitials(sandra.fullName));
	}

}
