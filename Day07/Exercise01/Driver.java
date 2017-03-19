import java.util.List;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args){
		Supermarket firstmarket = new Supermarket();
//		Person p = new Person();
//		Person p1 = new Person();
//		Person p2 = new Person();
		
		List<Person> lst = new ArrayList<Person>();
		lst.add(new Person());
		lst.add(new Person());
		lst.add(new Person());

		System.out.println(lst);
		
//		firstmarket.addPerson(p);
//		firstmarket.addPerson(p1);
//		firstmarket.addPerson(p2);
		
		for(Person p: lst){
			firstmarket.addPerson(p);
		}
		
		System.out.println(firstmarket.servePerson());
		
	}
}