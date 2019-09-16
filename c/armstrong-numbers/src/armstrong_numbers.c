#include "armstrong_numbers.h"
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int isArmstrongNumber(int num);
unsigned numDigits(const unsigned n);

unsigned numDigits(const unsigned n) {
            if (n < 10) return 1;
            return 1 + numDigits(n / 10);
        }

int isArmstrongNumber(int num){
		
	int c, sum, t;
	int digitos = numDigits(num);
	char n[digitos] = num;
	sum = c = 0;

	
	printf("%s", n);

	return (num == digitos ? true : false);
}

int main(void){
	int num;
	
	scanf("%d", &num);

	printf("%d\n",isArmstrongNumber(num));
	return 0;
}

