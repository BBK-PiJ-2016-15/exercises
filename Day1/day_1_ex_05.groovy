println "Please type a number"
s = System.console()readLine()
int a = Integer.parseInt(s)


println "Please type a second number"
t = System.console()readLine()
int b = Integer.parseInt(t)


count_1 = 0 
int c = 0

while (count_1 < b) {
	c = c + a 
	count_1 += 1
}

println a + ' x ' + b + ' = ' + c 