public class OldPhone implements Phone{
	public void call(String number) {
		System.out.println(number);
	}
	private String brand = null; 
	public OldPhone(String brand) {
		this.brand = brand; }
	public String getBrand() { 
		return brand;
}
	
}