//Write a program that reads three numbers and prints them in order, from lowest to highest.

println "Please type a number"
s = System.console()readLine()
int a = Integer.parseInt(s)


println "Please type a second number"
t = System.console()readLine()
int b = Integer.parseInt(t)


println "Please type your third and final number"
v = System.console()readLine()
int c = Integer.parseInt(v)



if (a > b){
	if (b > c) {
		if (a > c){
		println 'From the largest to the smallest:'
		println  a 
		println b
		println c   // combination I
	}
	}
	else if (b < c){
			if (a > c){
		println 'From the largest to the smallest:'
		println a
		println c
		println b  // combination II
	}
	}
}
else if (b > a){
	if (a > c){
		if (b > c){
		println 'From the largest to the smallest:'
		println b
		println a
		println c // combination III
	}
}
	else if (a < c){
		if (b > c){
		println 'From the largest to the smallest:'
		println b
		println c
		println a  // combination IV
		}
	}
else if (c > b){
	if (a > b){
		if (c > a){
		println 'From the largest to the smallest:'
		println c
		println a
		println b // combination V
		}
	}
	else if (a < b) {
		if (c > a){
		println 'From the largest to the smallest:'
		println c
		println b
		println c // combination VI
	}
	}
}
}



