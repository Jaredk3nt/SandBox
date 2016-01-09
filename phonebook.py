import sys

#based on the hackerrank problem for dictionaries

#create a dictionary phone book based on a file input
#entries.txt format should be name\n number\n repeat
def create_phonebook(file_name):
	p_book = {}
	with open(file_name, 'r') as f:
		name = ""
		number = ""
		count = 0
		for line in f:
			line = line.strip('\n')
			if (count % 2) == 0:
				name = line
			else:
				number = line
				p_book[name] = number
			count = count + 1
	return p_book

#method to print any names from the list you want
def print_numbers(name_list, p_book):
	for name in name_list:
		number = p_book.get(name, "NONE")
		if(number == "NONE"):
			print "That name is not found in the phonebook"
		else:
			print (name + " : " + number)


#run body of code
p_book = create_phonebook("entries.txt")

#command line user interaction
print "Created phonebook from entries.txt\nPlease type a name below to search (type 'end' to stop program):"
running = True
while running:
	name = input()
	if name == "end":
		running = False
	else:
		print p_book.get(name, "That name is not in the phonebook")



#test print 
name_list = ['sam', 'hi', 'jard', 'madz']
print_numbers(name_list, p_book)
