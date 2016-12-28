println "Type something"
String input = System.console()readLine()


counter = 0


for (letter in input){
	if ((letter == 'e') || (letter == 'E')){
	counter += 1
	}
}

println 'in ' + input + ' there are ' + counter + ' e.'


println "Now type something else"
String input2 = System.console()readLine()

counter2 = 0 

println "And choose a letter. "
println "I will tell you how many time that letter is contained in the string that you\'ve just typed."

String chosen_letter = System.console()readLine()
String lowercase = chosen_letter.toLowerCase()

int len_letter = chosen_letter.length()
if (len_letter > 1){
	println 'Error! You had to choose a single letter!'
}
else {
	String capital = lowercase.toUpperCase()
	for (letter in input2){
	if ((letter == lowercase) || (letter == capital)){
	counter2 += 1
	}
}
}

println 'The string you typed is: ' + input2
println 'The letter ' + chosen_letter +' is contained ' + counter2 + ' times in that string'