println "Please type a number"
s = System.console()readLine()
int a = Integer.parseInt(s)


println "Please type a second number"
t = System.console()readLine()
int b = Integer.parseInt(t)


count_1 = 1
int c = a

if (b > a) {
	println 'Error! Your first number must be larger than the second one.'

}
else {
	while ((c - b) >= b){
		c = c - b

		count_1 += 1

	}
	quotient = count_1

	println a + ' divided by ' + b + ' is equal to ' + quotient + ' with a rest of ' + (c - b)	
}



