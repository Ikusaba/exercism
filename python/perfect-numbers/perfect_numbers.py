def classify(number):
	if(number < 1): 
		raise ValueError('Input value is less than 0')
	listAliquotSum = [j for j in range(1,number) if number % j == 0]
	return 'perfect' if sum(listAliquotSum) == number else 'abundant' if sum(listAliquotSum) > number else 'deficient'    
