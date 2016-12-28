public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int n) {	
		value = n;
		right = null;
		left = null;
		
		//super();
	}
	
	public void add(int newNumber) {
		System.out.println("The root is: " + value);
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
				System.out.println("New element created on the right: " + newNumber);
			} else {
				right.add(newNumber);
				System.out.println(newNumber + " added on the righthand side ");
				
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
				System.out.println("New element created on the left: " + newNumber);
			} else {
				left.add(newNumber);
				System.out.println(newNumber + "  added on the lefthand side");
				}
			
			}
	}
	public boolean contains(int number) {
		if (this.value == number) {
			return true;
		} 
		if (number > this.value) {
			if (this.right != null) {
				return this.right.contains(number);
			}else {
				return false;
			}
			
			
		} else {
			if (this.left != null) {
				return this.left.contains(number);
			} else {
				return false;
			}
		}
	
	}
	public int getMax() {
        if (right == null) {
            return this.value;
        } else {
            return right.getMax();
        }		
	}
	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMax();
		}
	}
}
