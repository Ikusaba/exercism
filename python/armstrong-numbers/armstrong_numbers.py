def is_armstrong_number(number):
	numberOfDigits = len(str(abs(number)))
	listElevNums = [pow(int(j),numberOfDigits) for j in str(number)]
	return sum(listElevNums) == number
