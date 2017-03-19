public class Supermarket {
	private PersonQueue queue = new PersonQueueImpl();
	
	void addPerson(Person p) {
		queue.insert(p);
	}
	Person servePerson(){
		return queue.retrieve();	
	}
}