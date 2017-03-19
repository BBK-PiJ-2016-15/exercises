package fullName;

public class fullName {
	String fullName;
	
	fullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	public String getInitials(String fullName) { 
		String result = "";
		
		// in case the string contains double spaces they are reduced to a single one
		fullName = fullName.replace("  ", " ");
		
		String[] words = fullName.split(" "); 
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase(); 
			}
	      return result;
	  }
	/*
	public String getInitials(String fullName) { 
		String result = "";
		String[] words = fullName.split(" "); 
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase(); 
			}
	      return result;
	  }
	*/
}
