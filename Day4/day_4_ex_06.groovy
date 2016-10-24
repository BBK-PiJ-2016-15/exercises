class Integer2 {
	int value;

	int getValue() {
		return value
	}
	void setValue(int z) {
		value = z
	}
	boolean isEven() {
		return value % 2 == 0 
	}
	boolean isOdd() {
		return value % 2 != 0
	}
	void prettyPrint() {
		println value
	}
	String toString() {
		return value.toString()
	}
}

// Sample code

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine(); int i = Integer.parseInt(str); i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
        println "odd.";
    } else {
println "undefined!! Your code is buggy!"; }
int parsedInt = Integer.parseInt(i2.toString()); if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine."); }

/*
int num = 45

Integer2 number = new Integer2()

number.setvalue(num)  // second task
println 'This is our integer: ' + number.getvalue() // first task 

println 'Is the number even? ' + number.iseven()
println 'Is the number odd? ' + number.isodd()
print 'That is the value of the integer: '
number.prettyprint()

println number.toString()
*/