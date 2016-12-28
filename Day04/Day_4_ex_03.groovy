double power(double b, double e){
    println "Base: " + b + "  Exponent: " + e
	return Math.pow(b, e)
}
double power2(double b, double e) {
	double e2 = 2 * e 
	power(b, e2)
	}

	

int binary2decimal(String binary) {
	int len = binary.length();
	String astring;
	int value;
	int result = 0;
	for (int n = 0; n < len ;n++) {
	astring = binary.charAt(n);
	value = Integer.parseInt(astring);
	result = result + value * Math.pow(2, len - n - 1);
		}
	return result
}	
	
String decimal2binary(int number) {
	int main = number 
	int rest = 0;
	String binary = ''
	while(number>0) {
		number = number / 2
		rest = main - (number * 2)
		String piece = Integer.toString(rest)
		binary = binary + piece
		main = main / 2
	}
	int len_bin = binary.length()
	counter = 0
	String output = '';
	while(counter < len_bin){
		output = output + binary.charAt(len_bin - 1 - counter)
		counter += 1
		
	}
	return output
	}
 
println 'Type a number' 
String str = System.console().readLine()
double number1 = Double.parseDouble(str)

println 'Type a second number that will be the exponent'
String str2 = System.console().readLine()
double number2 = Double.parseDouble(str2)

println 'using the method power: '

println "" + power(number1,number2)

println 'using the method power2: '
println power2(number1, number2)

println 'Type a binary number and the programme will convert it in a decimal number '
String str3 = System.console().readLine()
println binary2decimal(str3)

println 'Type a number and the programme will convert it in binary: '
String str4 = System.console().readLine()
int num_to_binary = Double.parseDouble(str4)
println decimal2binary(num_to_binary)
