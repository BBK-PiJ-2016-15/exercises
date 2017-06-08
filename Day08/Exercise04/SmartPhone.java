public class SmartPhone extends MobilePhone{
	
	public SmartPhone(String brand){
		super(brand);
	}
	
	public String findPosition(){
		String position = "x789; y 932; z 441";
		System.out.println("You are now here:" + position);
		return position;
	}
	public void browseWeb(String site){
		System.out.println("opening the url: "+ site);
	}

}
