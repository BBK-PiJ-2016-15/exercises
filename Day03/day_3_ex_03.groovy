println "Type something you want to calculate"
println "Example: 12 / 2 "

String input = System.console().readLine()
len_input = input.length()


element = input.split(" ")

int num1 = Integer.parseInt(element[0])
int num2 = Integer.parseInt(element[2])

if (element[1] == "+") {
	print "The result is: "
	println num1 + num2
}
else if (element[1] == "-") {
	print "The result is: "
	println num1 - num2
}
else if (element[1] == "x" || element[1] == "*") {
	print "The result is: "
	println num1 * num2
}
else if (element[1] == ":" || element[1] == "/") {
	print "The result is: "
	println num1 / num2
}
else {
	println 'ERROR! Unrecognised operator.'
}

