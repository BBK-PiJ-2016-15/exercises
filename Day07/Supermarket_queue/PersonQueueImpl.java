public class PersonQueueImpl implements PersonQueue {
	/**
     * The array that contains the string. When full, a new one
     * is created.
     */
    private Person[] stringArray;

    /**
     * The number of strings in this stack
     */
    private int size;

    /**
     * The initial size of the array.
     * (Note: not size of stack, which starts at 0)
     */
    private static int INITIAL_ARRAY_SIZE = 5;
	
	public PersonQueueImpl() {
	  stringArray = new Person[INITIAL_ARRAY_SIZE];
	  size = 0;
    }

 	/**
	* Adds another person to the queue.
	*/
	public void insert(Person person){
	  if (isAlmostFull()) {
		reserveMoreMemory();
	  }
	  stringArray[size] = person;
	  size++;		
	}
	
	
	/**
	* Removes a person from the queue.
	*/
	public Person retrieve(){
	  if (isEmpty()) {
		return null;
	  }
	  size--;
	  Person result = stringArray[size];
	  stringArray[size] = null;
	  return result;		
	}
	
	  public boolean isEmpty() {
	  if (size == 0) {
		return true;
	  } else {
		return false;
	  }
    }
	
	 /**
     * Returns true is the size of the stack is almost
     * the same as the size of the array, false otherwise. 
     */ 
    private boolean isAlmostFull() {
	  if (stringArray.length - size < 1) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Creates a new array twice as big, copies all elements
     * from the old array into it, and then replaces the old
     * array with the new array. 
     *
     * The old array is not pointed to by anyone, so it will 
     * be disposed of by the gargabe collector.
     */
    private void reserveMoreMemory() {
	  Person[] biggerArray = new Person[size*2];
	  for (int i = 0; i < size; i++) {
		biggerArray[i] = this.stringArray[i];
	  }
	  this.stringArray = biggerArray;
    }
}