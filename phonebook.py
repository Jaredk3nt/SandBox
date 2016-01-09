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
				print "name" , line
				name = line
			else:
				number = line
				p_book[name] = number
				print "p_book : " , p_book[name]
			count = count + 1
	return p_book

#method to print any names from the list you want
def print_numbers(name_list, p_book):
	for name in name_list:
		number = p_book.get(name, "NONE")
		if(number == ):
			print (name + " : " + number)


#run body of code
p_book = create_phonebook("entries.txt")
name_list = ['sam', 'hi', 'jard', 'madz']
print_numbers(name_list, p_book)
