// It requires the cost of the ware.

println "Type the ware\'s price: ";
String str1 = System.console().readLine()
Double price = Double.parseDouble(str1);

println "The price is " + str1;

// It requires which note the user intends to submit

println "Choose the amount of note: 50, 20, 10 or 5"
String str2 = System.console().readLine()
Double notes = Double.parseDouble(str2)

// It requires which coin the user intends to submit

println "And now choose the amount of coins: 2, 1, 0.50, 0.20, 0.10, 0.05 or 0.01 "
String str3 = System.console().readLine()
Double coins = Double.parseDouble(str3)

if(price > (notes + coins)) {
	println "Your money is not enough! The price is " + price + " and you only gave " + (notes + coins) 
}
else {
	Double paid = notes + coins
	Double rest = paid - price

	Double change;
	Double[] values = [50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01];

	println "Your rest is " + rest
	int size = values.length;


	for(i = 0; i < size; i ++) {
		while(values[i] <= rest) {
			rest = rest - values[i]

			println "You get " + values[i]
			//println "The rest is now " + rest 
		} 
		if (rest == 0) {
			; 
		}
	}
	println "Please take your change"
}
