/* 
Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed by the same text in reversed order. 
For example, if the user enters the text “It was a dark and stormy night” the program must output “It was a dark and stormy nightthgin ymrots dna krad 
a saw tI”.
*/

println "Please type a word or a sentence and I will print it followed by its reverse"
String word = System.console().readLine()
int size = word.length();
String new_word = ""

for(i = 0; i < size; i ++) {
	new_word = new_word + word.charAt(size - 1 - i)
}
println word + new_word