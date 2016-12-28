/*
Write a program that reads a short string and then some longer text. The program must say how many times you can find the short string in the text. 
You cannot use any method of String apart from charAt() and length().
*/


println "Type a word: "
String str1 = System.console().readLine()
println "Type a short sentence: "
String str2 = System.console().readLine()

counter1  = 0
counter2 = 0 
counter_words = 0

int len1 = str1.length()
char first_letter1 = str1.charAt(counter1)

int len2 = str2.length()
char first_letter2 = str2.charAt(counter2)

println len1 + ' is the first word'
println len2 + ' is the second word'


for (int i = 0 ; i < len2; i ++) {
	if (first_letter1 == first_letter2){
		counter1 +=1
		counter2 += 1

		println first_letter1 + 1
	}
}


 


/*
if (str2.contains(str1)){
	for (str2.contains(str1))
}
else {
	println 'niente'
}
*/