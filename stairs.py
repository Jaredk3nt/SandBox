import sys

n = input()
lb = "#"
space = " "
for x in range (1, n + 1):
	ex = n - x
	spaces = ex * space
	lbs = lb * x
	val = spaces + lbs
	print val
