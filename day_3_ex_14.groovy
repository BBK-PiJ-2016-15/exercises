/* 
Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed by the same text in reversed order. 
For example, if the user enters the text “It was a dark and stormy night” the program must output “It was a dark and stormy nightthgin ymrots dna krad 
a saw tI”.
*/


println 'Type your text: '
String sentence = System.console().readLine()

int len_sent = sentence.length()
print sentence

for (count = 1 ; count <= len_sent ; count ++)
	print sentence.charAt(len_sent - count)

println '\n'+'Done!'