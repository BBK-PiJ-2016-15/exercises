public class launcher {
	
	public static void main(String[] args){
		launcher the_launcher = new launcher(); // it creates an object from the class launcher
		the_launcher.launch(); // executes a method launch on the object "the_launcher"
	}
	public void launch() {
		IntegerTreeNode the_tree = new IntegerTreeNode(5);
		//int value = 7;
		
		the_tree.add(4);
		the_tree.add(21);
		the_tree.add(7);
		the_tree.add(9);
		the_tree.add(1);
		the_tree.add(51);
		
	System.out.println("Check for 7 " + the_tree.contains(7));
	System.out.println("Check for 3 " + the_tree.contains(3));
	System.out.println("\n" + "The largest number in the tree is " + the_tree.getMax());
	System.out.println("The smallest number in the tree is " + the_tree.getMin());
	}
}