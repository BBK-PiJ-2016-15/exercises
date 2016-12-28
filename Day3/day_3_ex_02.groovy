println "Type a number"
String n = System.console()readLine()
Double num1 = Double.parseDouble(n)
println 'Please type a second number'
String m = System.console()readLine()
Double num2 = Double.parseDouble(m)


println "Please, choose the operator"

println "In order to choose an operator, type the corresponding letter: "
println "A) +"
println "B) -"
println "C) *"
println "D) /"

String operator = System.console()readLine()

if ((operator == "A") || (operator == "a")) {
	println num1 + num2
}
else if ((operator == "B") || (operator == "b")){
	println num1 - num2
}
else if ((operator == "C") || (operator == "c")){
	println num1 * num2
}
else if ((operator == "D") || (operator == "d")){
	println num1 / num2 
}
else {
	println "Error! You had to choose one of the four options above."
	println "This programme will stop running."
}