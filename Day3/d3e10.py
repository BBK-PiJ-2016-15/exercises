
print 'Type a word'
a = raw_input()
print 'Type a sentence'
b = raw_input()

counter = 0

for x in b.split():
	if a in x:
		counter = counter + 1

print a, 'is contained', counter, 'times in', b